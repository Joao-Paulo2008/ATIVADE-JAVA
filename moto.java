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
public class moto {
     
    
   private String cor;         

    public int getAbastecimento() {
        return abastecimento;
    }

    public void setAbastecimento(int abastecimento) {
        this.abastecimento = abastecimento;
    }
       private String modelo;
       private int ano;
       private int odometro;
       private String marca;
       private float valor;
       private int tanque;
       private int abastecimento;

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getTanque() {
        return tanque;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setOdometro(int odometro) {
        this.odometro = odometro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getOdometro() {
        return odometro;
    }

    public String getMarca() {
        return marca;
    }

    public float getValor() {
        return valor;
    }
    
    int falta = 0;
    
    public boolean abastecer (int qtd){
        if(qtd * abastecimento >tanque){
        JOptionPane.showMessageDialog(null, "O tanque da moto de "+this.tanque+"L está com cheio. ");
              
        return true;
        }else{
            falta = tanque - (qtd * abastecimento);
            JOptionPane.showMessageDialog(null, "O seu tanque precisa ser abastecido, falta: "+falta+" litros");
            
           return false; 
        }
            
   
    }
   
}

    
    
    
}
