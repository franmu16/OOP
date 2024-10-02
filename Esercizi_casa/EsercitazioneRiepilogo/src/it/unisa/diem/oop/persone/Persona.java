package it.unisa.diem.oop.persone;

public class Persona {
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;
    }
    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String Cognome){
        this.nome=cognome;
    }
}
