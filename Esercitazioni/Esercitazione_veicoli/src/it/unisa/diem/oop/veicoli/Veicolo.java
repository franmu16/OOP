package it.unisa.diem.oop.veicoli;

public abstract class Veicolo {
    private String numTelaio;
    private String modello;
    private String alimentazione;
    private String targa;

    public Veicolo (String numTelaio, String modello, String alimentazione, String targa){
        this.numTelaio = numTelaio;
        this.modello=modello;
        this.alimentazione=alimentazione;
        this.targa=targa;
    }

    public String getNumTelaio() {
        return numTelaio;
    }

    public String getModello() {
        return modello;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public abstract boolean controllaTarga();

    @Override
    public String toString() {
         return "Telaio = " + this.numTelaio + ", Modello = " + this.modello +  ", Alimentazione = " + this.alimentazione + ", Targa = " + this.targa;
    }
}
