/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animali;
import Proprietario.Proprietario;
/**
 *
 * @author franz
 */
public class Cane extends Animale {
    String razza;
    Proprietario owner;
    
    public Cane(String nome, int età, String razza, Proprietario owner){
        super(nome,età);
        this.razza=razza;
        this.owner = owner;
    }
    
    @Override
    public String emettiSuono(){
        return("Bau Bau");
    }
    void mostraDettagli(){
        System.out.println(this.razza + " " + this.owner.toString());
    }
}
