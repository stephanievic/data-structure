package filas;
import java.util.Arrays;
import java.util.Scanner;

public class Fila {
    static int cabeca = 0;
    static int cauda = -1;
    static int tamanho;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o tamanho do vetor: ");
        tamanho = sc.nextInt();

        int vetor[] = new int[tamanho];

        int op;

        do {
            System.out.println("\n-------------------------------------------");
            System.out.println("1 - Inserir valor na filha");
            System.out.println("2 - Retirar valor da fila");
            System.out.println("3 - Ver a quantidade de elementos da fila");
            System.out.println("4 - Ver o vetor");
            System.out.println("5 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nInforme um valor: ");
                    int valor = sc.nextInt();
                    enfileirar(valor, vetor);
                    //System.out.println("Cauda: " + vetor[cauda]);
                break;
                
                case 2:
                    desenfilerar();
                    //System.out.println("Cabeça: " + vetor[cabeca]);
                break;
                
                case 3:
                    System.out.println("Tamanho da fila: " + tamanho(tamanho));
                break;
                
                case 4:
                    System.out.println("Vetor: " + Arrays.toString(vetor));
                break;
            }
        } while (op != 5);

        sc.close();
    }

    public static void enfileirar(int valor, int vetor[]) {
        if (!cheia(cauda)) {
            cauda++;
            vetor[cauda] = valor;
        } 
        else{
            cauda = -1;
            enfileirar(valor, vetor);
        }
    }

    public static void desenfilerar() {
        if (!cheia(cabeca)) {
            cabeca++;
        } 
        else{
            cabeca = -1;
            desenfilerar();
        }
    }

    public static boolean cheia(int n) {
        if(n == (tamanho-1)){
            return true;
        }
        return false;
    }

    public static boolean vazia(int n) {
        if (n < 0) {
            return true;
        }
        return false;
    }

    public static int tamanho(int tamanho) {
        if (cauda == -1) {
            return 0;
        } else if (cauda == cabeca) {
            return 1;
        } else{
            if (cauda > cabeca) {
                return cauda-cabeca+1; 
            } else{
                return tamanho-cabeca + cauda+1;
            }
        }
    }
}
