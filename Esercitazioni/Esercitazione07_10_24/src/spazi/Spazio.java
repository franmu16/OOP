package spazi;

public abstract class Spazio implements Accessibile{  //se Spazio classe concreta deve ridefinire esce ed entra, se astratta no

    private String nome;
    private int maxPosti;

    public Spazio(String nome, int maxPosti){
        this.nome=nome;
        this.maxPosti=maxPosti;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMaxPosti() {
        return this.maxPosti;
    }

    public abstract String getTipo();

    @Override
    public String toString(){
        return this.getTipo() + ": " + this.nome + " " + "num. posti: " + this.maxPosti;
    }
}
