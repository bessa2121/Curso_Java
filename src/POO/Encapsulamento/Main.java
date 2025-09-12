package POO.Encapsulamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário: ");
        String nome = sc.nextLine();
        System.out.println("Confirme seu nome de usuário: ");
        String nomeUsuario = sc.nextLine();

        while (!nomeUsuario.trim().equalsIgnoreCase(nome.trim())) {
            System.out.println("Ops❗Sua confirmação deu errado, por favor refaça e confirme novamente seu nome: ");
            nomeUsuario = sc.nextLine();
        }

        System.out.println("Sua confirmação foi um sucesso!");
        System.out.println("\nBem-vindo ao seu Banco, " + nomeUsuario + "!");


        int opcao;

        Saldo conta = new Saldo(); // saldo começa em 0

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial (em breve)");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto (em breve)");
            System.out.println("6 - Verificar se a conta está usando cheque especial (em breve)");
            System.out.println("0 - Sair do banco");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Saldo atual: R$" + conta.consultaSaldo());
                case 3 -> {
                    System.out.print("Digite o valor para depósito: ");
                    double valor = sc.nextDouble();
                    conta.depositarSaldo(valor);
                }
                case 4 -> {
                    System.out.print("Digite o valor para saque: ");
                    double valor = sc.nextDouble();
                    conta.sacarSaldo(valor);
                }
                case 5 -> {
                    sc.nextLine(); // consome o Enter pendente
                    System.out.print("Deseja pagar o boleto pendente? S/N: ");
                    String boleto = sc.nextLine();
                    if (boleto.equalsIgnoreCase("S")) {
                        conta.pagarBoleto(100);
                    } else {
                        System.out.println("Pagamento cancelado.");
                    }
                }

                case 0 -> System.out.println("Saindo do seu banco. Até a próxima, " + nome + " 😁");
                default -> System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
