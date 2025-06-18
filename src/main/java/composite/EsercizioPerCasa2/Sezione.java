package composite.EsercizioPerCasa2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroInterface{

    private String titolo;
    private List<LibroInterface> listaDiPagineESezioni= new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public List<LibroInterface> getListaDiPagineESezioni() {
        return listaDiPagineESezioni;
    }

    public void setListaDiPagineESezioni(List<LibroInterface> listaDiPagineESezioni) {
        this.listaDiPagineESezioni = listaDiPagineESezioni;
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
        for (LibroInterface libro : listaDiPagineESezioni) {
            libro.stampa();
        }

    }


    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (LibroInterface libro : listaDiPagineESezioni) {
            totalePagine += libro.getNumeroPagine();
        }
        return  totalePagine;
    }

    public void add(LibroInterface libro) {
        listaDiPagineESezioni.add(libro);
    }
}
