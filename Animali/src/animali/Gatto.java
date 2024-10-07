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
public class Gatto extends Animale{
    String colore;
    
    public Gatto(String nome, int età, String colore){
        super(nome,età);
        this.colore=colore;
    }
    
    @Override
    public String emettiSuono(){
        return("Miao Miao");
    }    
}
