package uteis;

public class ordenacao {

    public static void main(String[] args) {
        int N = 10000;
        int vet[] = new int[N];
        for (int i = 0; i < N; i++) {
            //vetor aleatorio
            vet[i] = (int) (Math.random() * (N * 2));
            
            //vetor totalmente ordenado
            //vet[i] = i;

            //vetor totalmente desordenado
            //vet[i] = N-i;
        }

        
        long inicio, fim;
        inicio = System.currentTimeMillis();
        ordenacao_simples(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritmo basico: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        ordenacao_melhorada1(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritmo melhorado 1: " + (fim - inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        ordenacao_melhorada2(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritmo melhorado 2: " + (fim - inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        selection(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritmo com selection: " + (fim - inicio) + "ms");

    }

    //ordenação simples, sem para caso o vetor ja esteja ordenado e sem desconsiderar o N - 1 
    private static void ordenacao_simples(int[] vet, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N - 1); j++) {
                if (vet[j] > vet[j + 1]) { 
                    troca(vet, j, j + 1);
                }
            }
        }

    }

    //ordenação desconsiderando o numero trocado na última passagem
    private static void ordenacao_melhorada1(int[] vet, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N - 1 - i); j++) { 
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                }
            }
        }

    }
    
    //ordena o vetor e verifica se ele ja está ordenado
    private static void ordenacao_melhorada2(int[] vet, int N) {
        boolean trocou = false;
        int i = 0;
        do{
            trocou = false; //se trocou = false, posições nao foram trocadas = vetor ordenado
            for (int j = 0; j < (N - 1 - i); j++) {
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                    trocou = true;
                }
            }
            i++;
        }while(trocou);

    }

    static void selection(int[] vet, int N) {
        for (int fixo = 0; fixo < (N - 1); fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < N; i++) {
                if (vet[i] < vet[menor]) {
                    menor = i;
                }
            }
            //trocando as posições
            if (menor != fixo) {
                int t = vet[fixo]; // aux recebe fixo
                vet[fixo] = vet[menor]; // fixo recebe menor
                vet[menor] = t; // menor recebe fixo
            }
        }
    }

    //substituindo os elementos, de acordo com o seu valor
    private static void troca(int[] vet, int a, int b) {
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
    }

}