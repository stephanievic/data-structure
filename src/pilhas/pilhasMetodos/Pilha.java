package pilhas.pilhasMetodos;

public class Pilha {
    static int topo;
    static int tamanho;
    static int vetor [] = new int [100];
   
    Pilha () {
        topo = -1; //define que a pilha começa estando vazia
    }

    public static void empilhar (int valor){
        topo++;
        vetor[topo] = valor;
    }

    public static void desempilhar() {
        topo--;
    }

    public static int tamanho() {
        return tamanho + 1;
    }

    public static int topo() {
        return vetor[topo];
    }

    public static boolean cheia () {
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
