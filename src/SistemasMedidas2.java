public class SistemasMedidas2 {
    public static void main(String[] args) {
        String sigla = "G";
        switch (sigla ) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }

            case "G":{
                System.out.println("Grande");
                break;
            }

            case "GG":{
                System.out.println("Extra Grande");
                break;
            }
            default:
                System.out.println("Indefinido");

        }
    }
}
