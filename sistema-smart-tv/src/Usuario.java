public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual? "+smartTv.canal);

        smartTv.mudarCanal(10);

        System.out.println("Canal atual? "+smartTv.canal);

        System.out.println("Volume atual: "+smartTv.volume);

        System.out.println("-------------");
       
    }
}
