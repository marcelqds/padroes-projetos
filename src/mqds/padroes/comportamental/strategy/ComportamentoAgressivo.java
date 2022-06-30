package mqds.padroes.comportamental.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover(){
        System.out.println("Comportamento agressivo...");
    }
}
