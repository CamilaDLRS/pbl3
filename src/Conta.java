public class Conta {
    public String nomeTitular;
    public int numeroConta;
    public double saldo;

    public String depositar (double valor){
        this.saldo = this.saldo + valor;
        return "saldo atual " + this.saldo;

    }
    public String sacar (double valor){
        if(this.saldo >= valor){

            this.saldo -= valor;
            return  "saldo atual " + this.saldo;
        }
        return "Saldo Indisponivel. Saldo Atual " + this.saldo;
    }



}
