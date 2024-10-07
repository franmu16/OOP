package spazi;

import persone.Persona.Persona;

public class Aula extends Spazio{   //dobbiamo ridefinire entra() e d esce()
    private Persona persone[];
    private int riemp;

    public Aula(String nome, int maxPosti){
        super(nome,maxPosti);

        persone = new Persona[maxPosti];
        this.riemp=0;
    }


    @Override
    public void entra(Persona p) {
        if(aulaPiena()){
            System.out.println("Aula piena");
            return;
        }
        persone[riemp++]=p;
    }

    @Override
    public Persona esce() {
        if(aulaVuota()){
            System.out.println("Aula vuota");
            return null;
        }
        //return persone[--riemp]  //riemp punta alla prossima locazione libera. Questo punta al riferimento, mi sposto ma ancora vi sono le informazioni
        //usiamo una variabile di appoggio
        Persona p = persone[--riemp];
        persone[riemp]=null;
        return p;
    }

    private boolean aulaPiena(){
        return riemp==persone.length;
    }

    private boolean aulaVuota(){
        return riemp==0;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(super.toString() + "\n");
        for(int i=0; i<riemp; i++){
            sb.append(persone[i] + "\n");
        }
        return sb.toString();
    }

    @Override
    public String getTipo() {
        return "Aula";
    }
}
