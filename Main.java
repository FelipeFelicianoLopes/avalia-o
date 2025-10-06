import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;

        while (c) {

            System.out.println("Escolha o tipo de conta:\n[1] Conta Corrente\n[2]Conta Poupanca\n[3]Conta Investimento\n[0]Encerrar ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("Número da conta: ");
                    String numCorrente = sc.nextLine();
                    System.out.print("Titular: ");
                    String titCorrente = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldoCorrente = sc.nextDouble();
                    System.out.print("Limite do cheque especial: ");
                    double limCorrente = sc.nextDouble();
                    ContaCorrente contaCorrente = new ContaCorrente(numCorrente, titCorrente, saldoCorrente, limCorrente);
                    contaCorrente.mostrarDados();
                    break;

                case 2:

                    System.out.print("Número da conta: ");
                    String numPoupanca = sc.nextLine();
                    System.out.print("Titular: ");
                    String titPoupanca = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldoPoupanca = sc.nextDouble();
                    System.out.print("Taxa de rendimento mensal: ");
                    double taxaRendimentoPoupanca = sc.nextDouble();
                    ContaPoupanca contaPoupanca = new ContaPoupanca(numPoupanca, titPoupanca, saldoPoupanca, taxaRendimentoPoupanca);
                    contaPoupanca.mostrarDados();
                    break;

                case 3:

                    System.out.print("Número da conta: ");
                    String nInvestimento = sc.nextLine();
                    System.out.print("Titular: ");
                    String tInvestimento = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldoInvestimento = sc.nextDouble();
                    System.out.print("Taxa de administração: ");
                    double taxaAdministracao = sc.nextDouble();
                    ContaInvestimento contaInvestimento = new ContaInvestimento(nInvestimento, tInvestimento, saldoInvestimento, taxaAdministracao);
                    contaInvestimento.mostrarDados();
                    break;

                case 0:
                    c = false;
                    System.out.println("Programa encerrado.");
                    break;

            }

            System.out.println("Deseja cadastrar outra conta? (s/n): ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                c = false;
                System.out.println("Programa encerrado.");
            }
            else{
                c = true;
            }
        }

        sc.close();
    }
}
