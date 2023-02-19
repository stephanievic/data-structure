package diagnostica;

//Crie um método chamado Insere_Exclusivo(int vet[], int N) que alimenta um vetor de N elementos com valores aleatórios entre 1 e N sem que ocorram números repetidos. Exiba o vetor gerado.

import java.util.Arrays;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int tamanho;

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o tamanho do vetor: ");
        tamanho = sc.nextInt();

        int vetor [] = new int [tamanho];

        insereExclusivo(vetor, tamanho);
        System.out.println(Arrays.toString(vetor));

        sc.close();

    }

    public static int[] insereExclusivo (int vetor[], int tamanho){

        for (int i = 0; i < tamanho; i++){
            vetor [i] = (int)(Math.random() * tamanho);
        }
    
        for (int c = 1; c < vetor.length; c++){
            for (int j = 0; j < c; j++){
                while (vetor [c] == vetor[j]){
                    vetor [c] = (int)(Math.random() * tamanho);
                    insereExclusivo(vetor, tamanho);
                }
            }
        }

        return vetor;
    }
}
