package adapter;

public class Rettangolo implements  FigureGeometriche{

    private double base;
    private double altezza;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double area() {
        return base*2+altezza*2;
    }

    @Override
    public double perimetro() {
        return base*altezza;
    }
}
