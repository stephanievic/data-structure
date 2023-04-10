package listasLigadas.listaSimples;

//codigo visto em aula

public class ListaLigada {
    

    static No inicio = null;

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {        
            inserir(i);

            int x = (int)(Math.random() * 50);

            insereOrdenado(x);
        }

        //exibir();
        for (int i = 1; i <= 10; i++) {
            removeUltimo();
        }
        exibir();
    }

    private static void exibir() {
        if (inicio == null) {
            System.out.println("Lista VAZIA, nada a exibir !");
        } else {
            No temp = inicio;
            while (temp != null) { //exibir enquanto temp não for nulo
                System.out.println(temp.valor);
                temp = temp.proximo; //tep passa a ser o valor seguinte
            }
        }
    }

    private static void inserir(int i) {
        No novo = new No(i);

        if (inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio;

            while (temp.proximo != null) { //se tiver prox posição
                temp = temp.proximo; //temp atualizado com o proximo
            }
            temp.proximo = novo; //quando o temp.proximo for nulo, vai receber o valor novo
        }
    }

    private static void removeUltimo() {
        if (inicio == null) {
            System.out.println("Lista VAZIA, impossível remover !");
        } else if (inicio.proximo == null) {
            inicio = null;
        } else {
            No temp = inicio;

            while (temp.proximo.proximo != null) {
                temp = temp.proximo;
            }

            temp.proximo = null;
        }
    }

    private static void insereOrdenado(int x) {
        No novo = new No(x);

        if (inicio == null){
            inicio = novo;
        }

        else {
            if (inicio.valor > novo.valor){
                novo.proximo = inicio;
                inicio = novo;
            }
            else {
                No temp = inicio;

                while ((temp.proximo != null) && (temp.proximo.valor < x)){
                    temp = temp.proximo;
                }

                if (temp.proximo == null){
                    temp.proximo = novo;
                }

                else {
                    novo.proximo = temp.proximo;
                    temp.proximo = novo;
                }
            }
        }
    }
}
