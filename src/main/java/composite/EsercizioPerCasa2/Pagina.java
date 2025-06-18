package composite.EsercizioPerCasa2;

public class Pagina implements LibroInterface{

    private int numero;

    public Pagina(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina numero: " + numero);

    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
