package recursividade;

import java.util.Scanner;

//Crie uma função recursiva int soma(int) que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N

public class ex01 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe um número inteiro positivo: ");
        n = sc.nextInt();

        System.out.println(soma (n));  

        sc.close();
    }

    public static int soma(int n) {

        if (n == 0){
            return 0; //se n for 0, retorna 0
        }
        else {
            return n + soma (n - 1); // chega no 4+1 = 5, e depois vai subindo e substituindo n-> 5 + 2 =7, 7 + 3 = 10 
        }

    }
}
