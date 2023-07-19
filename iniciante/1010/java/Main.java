import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String peca;
        double[] valor = new double[2]; 
        double total = 0;
        int[] idPecas = new int[2], qtdPecas = new int[2];


        for(int i = 0; i < 2; i++){
            peca = entrada.nextLine();
            String[] pecas = peca.split(" ");
            idPecas[i] = Integer.parseInt(pecas[0]);
            qtdPecas[i] = Integer.parseInt(pecas[1]); 
            valor[i] = Double.parseDouble(pecas[2]);
        }

        for(int i = 0; i < 2; i++){
            total += qtdPecas[i] * valor[i];
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }    
}