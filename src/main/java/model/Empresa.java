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
public class Empresa {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private int cep;
    private int telefone;

    public Empresa() {
    }

    public Empresa(String nome, String endereco, String cidade, String estado, int cep, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
        setEndereco(JOptionPane.showInputDialog("Digite o seu endereço:"));
        setCidade(JOptionPane.showInputDialog("Digite o seu cidade:"));
        setEstado(JOptionPane.showInputDialog("Digite o seu estado:"));
        setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cep:")));
        setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu telefone:")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    public String paraString() {
        return ("Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nCidade: " + getCidade()
                + "\nEstado: " + getEstado() + "\nCep: " + getCep() + "\nFone: " + getTelefone());
    }
}
