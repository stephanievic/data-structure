package recursividade;

import java.util.Arrays;

//Escreva uma função recursiva que retorne o menor elemento de um vetor

public class ex06 {
    public static void main(String[] args) {
        int vetor [] = new int [5];

        for (int i = 0; i < 5; i++){
            vetor [i] = (int)(Math.random() * 50);
        }

        System.out.println("Vetor gerado: " + Arrays.toString(vetor));
        System.out.println("Menor número do vetor: " + menorElemento(vetor, 5, 0));
    }

    public static int menorElemento (int vetor[], int tamanho, int i){
        if (tamanho > 0){
            if (vetor[tamanho - 1] < vetor [i]){ // se vetor na ultima posição MENOR q vetor[0] (1º)
                return menorElemento(vetor, tamanho - 1, tamanho - 1); //roda novamente a função, agr comparando o tamanho - 1 com a ultima posição do vetor
            }
            else return menorElemento(vetor, tamanho - 1, i); //se nao for menor, ele roda a função com tamanho -1, mas com o indice inicial
        }
        else return vetor[i]; // base -> se for menor igua a 0, retorna i
    }
}
