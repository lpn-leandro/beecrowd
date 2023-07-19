/*
Preenchimento de Vetor IV

Neste problema você deverá ler /15 valores/ colocá-los em /2 vetores/ conforme estes valores /forem pares ou ímpares/. 
Só que o /tamanho/ de cada um dos dois vetores é de /5 posições/. Então, cada vez que /um dos dois vetores encher/, 
você deverá /imprimir todo o vetor/ e /utilizá-lo novamente para os próximos números que forem lidos/. 
/Terminada a leitura, deve-se imprimir o conteúdo que restou em cada um dos dois vetores/, 
imprimindo primeiro os valores do vetor impar. 
Cada vetor pode ser preenchido tantas vezes quantas for necessário.

Entrada
A entrada contém 15 números inteiros.

Saída
Imprima a saída conforme o exemplo abaixo.

Inicio: 20/01/2022 Termino: 21/01/2022
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int REPETICOES = 15;
        final int TAMANHO = 5;
        int[] impar = new int[TAMANHO];
        int[] par = new int[TAMANHO];
        int totalPar = 0, totalImpar = 0;

        for (int i = 0; i < REPETICOES; i++) {
            int aux = entrada.nextInt();

            if (aux % 2 == 0) {
                par[totalPar] = aux;
                totalPar++;

                if (totalPar == 5) {
                    totalPar = 0;
                    for (int j = 0; j < TAMANHO; j++) {
                        System.out.println("par[" + j + "]" + " = " + par[j]);
                    }
                }
            } else {
                impar[totalImpar] = aux;
                totalImpar++;

                if (totalImpar == 5) {
                    totalImpar = 0;
                    for (int j = 0; j < TAMANHO; j++) {
                        System.out.println("impar[" + j + "]" + " = " + impar[j]);
                    }
                }
            }
        }
        for (int i = 0; i < totalImpar; i++) {
            System.out.println("impar[" + i + "]" + " = " + impar[i]);
        }

        for (int i = 0; i < totalPar; i++) {
            System.out.println("par[" + i + "]" + " = " + par[i]);
        }
    }
}
