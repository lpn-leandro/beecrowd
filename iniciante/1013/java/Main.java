import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        String valor = entrada.nextLine();
        String[] valores = valor.split(" ");
        a = Integer.parseInt(valores[0]);
        b = Integer.parseInt(valores[1]);
        c = Integer.parseInt(valores[2]);

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");
    }
}