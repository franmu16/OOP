package persone.Persona;

public class Persona {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Persona(String nome, String cognome, String codiceFiscale){
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
    }
    public final String getNome() {    //con final non posso fare overwriting dei metodi in sottoclassi
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }
    @Override    //bisogna metterlo per il processore di coerenza, serve al programmatore per leggibilità e non alla JVM
    public String toString(){   //OVERWRITING DEI METODI (se avessi messo dei parametri sarebbe stato overloading)
        return "Persona - " + this.nome + " " + this.cognome + " " + this.codiceFiscale;
    }
}
