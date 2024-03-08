/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

import javax.swing.JOptionPane;

/**
 *
 * @author jpaul
 */
public class carro {
   
    String marca;
    String cor;
    String modelo;

    public float getOdometro() {
        return odometro;
    }

    public void setOdometro(float odometro) {
        this.odometro = odometro;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    int idade;
    float odometro;
    float valor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     void Status(){
     
        JOptionPane.showConfirmDialog(null, "A marca é: "+this.marca);
        JOptionPane.showConfirmDialog(null, "O dono é: "+this.modelo);
        JOptionPane.showConfirmDialog(null, "A idade é: "+this.idade+" anos");   
        JOptionPane.showConfirmDialog(null, "A cor é: "+this.cor);
        JOptionPane.showMessageDialog(null, "voçê rodou"+this.odometro+"km");
        JOptionPane.showMessageDialog(null, "O seu carro custou"+this.valor);
         
     }
    
    
    
}
