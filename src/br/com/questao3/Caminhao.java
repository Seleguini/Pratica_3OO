package br.com.questao3;

import javax.swing.*;

public final class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "Dados do Ônibus: \n \nPlaca: " + getPlaca() + "\nAno: " + getAno());
        JOptionPane.showMessageDialog(null, "Número de eixos: " + getEixos());
    }
}
