package modelo;

public abstract class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private double peso;
    private int quantidade;
    private int quantidadeMinima;
    private int tempoSeparacao;

    public Produto(){}

    public Produto(String nome, String descricao, double preco, double peso, int quantidade, int quantidadeMinima, int tempoSeparacao){
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
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade para reabastecer deve ser maior que zero.");
        }
        setQuantidade(quantidade + getQuantidade());
    }

    public int getCodigo() {
        return codigo;
    }


    void setCodigo(int codigo) {
        if (codigo < 1) {
            throw new IllegalArgumentException("O código do produto deve ser 1 ou maior.");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() < 3) {
            throw new IllegalArgumentException("O nome deve ter pelo menos 3 caracteres.");
        }
        this.nome = nome.trim();
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
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidade = quantidade;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        if (quantidadeMinima < 0) {
            throw new IllegalArgumentException("O estoque mínimo não pode ser negativo.");
        }
        this.quantidadeMinima = quantidadeMinima;
    }

    public int getTempoSeparacao() {
        return tempoSeparacao;
    }

    public void setTempoSeparacao(int tempoSeparacao) {
        if (tempoSeparacao <= 0) {
            throw new IllegalArgumentException("O tempo de separação deve ser maior que zero.");
        }
        this.tempoSeparacao = tempoSeparacao;
    }
}