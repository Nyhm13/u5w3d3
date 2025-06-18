package chainOfResponsability.EsercizioPerCasa3;

public class MainEs3 {
    public static void main(String[] args) {
        Tenente tenente= new Tenente();
        Capitano capitano=new Capitano();
        Maggiore maggiore=new Maggiore();
        Colonnello colonnello=new Colonnello();
        Generale generale=new Generale();

        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);


        tenente.confrontaStipendio(2000);
    }
}
