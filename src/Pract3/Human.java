package Pract3;

import java.util.Scanner;

public class Human {
    String name;

    Human(String n){
        name = n;
    }
    void AddNShowParts(){
        System.out.println("Input head shape & size, hair style & color of " + name);
        String sh, size, style, color;
        Scanner inp = new Scanner(System.in);
        sh = inp.nextLine();
        size = inp.nextLine();
        style = inp.nextLine();
        color = inp.nextLine();
        Head head1 = new Head(sh, size, style, color);
        System.out.println("Input hand length & size of " + name);
        String hL, hS;
        hL = inp.nextLine();
        hS = inp.nextLine();
        Hand hand1 = new Hand(hL, hS);
        System.out.println("Input leg length & size of " + name);
        String lL;
        int lS;
        lL = inp.nextLine();
        lS = inp.nextInt();
        Leg leg1 = new Leg(lL,lS);
        System.out.println("Do you want to change hair style of " + name + " (write: yes or no)");
        String answer;
        Scanner ans = new Scanner(System.in);
        answer = ans.nextLine();
        if(answer.equals("yes")){
            System.out.println("Input new hair style ");
            head1.ChangeHairSt(ans.nextLine());
        }
        System.out.println("Do you want to change hair color of " + name + " (write: yes or no)");
        answer = ans.nextLine();
        if(answer.equals("yes")){
            System.out.println("Input new hair color ");
            head1.ChangeHairCol(ans.nextLine());
        }

        System.out.println("Name:  " + name);
        System.out.println("  Head:");
        System.out.println("    Shape: " + head1.getShape());
        System.out.println("    Size: " + head1.getHeadSize());
        System.out.println("    Hair Style: " + head1.getHairStyle());
        System.out.println("    Hair Color: " + head1.getHairColor());
        System.out.println("  Hand:");
        System.out.println("    Length: " + hand1.gethLength());
        System.out.println("    Size: " + hand1.gethSize());
        System.out.println("  Leg:");
        System.out.println("    Length: " + leg1.getlLength());
        System.out.println("    Foot Size: " + leg1.getfSize());
    }

}

class Head{
    String shape, headSize, hairStyle, hairColor;
    Head(String sh, String hS, String hSt, String hC ){
        shape = sh;
        headSize = hS;
        hairStyle = hSt;
        hairColor = hC;
    }
    void ChangeHairSt(String newSt){
        hairStyle = newSt;
    }
    void ChangeHairCol(String newC){
        hairColor = newC;
    }
    String getShape(){
        return shape;
    }
    String getHeadSize(){
        return headSize;
    }

    String getHairStyle(){
        return  hairStyle;
    }
    String getHairColor(){
        return hairColor;
    }



}

class Hand{
    String hLength, hSize;
    Hand(String hL, String hS){
        hLength = hL;
        hSize = hS;
    }
    String gethLength(){
        return hLength;
    }
    String gethSize(){
        return hSize;
    }



}

class Leg{
    String lLength;
    int fSize;
    Leg(String lL, int fS){
        lLength = lL;
        fSize = fS;
    }
    String getlLength(){
        return lLength;
    }
    int getfSize(){
        return fSize;
    }




}


class HumanTest {
    public static void main(String[] args){
        Scanner minp = new Scanner(System.in);
        String name = minp.nextLine();
        Human human1 = new Human(name);
        human1.AddNShowParts();

    }


}