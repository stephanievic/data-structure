package recursividade;

import java.util.Scanner;

//Crie uma função recursiva que retorne a soma dos elementos de um vetor de N inteiros 

public class ex05 {
    public static void main(String[] args) {
        int tamanho, elemento;

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o tamanho do vetor: ");
        tamanho = sc.nextInt();

        int vetor [] = new int [tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.println("Informe um número: ");
            elemento = sc.nextInt();

            vetor [i] = elemento;
        }

        System.out.println("Soma dos elementos: " + soma (vetor, tamanho));

        sc.close();
    }

    public static int soma (int vetor[], int tamanho){
        if (tamanho == 0){
            return 0;
        }
        else {
            return vetor [tamanho - 1] + soma(vetor, tamanho-1);
        }
        
    }
}
