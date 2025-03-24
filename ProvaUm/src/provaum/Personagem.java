/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaum;

/**
 *
 * @author mjoli
 */
public class Personagem {
    
    private String nome;
    private int nivel;
    private int pontosDeVida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }
    
    
    public String mostrarDados(){
        return "Nome: "+getNome()+"\n"+
               "Nivel: "+getNivel()+"\n"+
               "Pontos de Vida: "+getNome()+"\n";
    }
    
    
    
}
