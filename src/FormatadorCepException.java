public class FormatadorCepException {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345677");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcepition e) {
            System.out.println("O cep está incorreto");
            throw new RuntimeException(e);

        }
    }
    static String formatarCep(String cep) throws CepInvalidoExcepition{
        if (cep.length() != 8)
            throw new CepInvalidoExcepition();


            return "23.764-064";
    }
}
