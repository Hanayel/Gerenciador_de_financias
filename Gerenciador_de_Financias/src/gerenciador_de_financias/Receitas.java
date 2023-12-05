
package gerenciador_de_financias;

public class Receitas {
    private float Salario;
    private float VendaUnic;
    private float Bonus;
    private float ValoresAleatorios;
    private float TotalReceitas = 0;
    
   
    
    public Receitas(){
}

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public float getVendaUnic() {
        return VendaUnic;
    }

    public void setVendaUnic(float VendaUnic) {
        this.VendaUnic = VendaUnic;
    }

    public float getBonus() {
        return Bonus;
    }

    public void setBonus(float Bonus) {
        this.Bonus = Bonus;
    }

    public float getValoresAleatorios() {
        return ValoresAleatorios;
    }

    public void setValoresAleatorios(float ValoresAleatorios) {
        this.ValoresAleatorios = ValoresAleatorios;
    }

    public float getTotalReceitas() {
        return TotalReceitas = Salario + VendaUnic + Bonus + ValoresAleatorios;
    }

    public void setTotalReceitas(float TotalReceitas) {
        this.TotalReceitas = TotalReceitas ;
    }
    
}
