package br.com.questao1;

public class VIP extends Ingresso {

    private double valorAdicional;

    public VIP(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void imprimeIngressoVip(){
        System.out.println("Ingresso Vip - valor: " + (getValorIngresso() + valorAdicional));
    }
}
