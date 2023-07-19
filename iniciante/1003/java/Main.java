import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = 0, b = 0;
        
        a = entrada.nextInt();
        b = entrada.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);
    }    
}