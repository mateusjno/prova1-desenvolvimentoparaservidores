/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provaum;

/**
 *
 * @author mjoli
 */
public class TestaPersonagens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mago m = new Mago();
        Guerreiro g = new Guerreiro();
        Arqueiro a = new Arqueiro();
        
        
        
        m.setNome("Edgard");
        m.setNivel(10);
        m.setPontosDeVida(300);
        m.setPontosDeMana(500);
        m.setMagiaPrincipal("Fire Ball");
        m.setMagiaSecundaria("Snow Breath");
        
        
        
        g.setNome("Rokghar");
        g.setNivel(10);
        g.setPontosDeVida(300);
        g.setPontosDeDefesa(800);
        g.setPontosDeEnergia(300);
        
        
        
        a.setNome("Swift");
        a.setNivel(10);
        a.setPontosDeVida(300);
        a.setPontosDeEvasao(300);
        a.setPontosDePrecisao(300);
        
        
        System.out.println(m.mostrarDados());
        System.out.println(g.mostrarDados());
        System.out.println(a.mostrarDados());
        
        
    }
    
}
