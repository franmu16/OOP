/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.persone;

public class Studente extends Persona {
    private String matricola;

    public Studente(String nome, String cognome, String matricola){
        super(nome,cognome); 
        this.matricola=matricola;

    }

    public String getMatricola() {
        return this.matricola;
    }
    public void setMatricola(String nome){
        this.matricola=matricola;
    }
}
