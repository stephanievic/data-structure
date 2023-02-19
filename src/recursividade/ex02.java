package recursividade;

import java.util.Scanner;

//Implemente, de forma recursiva, uma função int pot(int x, int n) que, dados dois números inteiros x e n, calcula o valor de x^n

public class ex02 {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner (System.in);

        System.out.println("informe a base: ");
        x = sc.nextInt();

        System.out.println("Informe o expoente: ");
        y = sc.nextInt();

        System.out.println("Resultado: " + pot (x, y));

        sc.close();
    }

    public static int pot (int x, int y){
        if (y == 0){
            return 1;
        }
        else {
            return x * pot(x, y - 1); // se x = 5 -> faz o resultado 5*0=5 e vai substituindo o segundo fator da multiplicação de acordo com o resultado da multiplicação anterior            
        }
    }
}
