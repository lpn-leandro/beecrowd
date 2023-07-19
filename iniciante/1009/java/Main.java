import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nome;
        double salarioFixo, totalVendas, salarioTotal;

        nome = entrada.nextLine();
        salarioFixo = entrada.nextDouble();
        totalVendas = entrada.nextDouble();

        salarioTotal = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
    }
}