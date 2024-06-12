package LabPadroesProjetoJavaStrategy;

public class Test {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(normal);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();

       

           
    }

}
