package persone.Persona;

public class StudenteUnisa extends PersonaUnisa {
    private float votoMedio;

    public StudenteUnisa(String nome, String cognome, String codiceFiscale, String matricola, float votoMedio){
        super(nome, cognome, codiceFiscale, matricola);
        this.votoMedio=votoMedio;
    }

    public float getVotoMedio() {
        return this.votoMedio;
    }

    @Override
    public String getRuolo() {
        return "Studente";
    }
}
