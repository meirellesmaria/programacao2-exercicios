public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
}

public void exibirInfo(){
    System.out.println("Nome: " +nome);
    System.out.println("Preço: " +preco);
    System.out.println("Quantidade: " + quantidade);
    System.out.println("Valor total: " +calcularValorEmEstoque());
}
public double calcularValorEmEstoque(){
    return preco * quantidade;
}
public void adicionarEstoque(int qtd){
    quantidade += qtd;
}

public void removerEstoque(int qtd){
    quantidade -= qtd;
}
public static void main(String[] args) {
    Produto p = new Produto (" arroz",3.50, 10);

    p.adicionarEstoque(10);
    p.removerEstoque(2);
    p.exibirInfo();

}

}