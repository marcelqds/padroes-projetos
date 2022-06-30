package mqds.padroes.comportamental.observer;

import java.util.HashSet;
import java.util.Set;

public class Produto {
    private String nome;
    public Produto(){}

    public Produto(String nome){
        this.nome = nome;
    }
    Set<ProdutosObserver> vendedores = new HashSet<ProdutosObserver>();

    public void vender(){
        for(ProdutosObserver vendedor : vendedores){
            vendedor.notificaVenda(this);
        }
    }

    public void adicionarObserver(ProdutosObserver vendedor){
        vendedores.add(vendedor);
    }

    public void removerObserver(ProdutosObserver vendedor){
        vendedores.remove(vendedor);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
