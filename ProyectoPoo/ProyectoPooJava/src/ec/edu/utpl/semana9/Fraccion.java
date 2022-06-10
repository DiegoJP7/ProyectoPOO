package ec.edu.utpl.semana9;

public class Fraccion {
    public static int catidadDeNumeradores=1;//Iniciar Instancia
    public static int cantidadDeDenominadores=1;
    private int numerador;//Atributos
    private int denominador;//Atributos

    public Fraccion() {//Clase
        this.setNumerador(0);
        this.setDenominador(1);
    }

    public Fraccion(int numerador, int denominador) {//Constructor
        this.setNumerador(numerador);
        if( denominador == 0) {
            throw new IllegalArgumentException("Denominador no pueder ser 0 o negativo");//Validar datos
        }
        this.setDenominador(denominador);
    }
    public Fraccion(int numerador) {//Sobrecarga
        this.numerador = numerador;
        this.denominador = 1;
    }

    public int getNumerador() {//Inicio de los get y set
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }//Fin de los get y set
    public String toString() {
        return numerador + "/" + denominador;
    }
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador * f.denominador;
        aux.denominador = this.denominador * f.numerador;
        return aux;
    }
}
