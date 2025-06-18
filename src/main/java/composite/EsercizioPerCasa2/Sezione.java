package composite.EsercizioPerCasa2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Elemento {

    private String titolo;
    private List<Elemento> elementi= new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public List<Elemento> getListaDiPagineESezioni() {
        return elementi;
    }

    public void setListaDiPagineESezioni(List<Elemento> listaDiPagineESezioni) {
        this.elementi = listaDiPagineESezioni;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public void stampa() {
        System.out.println("Stampo Sezione: " + titolo);
        for (Elemento libro : elementi) {
            libro.stampa();
        }

    }


    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (Elemento libro : elementi) {
            totalePagine += libro.getNumeroPagine();
        }
        return  totalePagine;
    }

    public void add(Elemento libro) {
        elementi.add(libro);
    }
}
