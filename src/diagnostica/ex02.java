package diagnostica;

//Crie um programa em JAVA que solicita ao usuário o valor de N e, posteriormente, alimente o vetor com valores aleatórios entre 0 e M (M também é informado pelo usuário). Exiba o vetor gerado.

import java.util.Arrays;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int tamanhoVetor, numerosVetor, i;

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o tamanho do vetor: ");
        tamanhoVetor = sc.nextInt();

        int vetor [] = new int [tamanhoVetor];

        System.out.println("Informe outro número: ");
        numerosVetor = sc.nextInt();

        for (i = 0; i < tamanhoVetor; i++){
            vetor [i] = (int)(Math.random() * numerosVetor);
        }

        System.out.println("Vetor gerado: " + Arrays.toString(vetor));
        
        sc.close();
    }
}
