package composite;

import java.util.ArrayList;
import java.util.List;
// questa classe fa da composite, qui dentro abbiamo una classe che discende da un interfaccia e che contiene oggetti che a loro volta
// discendono dalla stessa interfaccia, in questo caso Prodotto
//possiamo immaginare prodotto come il seme da cui nasce un albero, libreria come ramo del albero e i libri come foglie del ramo
public class Libreria implements  Prodotto{

    private String nome;

    private List<Libro> libri;

    public Libreria(String nome) {
        this.nome = nome;
        libri=new ArrayList<>();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return libri.stream().mapToDouble(l->l.getPrezzo()).sum();
    }

    @Override
    public double getPeso() {
        return libri.stream().mapToDouble(l->l.getPeso()).sum();
    }

    public void add(Libro libro){
        libri.add(libro);
    }
}
