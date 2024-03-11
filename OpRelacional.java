package Aula3;
import java.util.Scanner;

public class OpRelacional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");

        int x = sc.nextInt(); 

        System.out.println(x == 5);
        System.out.println(x != 5);
        System.out.println(x > 10);
        System.out.println(x < 10);
        System.out.println(x >= 10);
        System.out.println(x <= 10);

        System.out.println(x <= 15 && x == 10);
        System.out.println(x > 0 && x != 6);
        System.out.println(x <= 15 && x == 10 && x != 6);
        
        System.out.println(x <= 15 || x == 10);
        System.out.println(x < 0 || x != 5);
        System.out.println(x <= 0 || x != 5 || x > 3);
        
        System.out.println(!(x == 5));
        System.out.println(!(x < 5));
        System.out.println(!(x > 0 && x != 6));
        System.out.println(!(x < 0 || x != 6));
        
        sc.close();
    }
}