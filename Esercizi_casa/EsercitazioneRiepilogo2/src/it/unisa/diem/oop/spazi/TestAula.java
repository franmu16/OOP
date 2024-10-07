package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.persone.Studente;

public class TestAula {
    public static void main(String[] args) {
        // TODO code application logic here
        Aula a = new Aula(2);
        Persona p = new Persona("Luca", "Rossi", "329849");
        Studente s = new Studente("Giovanni", "Bianchi", "438972");
        if(a.aulaVuota())
            System.out.println("L'aula è vuota");
        a.entra(s);
        Studente s1 = new Studente("Maria", "Rossi", "612724");
        a.entra(s1);
        Studente s2 = new Studente("Francesco", "Gallo", "738222");
        a.entra(s2);
        Studente s3;
        s3 = a.esce();
        System.out.println(s3.getNome() + " " + s3.getCognome() + " " + s3.getMatricola());
        String status;
        status = a.getInfoAula();
        System.out.println(status);
    }
}
