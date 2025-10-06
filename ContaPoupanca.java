public class ContaPoupanca extends Conta {
    private double RendimentoMensal;

    public double getRendimentoMensal() {
        return RendimentoMensal;
    }

    public void setRendimentoMensal(double taxaRendimentoMensal) {
        this.RendimentoMensal = taxaRendimentoMensal;
    }

    public ContaPoupanca(String numero, String titular, double saldo, double RendimentoMensal) {
        super(numero, titular, saldo);
        this.RendimentoMensal = RendimentoMensal;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de rendimento mensal: " + RendimentoMensal);
    }

    public void mostrarDados(boolean emTaxaAnual) {
        super.mostrarDados();
        if (emTaxaAnual) {

            System.out.println("Taxa de rendimento anual: " + RendimentoMensal * 12 );
        } else {
            System.out.println("Taxa de rendimento mensal: " + RendimentoMensal);
        }
    }
}
