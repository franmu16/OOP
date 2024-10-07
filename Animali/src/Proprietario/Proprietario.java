/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proprietario;
import animali.*;
/**
 *
 * @author franz
 */
public class Proprietario {
    String nome;
    String indirizzo;
    
    public Proprietario(String nome, String indirizzo){
        this.indirizzo=indirizzo;
        this.nome=nome;
    }
    public void mostraDettagli(){
        System.out.println(this.nome + " " + this.indirizzo);
    }
    @Override
    public String toString(){
        return this.nome + " " + this.indirizzo;
    }
}
