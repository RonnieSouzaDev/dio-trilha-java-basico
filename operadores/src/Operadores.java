public class Operadores {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("Operadores em Java");
        System.out.println("==========================================");
        System.out.println("==========================================");
        System.out.println("==========================================");


        // Aula 1 - Operadores Aritmeticos e de Concatenacao
        System.out.println("Operadores Aritmeticos e de Concatenacao");
        System.out.println("==========================================");

        double soma = 10.5 + 2.5;
        int subtracao = 10 - 2;
        int multiplicacao = 10 * 2;
        double divisao = 10.0 / 2.0;
        int modulo = 10 % 3;
        double resultado = 10 + 2 * 3 - (4.5 / 2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Modulo: " + modulo);
        System.out.println("Resultado: " + resultado);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("Nome Completo: " + nomeCompleto);

        String contatenacao = "?";
        System.out.println("Contatenacao: " + contatenacao);

        contatenacao = 1 + 1 + 1 + "1";
        System.out.println("Contatenacao com numeros: " + contatenacao);

        contatenacao = "1" + 1 + 1 + 1;
        System.out.println("Contatenacao com string: " + contatenacao);

        contatenacao = 1 + "1" + 1 + 1;
        System.out.println("Contatenacao com string e numeros: " + contatenacao);

        contatenacao = "1" + (1 + 1 + 1 + 1);
        System.out.println("Contatenacao com string e expressao: " + contatenacao);

        // Aula 2 - Operadores incremento, decremento, atribuição e lógicos
        System.out.println("==========================================");
        System.out.println("Operadores de incremento, decremento, atribuição e lógicos");
        System.out.println("==========================================");

        int numero = 10;
        System.out.println(-numero);
        numero = -numero;
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);

        numero++;
        System.out.println("Incremento: " + numero);
        numero--;
        System.out.println("Decremento: " + numero);
        numero += 10; // numero = numero + 10
        System.out.println("Adicao: " + numero);
        numero -= 5; // numero = numero - 5
        System.out.println("Subtracao: " + numero);
        numero *= 2; // numero = numero * 2
        System.out.println("Multiplicacao: " + numero);
        numero /= 2; // numero = numero / 2
        System.out.println("Divisao: " + numero);

        System.out.println("numero atual: " + numero);
        System.out.println(numero++);

        System.out.println("numero apos pos incremento: " + numero);
        System.out.println(++numero);
        System.out.println("numero apos pre incremento: " + numero);

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
        System.out.println("Negação do verdadeiro: " + !verdadeiro);
        System.out.println("Negação do falso: " + !falso);
        System.out.println("Verdadeiro e Falso: " + (verdadeiro && falso));
        System.out.println("Verdadeiro ou Falso: " + (verdadeiro || falso));
        System.out.println("Verdadeiro ou Verdadeiro: " + (verdadeiro || verdadeiro));
        System.out.println("Falso e Falso: " + (falso && falso));

        // Aula 3 - Condição ternária
        System.out.println("==========================================");
        System.out.println("Condição    Ternária");
        System.out.println("==========================================");

        int a = 10;
        int b = 20;

        if (a == b) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }

        String resultadoCondicional = (a == b) ? "verdadeiro" : "falso";
        System.out.println("Resultado Condicional ternario: " + resultadoCondicional);

        // Aula 4 - Operadores Relacionais
        System.out.println("==========================================");
        System.out.println("Operadores Relacionais");
        System.out.println("==========================================");
        //== igualdade
        //!= desigualdade
        //> maior que
        //< menor que
        //>= maior ou igual
        //<= menor ou igual

        int numero1 = 10;
        int numero2 = 20;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? " + simNao);

        String nomeUm = "JAVA";
        String nomeDois = new String("JAVA");

        simNao = nomeUm == nomeDois;
        System.out.println("nomeUm é igual a nomeDois? " + simNao);
        simNao = nomeUm.equals(nomeDois);
        System.out.println("nomeUm é igual a nomeDois? (usando equals) " + simNao);

        // Aula 5 - Operadores logicos
        System.out.println("==========================================");
        System.out.println("Operadores Lógicos");
        System.out.println("==========================================");
        // && (AND) - retorna verdadeiro se ambos os operandos forem verdadeiros
        // || (OR) - retorna verdadeiro se pelo menos um dos operandos for verdadeiro
        // ! (NOT) - inverte o valor lógico do operando
        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean resultadoLogico;

        resultadoLogico = (condicao1 && condicao2);
        System.out.println("Condicao1 AND Condicao2: " + resultadoLogico);

        resultadoLogico = (condicao1 || condicao2);
        System.out.println("Condicao1 OR Condicao2: " + resultadoLogico);

        resultadoLogico = !condicao1;
        System.out.println("NOT Condicao1: " + resultadoLogico);

        resultadoLogico = !condicao2;
        System.out.println("NOT Condicao2: " + resultadoLogico);
        System.out.println("==========================================");

        System.out.println("Fim dos Operadores em Java");
        System.out.println("==========================================");
    }
}
