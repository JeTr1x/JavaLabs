package Pract1;

public class First {
    int sumf = 0;
    int sumw = 0;
    int sumdw = 0;
    void Summ(int[] mass){
        int i = 0;
        for(i=0;i< mass.length;i++){
            sumf = sumf + mass[i];
        }
        System.out.println(sumf);
        i = 0;
        while (i < mass.length){
            sumw = sumw + mass[i];
            i++;
        }
        System.out.println(sumw);
        i=0;
        do{
            sumdw = sumdw + mass[i];
            i++;
        } while(i< mass.length);
        System.out.println(sumdw);
    }


}


class App{
    public static void main(String[] args) {
        int[] mass = { 5, 7, 8, 9, 13, 25, 67};
        First first = new First();
        first.Summ(mass);

    }
}