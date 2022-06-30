import mqds.padroes.comportamental.strategy.*;

public class TesteStrategy {
    public static void main(String[] args){
        Robo robo = new Robo(new ComportamentoDefensivo());
        robo.mover();
        robo.mover();
        robo.mover();

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();robo.mover();
        robo.setComportamento(normal);
        robo.mover();robo.mover();
        robo.setComportamento(defensivo);

    }
}