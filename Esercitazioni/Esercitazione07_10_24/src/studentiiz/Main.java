package studentiiz;

import persone.Persona.Persona;
import persone.Persona.StudenteUnisa;
import spazi.Accessibile;
import spazi.Aula;

public class Main {
    public static void main(String[] args) {
        Persona p=new Persona("Mario", "Rossi", "MRS3847");
        StudenteUnisa s = new StudenteUnisa("Stefano", "Grisi", "SNT8973", "94032", 28.7F);

        Accessibile a = new Aula("M", 4);
        //Aula a= new Aula("M", 4);

        a.entra(p);
        a.entra(s);  //upcast immediato

        System.out.println(a);
    }
}
