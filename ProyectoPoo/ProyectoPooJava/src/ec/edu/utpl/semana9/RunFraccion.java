package ec.edu.utpl.semana9;

public class RunFraccion {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(7,1);
        Fraccion f2 = new Fraccion(5,8);
        Fraccion division = f1.dividir(f2);
        System.out.println(f1+" % "+f2+" = "+division);
    }
}
