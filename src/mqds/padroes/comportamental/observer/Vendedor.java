package mqds.padroes.comportamental.observer;

import java.util.Iterator;
import java.util.List;

public class Vendedor implements ProdutosObserver{
    private String nome;
    public Vendedor() {}
    public Vendedor(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificaVenda(Produto produto) {
        System.out.printf("Notificacao:: %s, o produto %s foi vendido\n\n ", this.getNome(), produto.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
