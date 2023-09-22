package br.com.questao1;

public class Camarote extends Ingresso{

    public String localizacao;
    public double valorAdicionalCamarote;

    public Camarote(double valorIngresso, String localizacao, double valorAdicionalCamarote) {
        super(valorIngresso);
        this.localizacao = localizacao;
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getValorAdicionalCamarote() {
        return valorAdicionalCamarote;
    }

    public void setValorAdicionalCamarote(double valorAdicionalCamarote) {
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public void imprimeIngressoCamarote(){
        System.out.println("Ingresso Camarote - valor: " + (getValorIngresso() + getValorAdicionalCamarote())
                + "\nLocalização: " + getLocalizacao());
    }
}
