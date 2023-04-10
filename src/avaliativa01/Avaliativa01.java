package avaliativa01;

public class Avaliativa01 {
    public static void main(String[] args) {
        int vetor100[] = new int[100];
        gerarNumeros(vetor100, 100);

        int vetor5000[] = new int[5000];
        gerarNumeros(vetor5000, 5000);

        int vetor10000[] = new int[10000];
        gerarNumeros(vetor10000, 10000);

        int vetor30000[] = new int[30000];
        gerarNumeros(vetor30000, 30000);


        //Implementação dos métodos
        long inicio, fim;

        System.out.println("---------- Tempo c/ vetor com 100 elementos ----------");
        inicio = System.currentTimeMillis();
        bubbleSort(vetor100, 100);
        fim = System.currentTimeMillis();
        System.out.println("BubleSort: " + (fim - inicio) + "ms");

         inicio = System.currentTimeMillis();
        selection(vetor100, 100);
        fim = System.currentTimeMillis();
        System.out.println("Selection: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        insertionSort(vetor100);
        fim = System.currentTimeMillis();
        System.out.println("InsertionSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        heapSort(vetor100);
        fim = System.currentTimeMillis();
        System.out.println("heapSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        quickSort(vetor100, 0, 100 - 1);
        fim = System.currentTimeMillis();
        System.out.println("quickSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        mergeSort(0, 100 - 1, vetor100);
        fim = System.currentTimeMillis();
        System.out.println("mergeSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        CountingSort(vetor100);
        fim = System.currentTimeMillis();
        System.out.println("CountingSort: " + (fim - inicio) + "ms");


        System.out.println("---------- Tempo c/ vetor com 5000 elementos ----------");
        inicio = System.currentTimeMillis();
        bubbleSort(vetor5000, 5000);
        fim = System.currentTimeMillis();
        System.out.println("BubleSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        selection(vetor5000, 5000);
        fim = System.currentTimeMillis();
        System.out.println("Selection: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        insertionSort(vetor5000);
        fim = System.currentTimeMillis();
        System.out.println("InsertionSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        heapSort(vetor5000);
        fim = System.currentTimeMillis();
        System.out.println("heapSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        quickSort(vetor5000, 0, 5000 - 1);
        fim = System.currentTimeMillis();
        System.out.println("quickSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        mergeSort(0, 5000 - 1, vetor5000);
        fim = System.currentTimeMillis();
        System.out.println("mergeSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        CountingSort(vetor5000);
        fim = System.currentTimeMillis();
        System.out.println("CountingSort: " + (fim - inicio) + "ms");

        System.out.println("---------- Tempo c/ vetor com 10000 elementos ----------");
        inicio = System.currentTimeMillis();
        bubbleSort(vetor10000, 10000);
        fim = System.currentTimeMillis();
        System.out.println("BubleSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        selection(vetor10000, 10000);
        fim = System.currentTimeMillis();
        System.out.println("Selection: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        insertionSort(vetor10000);
        fim = System.currentTimeMillis();
        System.out.println("InsertionSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        heapSort(vetor10000);
        fim = System.currentTimeMillis();
        System.out.println("heapSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        quickSort(vetor10000, 0, 10000 - 1);
        fim = System.currentTimeMillis();
        System.out.println("quickSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        mergeSort(0, 10000 - 1, vetor10000);
        fim = System.currentTimeMillis();
        System.out.println("mergeSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        CountingSort(vetor10000);
        fim = System.currentTimeMillis();
        System.out.println("CountingSort: " + (fim - inicio) + "ms");


        System.out.println("---------- Tempo c/ vetor com 30000 elementos ----------");
        inicio = System.currentTimeMillis();
        bubbleSort(vetor30000, 30000);
        fim = System.currentTimeMillis();
        System.out.println("BubleSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        selection(vetor30000, 30000);
        fim = System.currentTimeMillis();
        System.out.println("Selection: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        insertionSort(vetor30000);
        fim = System.currentTimeMillis();
        System.out.println("InsertionSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        heapSort(vetor30000);
        fim = System.currentTimeMillis();
        System.out.println("heapSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        quickSort(vetor30000, 0, 30000 - 1);
        fim = System.currentTimeMillis();
        System.out.println("quickSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        mergeSort(0, 30000 - 1, vetor30000);
        fim = System.currentTimeMillis();
        System.out.println("mergeSort: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        CountingSort(vetor30000);
        fim = System.currentTimeMillis();
        System.out.println("CountingSort: " + (fim - inicio) + "ms"); 
    }

    
    public static void gerarNumeros (int vetor[], int tamanho){
        for (int i = 0; i < tamanho; i++) {
            //vetor aleatorio
            //vetor[i] = (int) (Math.random() * (tamanho * 2));
            
            //vetor totalmente ordenado
            //vetor[i] = i;

            //vetor totalmente desordenado
            vetor[i] = tamanho-i;
        }
    }

    private static void bubbleSort(int[] vet, int N) {
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

    public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;
    
        for (j = 1; j < vetor.length; j++)
        {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
          {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }
    }

    public static void heapSort(int[] vetor){
        int tamanho = vetor.length;

        int i = tamanho / 2, pai, filho, t;
        while (true){
            if (i > 0){
                i--; t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {filho++;}
                if (vetor[filho] > t){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            vetor[pai] = t;
        }
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
               int posicaoPivo = quick(vetor, inicio, fim);
               quickSort(vetor, inicio, posicaoPivo - 1);
        }
    }

    //separar -> apoio wuickSort
    private static int quick(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else {
                      int troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    //Counting sort
    public static Integer[] CountingSort(int[] vetor30000) {
	
        //encontra o maior valor em v[]	
        int maior = vetor30000[0];
        for (int i = 1; i < vetor30000.length; i++) {
            if (vetor30000[i] > maior) {
                maior = vetor30000[i];
            }
        }
                
        //conta quantas vezes cada valor de v[] aparece
        int[] c = new int[maior+1];//+1 pois se 10 for o maior valor, ele iria apenas de 0 a 9
        for (int i = 0; i < vetor30000.length; i++) {
            c[vetor30000[i]] += 1;
        }
                
        //acumula as vezes de cada elemento de v[] com os elementos anteriores a este
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }
                
        //adiciona os elementos em suas posições conforme o acumulo de suas frequencias
        Integer[] b = new Integer[vetor30000.length];
        for (int i = b.length-1; i >= 0; i--) {//percorre do fim para o inicio para manter estavel, mas não haveria problema em i = 0; i < b.lenght; i++
            b[c[vetor30000[i]] -1] = vetor30000[i];
            c[vetor30000[i]]--;
        }
        
        return b;
    }

    //mergeSort
    private static void mergeSort(int inicio, int fim, int[] vetor) {
        /* Se o inicio for menor que o fim menos 1, significa que tem elementos
              dentro do vetor. */
        if(inicio < fim - 1) {
          // Guarda a posição do meio do vetor.
          int meio = (inicio + fim) / 2;
          
          /* Chama este método recursivamente, indicando novas posições do
                  inicio e fim do vetor. */
          mergeSort(inicio, meio, vetor);
          
          /* Chama este método recursivamente, indicando novas posições do
                  inicio e fim do vetor. */
          mergeSort(meio, fim, vetor);
          
          // Chama o método que intercala os elementos do vetor.
          intercala(vetor, inicio, meio, fim);
        }
    }

    //apoio mergeSort
    private static void intercala(int[] vetor, int inicio, int meio, int fim) {
        /* Vetor utilizado para guardar os valors ordenados. */
        int novoVetor[] = new int[fim - inicio];
        /* Variavel utilizada para guardar a posicao do inicio do vetor. */
        int i = inicio;
        /* Variavel utilizada para guardar a posição do meio do vetor. */
        int m = meio;
        /* Variavel utilizada para guarda a posição onde os
          valores serão inseridos no novo vetor. */
        int pos = 0;
        
        /* Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor
          não chegar até seu fim, compara os valores entre o inicio e o meio,
          verificando em qual ordem vai guarda-los ordenado.*/
        while(i < meio && m < fim) {
          /* Se o vetor[i] for menor que o vetor[m], então guarda o valor do
            vetor[i] pois este é menor. */
          if(vetor[i] <= vetor[m]) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
          // Senão guarda o valor do vetor[m] pois este é o menor.
          } else {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
          }
        }
        
        // Adicionar no vetor os elementos que estão entre o inicio e meio,
        // que ainda não foram adicionados no vetor.
        while(i < meio) {
          novoVetor[pos] = vetor[i];
          pos = pos + 1;
          i = i + 1;
        }
        
        // Adicionar no vetor os elementos que estão entre o meio e o fim,
        // que ainda não foram adicionados no vetor.
        while(m < fim) {
          novoVetor[pos] = vetor[m];
          pos = pos + 1;
          m = m + 1;
        }
        
        // Coloca no vetor os valores já ordenados.
        for(pos = 0, i = inicio; i < fim; i++, pos++) {
          vetor[i] = novoVetor[pos];
        }
    }

    //substituindo os elementos, de acordo com o seu valor
    private static void troca(int[] vet, int a, int b) {
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
    }
}