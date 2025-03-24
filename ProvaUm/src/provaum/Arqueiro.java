/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaum;

/**
 *
 * @author mjoli
 */
public class Arqueiro extends Personagem{
    
    private int pontosDePrecisao;
    private int pontosDeEvasao;

    public int getPontosDePrecisao() {
        return pontosDePrecisao;
    }

    public void setPontosDePrecisao(int pontosDePrecisao) {
        this.pontosDePrecisao = pontosDePrecisao;
    }

    public int getPontosDeEvasao() {
        return pontosDeEvasao;
    }

    public void setPontosDeEvasao(int pontosDeEvasao) {
        this.pontosDeEvasao = pontosDeEvasao;
    }
    
    @Override
    public String mostrarDados(){
        return super.mostrarDados()+
               "Pontos de Precisao: "+getPontosDePrecisao()+"\n"+
               "Pontos de Evasao: "+getPontosDeEvasao()+"\n";
    }
    
}
