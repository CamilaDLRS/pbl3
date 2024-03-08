public class Conta {
    public String nomeTitular;
    public int numeroConta;
    public double saldoConta;

    public String sacar(double valorSaque) {
        if (valorSaque > saldoConta) {
            return "Valor para saque não disponivel";
        }
        this.saldoConta -= valorSaque;
        return  "Saldo atual: " + this.saldoConta;
    }

    public String depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            return  "Valor de depósito inválido";
        }
        this.saldoConta += valorDeposito;
        return  "Saldo atual: " + this.saldoConta;
    }
}
