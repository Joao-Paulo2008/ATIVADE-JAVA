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
public class principal {
     public static void main(String[] args) {
        carro c1 = new carro();
        moto m = new moto();
        c1.marca = JOptionPane.showInputDialog("Qual a marca do seu carro? ");
        c1.modelo = JOptionPane.showInputDialog("Qaul o modelo do carro? ");
        c1.idade = Integer.parseInt(JOptionPane.showInputDialog("Quandos anos o seu carro tem?"));
        c1.cor = JOptionPane.showInputDialog("qual cor da caneta?") ;
        c1.setOdometro(Float.parseFloat(JOptionPane.showInputDialog("Informe a quilometragem do seu carro: ")));
        c1.setValor(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do seu carro: ")));
         
        c1.Status();
        
          int qtd, tanque, abastecimento;
        m.setTanque(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de litros do tanque: ")));
        
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes sua moto foi abastecida: "));
        
        m.setAbastecimento(Integer.parseInt(JOptionPane.showInputDialog("quantos litros houve em cada abastecimento:")));
        
        
        
        m.abastecer(qtd);
    }
}
