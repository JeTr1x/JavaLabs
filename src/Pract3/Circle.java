package Pract3;

import java.util.Scanner;

public class Circle {
    int rad;
    double length,area;

    Circle(int r){
        rad = r;
        length = 3.14 * r * 2;
        area = 3.14 * r * r;
    }
    void ChangeR(int r){
        rad = r;
        length = 3.14 * r * 2;
        area = 3.14 * r * r;
    }
    int GetR(){
        return rad;
    }
    double GetL(){
        return length;
    }
    double GetA(){
        return area;
    }


}


class CircleTest{
    public static void main(String[] args){
        Circle circle1 = new Circle(2);
        System.out.println("Radius: " + circle1.GetR() + ". Length: " + circle1.GetL() + ". Area: " + circle1.GetA() );
        Scanner inp = new Scanner(System.in);
        int r1;
        System.out.println("Input new radius");
        r1 = inp.nextInt();
        circle1.ChangeR(r1);
        System.out.println("New R,L,A: Radius: " + circle1.GetR() + ". Length: " + circle1.GetL() + ". Area: " + circle1.GetA());


    }
}