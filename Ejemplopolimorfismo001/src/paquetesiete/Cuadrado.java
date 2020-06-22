
package paquetesiete;
//clase cuadrado subclase de Figura
public class Cuadrado extends Figura{
    double lado;
    //constructor de la clase cuadrado
    public Cuadrado(String caracteris,double la) {
        super(caracteris);
        lado = la;
    }
    //metodos establecer y calcular
    public void establecerLado(double la){
        lado = la;
    }

    @Override
    public void calcular_area() {
        area = Math.pow(lado, 2);
    }
    //metodos obtener para la clase cuadrado
    public double obtenerLado(){
        return lado;
    }
    public double obtenerArea(){
        return area;
    }
    //metodo toString para retornar valores a la clase main
    public String toString() {
        String cadena = String.format("%s", super.toString()
                + "Figura: Cuadrado");

        return cadena;
    }
}
