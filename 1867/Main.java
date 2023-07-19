import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int N = 0, M = 0;
        String aux1, aux2;

        String aux = entrada.nextLine();

            String[] entradas = aux.split(" ");
            aux1 = entradas[0];
            aux2 = entradas[1]; 
        //aux1 = entrada.nextLine();
        //aux2 = entrada.nextLine();

        // N = entrada.nextInt();
        // M = entrada.nextInt();

        // aux1 = Integer.toString(N);
        // aux2 = Integer.toString(M);

        // while repete 2 vezes, o correto seria fazer dentro de um método 
         do{
            N = 0;
            for (int i = 0; i < aux1.length(); i++) {
                N += Integer.parseInt(aux1.substring(i, i + 1));
            }
            aux1 = Integer.toString(N);
        }while (aux1.length() > 1);

        do{
            M = 0;  
            for (int i = 0; i < aux2.length(); i++) {
                M += Integer.parseInt(aux2.substring(i, i + 1));
            }
            aux2 = Integer.toString(M);
        }while (aux2.length() > 1);

        if(0 <= N && N <= Math.pow(10, 100) && 0 <= M && M <= Math.pow(10, 100) || (N < 10 && M < 10)){
            if (N > M) {
                System.out.println("1");
            } else if (N < M) {
                System.out.println("2");
            }
        } else {
            System.out.println("0");
        }
    }
}