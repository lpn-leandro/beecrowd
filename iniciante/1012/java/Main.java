import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Double[] a = new Double[1], b = new Double[1] ,c = new Double[1];

        String valores[] = new String[2];
        String valor;
        valor = entrada.nextLine();
        valores = valor.split(" ");

        a[0] = Double.parseDouble(valores[0]);
        b[0] = Double.parseDouble(valores[1]);
        c[0] = Double.parseDouble(valores[2]);

        double areaTriangulo = (a[0] * c[0]) / 2;
        double areaCirculo = 3.14159 *Math.pow(c[0], 2);
        double areaTrapezio = ((a[0] + b[0])* c[0]) / 2;
        double areaQuadrado = b[0] * b[0];
        double areaRetangulo = a[0] * b[0]; 

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",
        areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
    }
}