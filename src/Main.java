import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();
        int indiceConta = 0;
        ArrayList<Conta> listaContas = new ArrayList<Conta>();
        int numConta = 1;
        boolean loop = true;
        while (loop) {
            System.out.println("O que deseja fazer?" +
                    "\n\t[1] Criar Conta" +
                    "\n\t[2] Ver Saldo" +
                    "\n\t[3] Sacar" +
                    "\n\t[4] Depositar" +
                    "\n\t[5] Sair");
            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Nome do titular: ");
                    conta.nomeTitular = scan.next();
                    System.out.print("Saldo inicial: ");
                    conta.saldoConta = scan.nextDouble();

                    conta.numeroConta = numConta;
                    listaContas.add(conta);
                    numConta += 1;

                    System.out.println("Conta criada! Numero da conta: " + conta.numeroConta);
                    break;
                case 2:
                    if (listaContas.isEmpty()) {
                        System.out.println("Nenhuma conta registrada no sistema");
                        break;
                    }
                    System.out.print("Informe o numero da conta: ");
                    indiceConta = scan.nextInt();

                    if (indiceConta > listaContas.size()) {
                        System.out.println("Conta não encontrada");
                        break;
                    }
                    conta = listaContas.get(indiceConta - 1);
                    System.out.println("Saldo atual: " + conta.saldoConta);
                    break;
                case 3:
                    if (listaContas.isEmpty()) {
                        System.out.println("Nenhuma conta registrada no sistema");
                        break;
                    }
                    System.out.print("Informe o numero da conta: ");
                    indiceConta = scan.nextInt();

                    if (indiceConta > listaContas.size()) {
                        System.out.println("Conta não encontrada");
                        break;
                    }
                    conta = listaContas.get(indiceConta - 1);
                    System.out.print("Valor do saque: ");
                    System.out.println(conta.sacar(scan.nextDouble()));
                    break;
                case 4:
                    if (listaContas.isEmpty()) {
                        System.out.println("Nenhuma conta registrada no sistema");
                        break;
                    }

                    System.out.print("Informe o numero da conta: ");
                    indiceConta = scan.nextInt();

                    if (indiceConta > listaContas.size()) {
                        System.out.println("Conta não encontrada");
                        break;
                    }

                    conta = listaContas.get(indiceConta - 1);
                    System.out.print("Valor do deposito: ");
                    System.out.println(conta.depositar(scan.nextDouble()));
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }


    }
}