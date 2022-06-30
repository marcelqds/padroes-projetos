package mqds.padroes.comportamental.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover(){
        System.out.println("Comportamento defensivo...");
    }
}
