package br.com.questao1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorIngresso, valorAdicionalVip, valorAdicionalCamarote;
        String localizacao;

        System.out.println("Digite o valor do ingresso normal: ");
        valorIngresso = sc.nextDouble();
        Normal normal = new Normal(valorIngresso);

        System.out.println("Digite o valor adicional do ingresso VIP: ");
        valorAdicionalVip = sc.nextDouble();
        VIP vip = new VIP(valorIngresso, valorAdicionalVip);

        System.out.println("Digite o valor adicional do ingresso Camarote: ");
        valorAdicionalCamarote = sc.nextDouble();

        System.out.println("Digite a localizacao do ingresso Camarote: ");
        sc.nextLine();
        localizacao = sc.nextLine();

        Camarote camarote = new Camarote(valorIngresso, localizacao, valorAdicionalCamarote);

        System.out.println();
        normal.imprimeIngresso();
        vip.imprimeIngressoVip();
        camarote.imprimeIngressoCamarote();

        sc.close();
    }

}