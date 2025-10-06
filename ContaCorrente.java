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

    public class ContaInvestimento extends Conta {
        private double taxaAdministracao;

        public double getTaxaAdministracao() {
            return taxaAdministracao;
        }

        public void setTaxaAdministracao(double taxaAdministracao) {
            this.taxaAdministracao = taxaAdministracao;
        }

        public ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao) {
            super(numero, titular, saldo);
            this.taxaAdministracao = taxaAdministracao;
        }

        @Override
        public void mostrarDados() {
            super.mostrarDados();
            System.out.println("Taxa de administração: " + taxaAdministracao + "%");
        }

        public void mostrarDados(boolean considerarTaxa) {
            super.mostrarDados();
            if (considerarTaxa) {
                double saldoLiquido = getSaldo() * (1 - (taxaAdministracao / 100)); // Saldo após taxa
                System.out.println("Saldo líquido (após taxa de administração): " + saldoLiquido);
            }
        }
    }




}