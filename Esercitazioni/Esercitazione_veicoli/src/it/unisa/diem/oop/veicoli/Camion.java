package it.unisa.diem.oop.veicoli;

public class Camion extends Veicolo{
    int numeroAssi;
    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi){
        super(numTelaio,modello,alimentazione,targa);
        this.numeroAssi=numeroAssi;
    }
    public int getNumeroAssi(){
        return this.numeroAssi;
    }
    public boolean controllaTarga(){
        String pattern = "^[A-Za-z]{2}\\d{5}";
        return getTarga().matches(pattern);
    }

    @Override
    public String toString(){
        return super.toString() + ", Numero assi = " + this.numeroAssi;
    }
}
