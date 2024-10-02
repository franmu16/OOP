package studentiiz;
import persone.Persona.*;

public class Main {
    public static void main(String[] args) {
        //PersonaUnisa p = new PersonaUnisa("Mario", "Rossi", "RSSMRA33NBH433", "084237589");
        System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getCodiceFiscale() + " " + p.getMatricola());
        StudenteUnisa s = new StudenteUnisa("Giacomo", "Bianchi", "BNHGCM33NBH433", "084237589", 25.8F);
        System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getCodiceFiscale() + " " + p.getMatricola());
        System.out.println(s.toString()); //non funziona se chiamata solo così
        System.out.println(p);   //adesso si prende il toString da me descritto
        PersonaUnisa t = new StudenteUnisa("Giacomo", "Bianchi", "BNHGCM33NBH433", "084237589", 25.8F);   //upcast, mi permette di accedere ai metodi solo di Persona
        //Studente s2 = p;   //downcast non possibile perchè potrei poter accedere a metodi non possibili
        if(s instanceof StudenteUnisa) {   //prima di fare questa oper. devo fare un controllo per poter fare downcast senza eccezioni
            StudenteUnisa s2 = (StudenteUnisa) s;   //forzo ma mi assumo alcune responsabilità ma che cmq mi genera delle eccezioni
            System.out.println(s2.getVotoMedio());  //usa toString di Studente perchè prende il metodo della superclasse (io prima creo Studente e poi limito a Persona)
        }
        //altro metodo invece instanceof
        if(s.getClass() == StudenteUnisa.class) {
            StudenteUnisa s2 = (StudenteUnisa) s;
            System.out.println(s2.getVotoMedio());
        }

    }
}
