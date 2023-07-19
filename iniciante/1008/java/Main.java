import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int idFuncionario, horasTrabalhadas;
        double valorPorHora, salario;

        idFuncionario = entrada.nextInt();
        horasTrabalhadas = entrada.nextInt();
        valorPorHora = entrada.nextDouble();

        salario = valorPorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",idFuncionario, salario);
    }
}