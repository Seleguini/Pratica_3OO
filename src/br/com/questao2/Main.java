package br.com.questao2;

public class Main {
    public static void main(String[] args) {

        FPadrao fp = new FPadrao(1, "Julia", 1000);

        System.out.println(fp.toString());

        FComissionado fc = new FComissionado(2,"Paulo", 1500, 2, 10000);
        System.out.println(fc.toString());

        FProdutividade fpr = new FProdutividade(3,"Gabriel", 25000,1.25,3000);
        System.out.println(fpr.toString());
    }
}
