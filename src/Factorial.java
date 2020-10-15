import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt(), fact = 1;
        for (int i = 1; i <= n1; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }

}
