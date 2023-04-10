package listasLigadas.listaCircular;

public class ListaCircular {
    static No inicio = null;
    static No fim = null;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            inserir(i);
        }

        exibir();

        remover (8);
        remover(0);

        exibir();
    }

    private static void inserir (int x){
        No novo = new No (x);

        if (inicio == null){
            inicio = fim = novo; //fim recebe novo, inicio recebe fim -> adicionado 1º elemento
        }

        else {
            fim.proximo = novo;
            fim = fim.proximo; //adicionando no final da lista
        }

        fim.proximo = inicio; //após o ultimo item, volta para o começo
    }

    private static void exibir (){
        if (inicio == null){
            System.out.println("A lista está vazia, não é possivel exibir.");
        }

        else {
            System.out.print("\n" + inicio.valor);
            No temp = inicio.proximo; //exibe o 1º e depois muda pro proximo atraves da temporaria

            while (temp != inicio){
                System.out.print(temp.valor);
                temp = temp.proximo; //muda para valor seguinte ate não entrar mais no laço (lista percorrida)
            }
        }
    }

    private static void remover(int x) {
        if (inicio == null){
            System.out.println("Lista vazia");
        }
        else {
            if (inicio.valor == x){
                //se o valor a ser removido for inicio, e se ele for o unico da lista:
                if (inicio.proximo == inicio){
                    inicio = fim = null; 
                }
                else {
                    //se nao for o unico da lista,  prox valor se torna o inicio
                    inicio = inicio.proximo;
                    fim.proximo = inicio;
                }
            }

            else { //se o nó a ser removido não for o inicio
                No temp = inicio;

                while ((temp.proximo != inicio) && (temp.proximo.valor != x)){
                    temp = temp.proximo;
                }

                if (temp.proximo == inicio){
                    //se verdadeiro, então toda a lista já foi percorrida
                    System.out.println("Nó com valor de " + x + "não foi encontrado.");
                }
                else {
                    if (temp.proximo == fim){
                        fim = temp;
                    }
                    temp.proximo = temp.proximo.proximo;
                }

            }
        }
    }
}
