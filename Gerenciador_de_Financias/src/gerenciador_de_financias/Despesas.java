
package gerenciador_de_financias;

public class Despesas {
    private float ContasTotal;
    private float Imprevistos;
    private float Alimentacao;
    private float GastosPessoais;
    private float TotalDespesas = 0;
  
    
    public Despesas(){
}


    public float getContasTotal() {
        return ContasTotal;
    }

    public void setContasTotal(float ContasTotal) {
        this.ContasTotal = ContasTotal;
    }

    public float getImprevistos() {
        return Imprevistos;
    }

    public void setImprevistos(float Imprevistos) {
        this.Imprevistos = Imprevistos;
    }

    public float getAlimentacao() {
        return Alimentacao;
    }

    public void setAlimentacao(float Alimentacao) {
        this.Alimentacao = Alimentacao;
    }

    public float getGastosPessoais() {
        return GastosPessoais;
    }

    public void setGastosPessoais(float GastosPessoais) {
        this.GastosPessoais = GastosPessoais;
    }

    public float getTotalDespesas() {
        return TotalDespesas = ContasTotal + GastosPessoais + Alimentacao + Imprevistos;
    }

    public void setTotalDespesas(float TotalDespesas) {
        this.TotalDespesas = TotalDespesas;
    }
}


