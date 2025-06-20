package composite.EsercizioPerCasa2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Elemento {

    private String titolo;
    private List<String> autori;
    private double prezzo;
    private List<Elemento> listaComponenti= new ArrayList<>();

    public Libro(String titolo, double prezzo, List<String> autori) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.autori = autori;

    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public List<String> getAutori() {
        return autori;
    }

    public void setAutori(List<String> autori) {
        this.autori = autori;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public List<Elemento> getListaComponenti() {
        return listaComponenti;
    }

    public void setListaComponenti(List<Elemento> listaComponenti) {
        this.listaComponenti = listaComponenti;
    }

    @Override
    public void stampa() {
        System.out.println("=== Libro ===");
        System.out.println("Titolo: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + " €");
        System.out.println("Contenuto:");
        for (Elemento c : listaComponenti) {
            c.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int totale=0;
        for (Elemento c:listaComponenti){
            totale+=c.getNumeroPagine();
        }
        return totale;
    }

    public void add(Elemento libro) {
        listaComponenti.add(libro);
    }
}
