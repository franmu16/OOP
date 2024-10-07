/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animali;

/**
 *
 * @author franz
 */
public abstract class Animale {
    private String nome;
    private int età;
    
    public Animale(String nome, int età){
        this.nome=nome;
        this.età=età;
    }
    public abstract String emettiSuono();
    
    public String getNome(){
        return this.nome;
    }
    public int getEtà(){
        return this.età;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEtà(int età){
        this.età=età;
    }
}
