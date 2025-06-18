package adapter;

import java.util.ArrayList;
import java.util.List;

public class CalcolatoreFigure {

    private List<Figura> figure;

    //nel costruttore inizializzo la lista vuota e non riceve nessun parametro
    public CalcolatoreFigure() {
        this.figure = new ArrayList<>();
    }


    public void add(Figura figura){
        figure.add(figura);
    }


    public double totalePerimetri(){
        return  figure.stream().mapToDouble(figura ->figura.perimetro()).sum();
    }

    public double totaleAree(){
        return  figure.stream().mapToDouble(figura ->figura.area()).sum();
    }
}
