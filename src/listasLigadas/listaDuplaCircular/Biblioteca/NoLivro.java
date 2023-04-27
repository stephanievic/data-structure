package listasLigadas.listaDuplaCircular.Biblioteca;

public class NoLivro {
    public NoLivro proximo, anterior;
    public String autor, livro, edicao, cidade, editora;
    public int anoLancamento;

    public NoLivro (String autor, String livro, String edicao, String cidade, String editora, int anoLancamento){
        this.anterior = null;
        this.proximo = null;
        this.autor = autor;
        this.livro = livro;
        this.edicao = edicao;
        this.cidade = cidade;
        this.editora = editora;
        this.anoLancamento = anoLancamento;
    }
}
