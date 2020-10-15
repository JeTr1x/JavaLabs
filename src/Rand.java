import java.util.Random;

public class Rand {
    int rArr1[]=new int[10];

    void rand1()
    {
        for(int i = 0; i < 10; i++){
            rArr1[i]=(int)(Math.random()*66);
        }


    }

    void rand2()
    {
        Random rando = new Random();
        rando.nextInt();
        for(int i = 0; i < 10; i++){
            rArr1[i]=rando.nextInt(255);
        }

    }

    void output()
    {

        for(int i = 0; i < 10; i++){
            System.out.print(rArr1[i]+" ");
        }
        System.out.println();

    }

    void sort()
    {
        int temp;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(rArr1[j]>rArr1[i]){
                    temp=rArr1[i];
                    rArr1[i]=rArr1[j];
                    rArr1[j]=temp;
                }

            }
        }

    }



}

class RandApp {
    public static void main(String[] args) {
        Rand rand = new Rand();
        rand.rand1();
        rand.output();
        rand.sort();
        rand.output();


    }
}