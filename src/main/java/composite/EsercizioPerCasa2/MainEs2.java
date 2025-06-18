package composite.EsercizioPerCasa2;

import java.util.List;

public class MainEs2 {
    public static void main(String[] args) {

        //creo le pagine
        Pagina p1= new Pagina(1);
        Pagina p2= new Pagina(2);
        Pagina p3= new Pagina(3);
        Pagina p4= new Pagina(4);

        //creo una sottosezione
        Sezione sottosezione=new Sezione("Introduzione");
        sottosezione.add(p1);
        sottosezione.add(p2);


        //creo una sezione

        Sezione capitolo=new Sezione("Capitolo 1");
        capitolo.add(sottosezione);
        capitolo.add(p3);
        capitolo.add(p4);


        //creo un libro
        Libro libro1= new Libro("Cado malato",20, List.of("Ioan","Octavian","Andrei"));
        libro1.add(capitolo);

        // stampo il libro
        libro1.stampa();
        System.out.println("Totale pagine: " + libro1.getNumeroPagine());



    }
}
