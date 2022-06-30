package mqds.padroes.comportamental.strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover(){
        System.out.println("Comporntamento natural");
    }
}
