import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double[] x = new double[2], y = new double[2];
        
        for(int i = 0; i < 2; i++){
            String valor = entrada.nextLine();
            String[] valores = valor.split(" ");
            x[i] = Double.parseDouble(valores[0]);
            y[i] = Double.parseDouble(valores[1]);
        }

        double distancia = Math.sqrt(Math.pow((x[1] + x[0]), 2) + Math.pow((y[1] - y[1]), 2));

        System.out.printf("%.4f", distancia);
    }
}