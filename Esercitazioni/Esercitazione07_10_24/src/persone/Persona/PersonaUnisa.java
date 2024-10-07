package persone.Persona;  //oggetto non presente nel dominio applicativo

public abstract class PersonaUnisa extends Persona{   //abstract per dire che è una classe che non può essere istanziata
    private String matricola;

    public PersonaUnisa(String nome, String cognome, String codiceFiscale, String matricola){
        super(nome,cognome,codiceFiscale);   //la super ci permette di accedere (utilizzare) i metodi pubblici
        this.matricola=matricola;

    }

    public String getMatricola() {
        return this.matricola;
    }
    @Override
    public String toString(){
        return super.toString() + " " + this.matricola;  //adesso chi è sotto PersonaUnisa usa questo toString
    }

    //si possono definire dei metodi da far utilizzare alle sue classi specializzate
    public abstract String getRuolo();  //metodo astratto, metodo che obbligatoriamente le sue sottoclassi devono ridefinire

    //le interffacce hanno tratti comuni con le classi astratte , ma possiamo definire solo interfacce astratte
    // serve a sopperire all'assenza della multiereditarietà
}
