public class Conta {

    private  String numero,titular;
    private double saldo;


    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void mostrarDados(){
        System.out.printf("Titular: %s\nNúmero da conta: %s\nSaldo: %f",titular,numero,saldo);
    }

    public void mostrarDados(double projecaoMensal){
        System.out.printf("Titular: %s\nNúmero da conta: %s\nSaldo: %f\nProjeção: %f",titular,numero,saldo,projecaoMensal);

    }



}
