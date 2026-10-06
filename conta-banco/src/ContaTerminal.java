import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("--------CONTA BANCO TERMINAL---------");
        System.out.println("-------------------------------------");

        System.out.println("Digite seu nome para cadastro no banco: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +
                ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque.");
    }
}