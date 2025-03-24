/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaum;

/**
 *
 * @author mjoli
 */
public class Mago extends Personagem{
    
    private int pontosDeMana;
    private String magiaPrincipal;
    private String magiaSecundaria;

    public int getPontosDeMana() {
        return pontosDeMana;
    }

    public void setPontosDeMana(int pontosDeMana) {
        this.pontosDeMana = pontosDeMana;
    }

    public String getMagiaPrincipal() {
        return magiaPrincipal;
    }

    public void setMagiaPrincipal(String magiaPrincipal) {
        this.magiaPrincipal = magiaPrincipal;
    }

    public String getMagiaSecundaria() {
        return magiaSecundaria;
    }

    public void setMagiaSecundaria(String magiaSecundaria) {
        this.magiaSecundaria = magiaSecundaria;
    }
    
    @Override
    public String mostrarDados(){
        return super.mostrarDados()+
               "Pontos de Mana: "+getPontosDeMana()+"\n"+
               "Magia de Principal: "+getMagiaPrincipal()+"\n"+
               "Magia de Secundaria: "+getMagiaSecundaria()+"\n";
    }
    
}
