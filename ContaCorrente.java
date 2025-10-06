public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public ContaCorrente(String numero, String titular, double limiteChequeEspecial, double saldo) {
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
    }

  
