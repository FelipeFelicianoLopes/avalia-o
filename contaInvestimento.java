public class ContaInvestimento extends Conta {
    private double taxaAdm;

    public double getTaxaAdm() {
        return taxaAdm;
    }

    public void setTaxaAdm(double taxaAdm) {
        this.taxaAdm = taxaAdm;
    }

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdm) {
        super(numero, titular, saldo);
        this.taxaAdm = taxaAdm;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de administração: " + taxaAdm + "%");
    }




}
