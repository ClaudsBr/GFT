package project01;
public abstract class Transporte {
    protected  int distancia;
    protected Carga carga;

    public Transporte(int distancia, Carga carga) {
        this.distancia = distancia;
        this.carga = carga;
    }
    
    public abstract int calculaFrete(int distancia);
    
    
}
