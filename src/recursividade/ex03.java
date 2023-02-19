package recursividade;

import java.util.Scanner;

//Faça uma função recursiva que receba um número inteiro positivo N e exiba todos os números de 0 até N em ordem crescente

public class ex03 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe um número: ");
        num = sc.nextInt();

        System.out.println("--------------- Ordem crescente: ---------------");
        crescente(num);

        sc.close();
    }

    public static void crescente (int num){
        if (num >= 0){
           crescente(num - 1);
           System.out.println(num);
        }
    }
}
