package listasLigadas.listaDuplaCircular.Biblioteca;

import java.util.Scanner;

public class Biblioteca {
    static NoLivro inicio = null;
    
    public static void main(String[] args) {
        cadastrarLivro("LORENZI, F.; MATTOS, P. N.; CARVALHO, T. P."," Estruturas de dados","1ª edição","São Paulo","Thomson Learning",2007);
        cadastrarLivro("PEREIRA, S. L.","Estrutura de dados fundamentais: conceitos e aplicações","12ª edição","São Paulo","Érica",2008);
        cadastrarLivro("LAFORE, R.","Estrutura de dados & algoritmos em java","1ª edição","Rio de Janeiro","Ciência Moderna",2004);
        cadastrarLivro("SZWARCFITER, J. L.; MARKENZON, L.","Estruturas de dados e seus algoritmos","3ª edição","Rio de Janeiro","LTC",2010);
        cadastrarLivro("PREISS, B. R.","Estruturas de dados e algoritmos: pradrões de projetos orientados a objeto com java","1ª edição","Rio de Janeiro","Elsevier",2000);
        cadastrarLivro("WIRTH, N.","Algoritmos e estruturas de dados","1ª edição","Rio de Janeiro","LTC",2008);
        cadastrarLivro("CELES, W. ; CERQUEIRA, R.; RANGEL, J. L.","Introdução a estruturas de dados com técnicas de programação em C","1ª edição","Rio de Janeiro","Elsevier",2004);
        cadastrarLivro("GUIMARÃES, Â. M.; LAGES, N. A. C.","Algoritmos e estruturas de dados","1ª edição","Rio de Janeiro","LTC",2008);
        
        
        Scanner sc = new Scanner(System.in);
        
        String opcao;

        // INFORMAÇÕES SIMPLES DO PRIMEIRO LIVRO ANTES DE ENTRAR NO MENU
        NoLivro temp = inicio;

        exibirLivro (temp, "i");

        do{
            System.out.print("\nInforme a opção desejada:\n" + "\"A\" para avançar\n" + "\"R\" para retroceder\n" + "\"D\" para detalhar\n" + "\"S\" para sair\n" + "ESCOLHA:");
            opcao = sc.nextLine();
            
            if(opcao.equals("A")){
                temp = temp.proximo;
                exibirLivro(temp, opcao);
                
            }
            else if(opcao.equals("R")){
                temp = temp.anterior;
                exibirLivro(temp, opcao);
            }
            else if(opcao.equals("D")){
                exibirLivro(temp, opcao);
            }

        } while(!opcao.equals("S"));
        
        sc.close();
    }

    public static void cadastrarLivro(String autor, String livro, String edicao, String cidade, String editora, int anoLancamento) {
        NoLivro novoLivro = new NoLivro(autor, livro, edicao, cidade, editora, anoLancamento);

        if(inicio == null){ //adicionando 1o livro
            novoLivro.proximo = novoLivro;
            novoLivro.anterior = novoLivro;
            inicio = novoLivro;
        }
        else{ //se já houver livro(s)
            novoLivro.proximo = inicio;
            novoLivro.anterior = inicio.anterior;
            inicio.anterior.proximo = novoLivro;
            inicio.anterior = novoLivro;
        }
    }

    public static void exibirLivro(NoLivro livro, String opcao) {
        if (opcao.equals("i") || opcao.equals("A") || opcao.equals("R")){
            System.out.println("\n----------------- LIVRO ATUAL -----------------");
            System.out.println("Título: " + livro.livro);
            System.out.println("Autor: " + livro.autor);
        }
        else {
            System.out.println("\n----------------- LIVRO ATUAL -----------------");
            System.out.println("Título: " + livro.livro);
            System.out.println("Autor: " + livro.autor);
            System.out.println("Edição: " + livro.edicao);
            System.out.println("Cidade: " + livro.cidade);
            System.out.println("Editora: " + livro.editora);
            System.out.println("Ano de lançamento: " + livro.anoLancamento);
        }
    }
}
