package singleton;

import java.time.LocalDate;
/*
* per essere un singletone:
* 1:deve avere una variabile statica che contiene l`istanza della classe. COME ABBIAMO FATTO ALLA RIGA 15*
* 1:la classe deve avere un costrutttore e deve essere private  per non permettere a nessuno di chiamare il costruttore
* 2: deve avere un metodo che restituisce un oggetto di questa classe .Il metodo deve verificare se esiste già un
* oggetto di questa classe.Se non esiste, deve crearlo e restituirlo. Se esiste, deve restituirlo.
* Il metodo deve essere per forza statico per poter essere chiamato senza creare un oggetto della classe.
* Il metodo deve essere per forza statico per poter essere richiamato dall'esterno, visto che non possiamo creare oggetti

 *  */
public class CartaIdentita {

    private String nome;
    private LocalDate dataNascita;
    private String citta;

    private static CartaIdentita cartaIdentita;

    // rendendo il costruttore privato per impedire la creazione di istanze esterne
    // per creare un'istanza di carte
    private CartaIdentita(String nome, LocalDate dataNascita, String citta) {
        this.nome = nome;
        this.dataNascita = dataNascita;
        this.citta = citta;
    }

    public static CartaIdentita getCartaIdentita(){
        if(cartaIdentita==null){
            cartaIdentita = new CartaIdentita("Mario Rossi", LocalDate.of(1990, 1, 1), "Roma");
        }
        return cartaIdentita;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

}
