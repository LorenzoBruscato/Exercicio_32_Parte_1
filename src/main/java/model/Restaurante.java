/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Restaurante extends Empresa {

    private String tipoComida;
    private double precoMedio;

    public Restaurante() {
    }

    public Restaurante(String tipoComida, double precoMedio, String nome, String endereco, String cidade, String estado, int cep, int telefone) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    @Override
    public void leitura() {
        super.leitura();
        setTipoComida(JOptionPane.showInputDialog("Tipo de Comida:"));
        setPrecoMedio(Double.parseDouble(JOptionPane.showInputDialog("Preco Medio(R$):")));
    }

    /**
     * Mostra na tela os dados da empresa
     */
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    /**
     * Recuperador dos dados da empresa
     *
     * @return String
     */
    @Override
    public String paraString() {
        return (super.paraString()
                + "\nTipo de Comida: " + getTipoComida()
                + "\nPreco Medio: " + getPrecoMedio());
    }
}
