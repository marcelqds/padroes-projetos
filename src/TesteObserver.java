import mqds.padroes.comportamental.observer.*;

public class TesteObserver {
    public static void main(String[] args) {

        // ==================== Observadores ===============

        Produto arrozObservado = new Produto("Arroz");
        Produto feijaoObservado = new Produto("Feijão");
        Produto bananaObservado = new Produto("Banana");

        ProdutosObserver vend1 = new Vendedor("Alex");
        ProdutosObserver vend2 = new Vendedor("João");
        ProdutosObserver vend3 = new Vendedor("Bruno");
        ProdutosObserver vend4 = new Vendedor("Amanda");

        arrozObservado.adicionarObserver(vend1);
        arrozObservado.adicionarObserver(vend4);

        feijaoObservado.adicionarObserver(vend1);
        feijaoObservado.adicionarObserver(vend2);
        feijaoObservado.adicionarObserver(vend3);
        feijaoObservado.adicionarObserver(vend4);
        bananaObservado.adicionarObserver(vend1);
        bananaObservado.adicionarObserver(vend2);
        bananaObservado.adicionarObserver(vend3);

        feijaoObservado.vender();

        arrozObservado.vender();
        bananaObservado.vender();

        bananaObservado.vender();
    }
}