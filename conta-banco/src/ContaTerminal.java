import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuario

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        int numero;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("--------CONTA BANCO TERMINAL---------");
        System.out.println("-------------------------------------");

        System.out.println("Digite seu nome para cadastro no banco: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia);
    }
}