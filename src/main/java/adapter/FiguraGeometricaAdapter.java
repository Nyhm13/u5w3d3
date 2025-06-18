package adapter;


/* Adapter pattern
l`adapter e una classe che discende dall`interfaccia in uso, ma ingloba al suo interno un oggettto che discende
dalla nuova interfaccia.In questo modo un oggetto Adapter potrà essere inserito nel calcolatoreFigure perchè compatibile
con l`interfaccia Figura e quindi poter calcolare perimetro ed areaanche degli oggetti che discendono da FigureGeometriche
 */
public class FiguraGeometricaAdapter implements Figura{


    private  FigureGeometriche figureGeometriche;

    public FiguraGeometricaAdapter(FigureGeometriche figureGeometriche) {
        this.figureGeometriche = figureGeometriche;
    }

    public FigureGeometriche getFigureGeometriche() {
        return figureGeometriche;
    }

    public void setFigureGeometriche(FigureGeometriche figureGeometriche) {
        this.figureGeometriche = figureGeometriche;
    }

    @Override
    public double area() {
        return figureGeometriche.area();
    }

    @Override
    public double perimetro() {
        return figureGeometriche.perimetro();
    }
}
