package modelo;

public abstract class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private double peso;
    private int quantidade;
    private int quantidadeMinima;
    private int tempoSeparacao;

    public Produto(){

    }
    public Produto(nome, descricao, preco, peso, quantidade, quantidadeMinima, tempoSeparacao){
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
        setPeso(peso);
        setQuantidade(quantidade);
        setQuantidadeMinima(quantidadeMinima);
        setTempoSeparacao(tempoSeparacao);
    }

    public abstract double calcularTaxaManuseio();
    public abstract String exibirDetalhes();
    public void reabastecer(int quantidade){
        setQuantidade(quantidade + getQuantidade());
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public int getTempoSeparacao() {
        return tempoSeparacao;
    }

    public void setTempoSeparacao(int tempoSeparacao) {
        this.tempoSeparacao = tempoSeparacao;
    }
}
