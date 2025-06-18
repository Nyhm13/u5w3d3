package composite.EsercizioPerCasa2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements LibroInterface{

    private String titolo;
    private List<String> autori;
    private double prezzo;
    private List<LibroInterface> listaComponenti= new ArrayList<>();

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

    public List<LibroInterface> getListaComponenti() {
        return listaComponenti;
    }

    public void setListaComponenti(List<LibroInterface> listaComponenti) {
        this.listaComponenti = listaComponenti;
    }

    @Override
    public void stampa() {
        System.out.println("=== Libro ===");
        System.out.println("Titolo: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + " €");
        System.out.println("Contenuto:");
        for (LibroInterface c : listaComponenti) {
            c.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int totale=0;
        for (LibroInterface c:listaComponenti){
            totale+=c.getNumeroPagine();
        }
        return totale;
    }

    public void add(LibroInterface libro) {
        listaComponenti.add(libro);
    }
}
