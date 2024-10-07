package it.unisa.diem.oop.veicoli;

public class Autovettura extends Veicolo{
    int numeroPosti;
    public Autovettura (String numTelaio, String modello, String alimentazione, String targa, int numeroPosti){
        super(numTelaio,modello,alimentazione,targa);
        this.numeroPosti=numeroPosti;
    }
    public int getNumeroPosti(){
        return this.numeroPosti;
    }
    public boolean controllaTarga(){
        String pattern = "^[A-Za-z]{2}\\d{3}[A-Za-z]{2}$";
        return getTarga().matches(pattern);
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero posti = " + this.numeroPosti;
    }
}
