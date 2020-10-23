package Pract2;

import java.util.Scanner;

public class Dog {
    int age,hAge;
    String name;
    Dog(int a,String n) {
        age=a;
        name=n;
    }
    int AgeInHum(){
        hAge=age*7;
        return hAge;
    }
    String ToString(){
        return ("The Dog's name is "+name+". Age: "+age+". At human ages: "+this.AgeInHum());
    }


}

class Kennel{
    int dNum;
    Dog[] dArray=new Dog[20];
    Kennel(int n){
        dNum=n;
    }
    void AddDogs(){
        String name1;
        int age1;
        Scanner inpn = new Scanner(System.in);
        Scanner inpa = new Scanner(System.in);
        for(int i = 0; i<dNum; i++){
            System.out.println("Please, input Name and Age of the dog number "+(i+1));
            name1 = inpn.nextLine();
            age1 = inpa.nextInt();
            Dog dog1 = new Dog(age1, name1);
            dArray[i] = dog1;

        }

    }
    void ShowDogs(){
        for(int i=0; i<dNum; i++){
            System.out.println(dArray[i].ToString());
        }

    }



}


class Main{
    public static void main(String[] args){
        int n;
        System.out.println("Please, input amount of dogs in the kennel");
        Scanner inp = new Scanner(System.in);
        n=inp.nextInt();
        Kennel ken = new Kennel(n);
        ken.AddDogs();
        ken.ShowDogs();

    }
}