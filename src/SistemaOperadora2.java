public class SistemaOperadora2 {
    public static void main(String[] args) {
        String plano = "A";

        switch (plano){
            case "P":{
                System.out.println("Ligações Grátis");
            }
            case "M":{
                System.out.println("Ligações Grátis, 10GB Internet Grátis");
            }
            case "G":{
                System.out.println("Ligações Grátis, 10GB Internet, Spotify, Youtube Grátis");
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
