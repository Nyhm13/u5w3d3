package chainOfResponsability.EsercizioPerCasa3;

public abstract class Ufficiale {

    private String funzione;
    private double stipendio;
    private Ufficiale responsabile;

    public String getFunzione() {
        return funzione;
    }

    public void setFunzione(String funzione) {
        this.funzione = funzione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public Ufficiale getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

    public void confrontaStipendio(double stipendio){
        if (this.stipendio>=stipendio){
            System.out.println("L'ufficiale " + this.funzione + " ha uno stipendio maggiore o uguale a " + stipendio);
        }
        if (responsabile!=null){
            responsabile.confrontaStipendio(stipendio);
        }
    }
}
