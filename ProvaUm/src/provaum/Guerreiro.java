/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaum;

/**
 *
 * @author mjoli
 */
public class Guerreiro extends Personagem{
    
    private int pontosDeEnergia;
    private int pontosDeDefesa;

    public int getPontosDeEnergia() {
        return pontosDeEnergia;
    }

    public void setPontosDeEnergia(int pontosDeEnergia) {
        this.pontosDeEnergia = pontosDeEnergia;
    }

    public int getPontosDeDefesa() {
        return pontosDeDefesa;
    }

    public void setPontosDeDefesa(int pontosDeDefesa) {
        this.pontosDeDefesa = pontosDeDefesa;
    }
    
    @Override
    public String mostrarDados(){
        return super.mostrarDados()+
               "Pontos de Energia: "+getPontosDeEnergia()+"\n"+
               "Pontos de Defesa: "+getPontosDeDefesa()+"\n";
    }
    
}
