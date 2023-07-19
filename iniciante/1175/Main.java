/*
Troca em Vetor I
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, 
o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada:
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída:
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.

Exemplo de Entrada:
0
-5
...
63
230

Exemplo de Saída
N[0] = 230
N[1] = 63
...
N[18] = -5
N[19] = 0
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        final int TAMANHO = 20;
        int[] N = new int[TAMANHO];
        int[] aux = new int[TAMANHO];

        for(int i = 0; i < TAMANHO; i++){
            N[i] = entrada.nextInt();
        }

        for(int i = 0; i < 10; i++){
             aux[i] = N[i]; // 0 = 0
             N[i] = N[(TAMANHO - 1) - i];//0 = 20-0
             N[(TAMANHO - 1)- i] = aux[i];//20-0 = 0
        }

        for(int i=0; i < TAMANHO; i++){
            System.out.println("N[" + i + "]" + " = " + N[i]);
        }
    }
}