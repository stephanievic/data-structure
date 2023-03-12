package pilhas;

import java.util.Scanner;

public class Pilha {
    public static int topo = -1;

    public static void main(String[] args) {
        int op, valor, tamanho;

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe a capacidade/tamanho do vetor: ");
        tamanho = sc.nextInt();

        int vetor [] = new int [tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.println("Informe um valor para adicionar na pilha: ");
            valor = sc.nextInt();
            empilhar(vetor, valor);
        }
    
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mostrar tamanho do vetor");
            System.out.println("2 = Mostrar valor do topo do vetor");
            System.out.println("3 - Tirar elementos do vetor");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (vazia() == true){
                        System.out.println("Pilha vazia.");
                    }
                    else{
                        System.out.println("Tamanho: " + tamanho());
                    }  
                break;
                
                case 2:
                    if (vazia() == true){
                        System.out.println("Pilha vazia.");
                    }
                    else{
                        System.out.println("Topo: " + topo(vetor));
                    }
                break;
                
                case 3:
                    desempilhar();
                    System.out.println("Você tirou um elemento da pilha.");
                break;
            }

            System.out.println("Deseja fazer mais uma operação? 1 para SIM | 0 para NÃO");
            op = sc.nextInt();
        } while (op == 1);

        sc.close();
    }

    public static void empilhar (int[] vetor, int valor){
        topo++;
        vetor[topo] = valor;
    }

    public static void desempilhar() {
        topo--;
    }

    public static int tamanho() {
        return topo + 1;
    }

    public static int topo(int vetor []) {
        return vetor[topo];
    }

    public static boolean cheia (int tamanho) {
        if (topo == (tamanho - 1)){ //se topo = tamanho - 1, então está cheia (na ultima posição do vetor)
            return true;
        }
        else return false;
    }

    public static boolean vazia (){
        if (topo == -1){ 
            return true;
        }
        else return false;
    }
}
