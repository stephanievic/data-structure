package recursividade;

import java.util.Scanner;

//Escreva um método recursivo Dec2Bin(int n) que dado um número decimal exiba sua representação binária corretamente

public class ex07 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe um númreo: ");
        num = sc.nextInt();

        System.out.print("Número em representação binária: ");
        Dec2Bin(num);

        sc.close();
    }

    public static void Dec2Bin(int num){
        if (num > 0){ // entra na função -> se num maior que 0
            Dec2Bin(num/2); //chama função novamente, dividindo num por 2
            System.out.print(num % 2); //vai começar a fazer o print de num % 2
        }
        else {
            System.out.print(0); //em determinado momento, num = 0
        }
    }
}
