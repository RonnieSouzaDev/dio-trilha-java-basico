import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/

        selecaoCandidatos();

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"LUCAS", "GABRIEL", "RAFAEL", "MATHEUS", "BRUNO", "FELIPE", "LEONARDO", "GUSTAVO",
                "THIAGO", "ANDRÉ", "CAIO", "HENRIQUE", "RODRIGO", "VINÍCIUS", "DIEGO", "MARCOS", "JOÃO", "PEDRO",
                "DANIEL", "EDUARDO", "FERNANDO", "MARCELO", "RICARDO", "SAMUEL", "GUILHERME"};

        String [] candidatosSelecionadosNomes = new String[5];

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato: " + candidato + " solicitou salario de R$: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato: " + candidato + " selecionado.");
                candidatosSelecionadosNomes[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }

        System.out.println("CANDIDATOS SELECIONADOS");
        System.out.println(Arrays.toString(candidatosSelecionadosNomes));
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}