package diagnostica;

//Crie um programa em que solicita ao usuário o valor de N e, posteriormente os N números que devem ser armazenados em um vetor. Em um segundo momento, exiba o vetor na ordem em que os elementos foram digitados e em ordem inversa.

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int tamanho, numero; 

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o tamanho do seu vetor: ");
        tamanho = sc.nextInt();

        int vetor [] = new int [tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.println("\nInforme o número: ");
            numero = sc.nextInt();

            vetor [i] = numero;
        }

        for (int i = 0; i < tamanho; i++){
            System.out.printf("\nNumero da posição %d do vetor: %d", i, vetor[i]);
        }

        System.out.println("\n\n-------------- Vetor invertido: ");

        for (int i = (tamanho - 1); i >= 0; i--){
            System.out.printf("\nNumero da posição %d do vetor: %d", i, vetor[i]);
        }

        sc.close();
    }
}
