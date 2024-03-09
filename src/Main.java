import java.util.ArrayList;
import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();
        int num_conta = 1;
        boolean loop = true;
        ArrayList<Conta> listaConta = new ArrayList<Conta>();
        int contaPesquisada = 0;
        while (loop){
            System.out.println("1- Criar Conta" +
                    "\n2- Ver saldo" +
                    "\n3- Sacar" +
                    "\n4-Depositar" +
                    "\n5-Sair");
            int escolha = scan.nextInt();

            switch (escolha){
                case 1:
                    System.out.print("Nome do Titular ");
                    conta.nomeTitular = scan.next();

                    System.out.print("Saldo inicial ");
                    conta.saldo = scan.nextDouble();

                    conta.numeroConta = num_conta;
                    listaConta.add(conta);
                    num_conta += 1 ;
                    System.out.println("Conta criada: numero da conta " + conta.numeroConta);
                    break;

                case 2 :
                    System.out.print("Numero da conta ");
                    contaPesquisada = scan.nextInt();

                    conta = listaConta.get(contaPesquisada - 1);
                    System.out.println("Saldo " + conta.saldo);

                    break;
                case 3 :

                    System.out.println("Numero da conta ");
                    contaPesquisada = scan.nextInt();

                    conta = listaConta.get(contaPesquisada -1);
                    System.out.println("Valor do saque: " );
                    double valorSaque = scan.nextDouble();
                    System.out.println(conta.sacar(valorSaque));
                    break;
                case 4 :

                    System.out.println("Numero da conta ");
                    contaPesquisada = scan.nextInt();

                    conta = listaConta.get(contaPesquisada -1);
                    System.out.println("Valor do deposito: " );
                    double valorDeposito = scan.nextDouble();
                    System.out.println(conta.depositar(valorDeposito));


                    break;
                case 5 :

                    System.out.println("Programa encerrado ");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}