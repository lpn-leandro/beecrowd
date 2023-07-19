import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
            double a, b, media;

            a = entrada.nextDouble();
            b = entrada.nextDouble();

            media = ((a * 3.5) + (b * 7.5)) / 11;

            System.out.printf("MEDIA = %.5f\n", media);
    }    
}
