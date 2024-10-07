/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.spazi;
import it.unisa.diem.oop.persone.Studente;
/**
 *
 * @author Francesco Musto
 */
public class Aula {
    int maxPosti;
    static int nPosti=0;
    Studente s1[];
    public Aula(int maxPosti){
        this.maxPosti = maxPosti;
        s1 = new Studente[5];
        nPosti=0;
    }
    boolean aulaPiena(){
        return maxPosti==nPosti;
    }
    boolean aulaVuota(){
        return nPosti==0;
    }
    void entra(Studente s){
        if(!aulaPiena()){
            s1[nPosti]=s;
            nPosti++;
        }
        else{
            System.out.println("Inserimento non riuscito perchè l'aula è piena");
            return;
        }
    }
    
    Studente esce(){
        if(!aulaVuota()){
            s1[nPosti]=null;
            nPosti--;
        }
        else{
            System.out.println("Aula vuota");
        }
        return s1[nPosti];
    }
    String getInfoAula(){
        int i=0;
        String str = new String();
        if(nPosti>0)
            str = s1[i].getNome() + " " + s1[i].getCognome() + " "+ s1[i].getMatricola();
        for(i=1; i<nPosti; i++){
            str = str + " " + s1[i].getNome() + " " + s1[i].getCognome() + " "+ s1[i].getMatricola();
        }
        return str;
    }

    /**
     *
     * @author Francesco Musto
     */
    public static class EsercitazioneRiepilogo {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
        }

    }
}
