package adapter;

public class Main {
    public static void main(String[] args) {

        Quadrato q1= new Quadrato(3);
        Quadrato q2= new Quadrato(5);


        // il rettangolo non e compatibile con l`interfaccia Figura perche discended a FiguraGeometrica per questo creiamo un adapter
        Rettangolo r1= new Rettangolo(4,5);

        CalcolatoreFigure calcolatoreFigure= new CalcolatoreFigure();

        FiguraGeometricaAdapter r1Adapter = new FiguraGeometricaAdapter(r1);

        calcolatoreFigure.add(q1);
        calcolatoreFigure.add(q2);

        calcolatoreFigure.add(r1Adapter);


        System.out.println(calcolatoreFigure.totaleAree());
        System.out.println(calcolatoreFigure.totalePerimetri());
    }
}
