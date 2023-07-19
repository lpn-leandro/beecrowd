import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A=0, B=0;

        A = entrada.nextInt();
        B = entrada.nextInt();

        int soma = A + B;

        System.out.println("X = " + soma);
    }   
}