public class TiposVariaveis {
    public static void main(String[] args) {

        int numero = 5;
        float decimal = 5.5f;
        char letra = 'A';
        boolean verdadeiro = true;
        String texto = "Olá, Mundo!";
        long grandeNumero = 100000L;
        double salario = 2500.75;

        System.out.println(numero);
        System.out.println(decimal);
        System.out.println(letra);
        System.out.println(verdadeiro);
        System.out.println(texto);
        System.out.println(grandeNumero);
        System.out.println(salario);

        short numeroPequeno = 10;
        int numeroNormal = numeroPequeno;
        short numeroCurto = (short) numeroNormal;
        numero = 10;

        System.out.println(numero);
        System.out.println(numeroPequeno);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto);

        final double VALOR_DE_PI = 3.14159;
        System.out.println("Valor de PI: " + VALOR_DE_PI);
    }
}
