import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double raio, volume;
        final double PI = 3.14159;

        raio = entrada.nextDouble();

        volume = (4.0/3) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}