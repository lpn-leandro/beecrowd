import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int distanciaPercorrida;
        double totalCombustivelGasto;

        distanciaPercorrida = entrada.nextInt();
        totalCombustivelGasto = entrada.nextDouble();

        double consumoMedio = distanciaPercorrida / totalCombustivelGasto;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}