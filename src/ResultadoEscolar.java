public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 5.6;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5.5 && nota < 7.0) //True or False
            System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");

    }
}
