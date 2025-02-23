import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Olá, seja bem vindo ao Banco do Brasil!");
        System.out.println("Qual o seu nome?");

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        conta.setNomeCliente(nome);

        System.out.println("Olá, " + conta.getNomeCliente() + "!");

        System.out.println("Por favor, Digite o numero da sua conta:");
        int numero = scanner.nextInt();
        if (numero == conta.getNumero()) {
            System.out.println("Conta encontrada!");
        } else {
            System.out.println("Conta não encontrada!");
        }

        System.out.println("Por favor, Digite a agência da sua conta:");
        String agencia = scanner.next();
        if (agencia.equals(conta.getAgencia())) {
            System.out.println("Agência encontrada!");
        } else {
            System.out.println("Agência não encontrada!");
        }
        System.out.println("Olá " + conta.getNomeCliente() + "! " + "Sua agencia e sua conta sao: " + conta.getAgencia() + " e " + conta.getNumero() + " e voce tem R$" + conta.getSaldo() + " em sua conta");

        scanner.close();

    }
}