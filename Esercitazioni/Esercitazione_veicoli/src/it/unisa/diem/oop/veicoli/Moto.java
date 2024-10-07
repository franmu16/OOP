package it.unisa.diem.oop.veicoli;

public class Moto extends Veicolo{
    boolean guidaLibera;
    public Moto(String numTelaio, String modello, String alimentazione, String targa, boolean guidaLibera){
        super(numTelaio,modello,alimentazione,targa);
        this.guidaLibera=guidaLibera;
    }
    public boolean getGuidaLibera(){
        return this.guidaLibera;
    }
    public boolean controllaTarga(){
        String pattern = "^[A-Za-z]{2}\\d{5}";
        return getTarga().matches(pattern);
    }
    @Override
    public String toString(){
        return super.toString() + ", Guida libera = " + this.guidaLibera;
    }
}
