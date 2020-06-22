
package paquetesiete;

public class Rombo extends Figura {
    double diagonalmenor ;
    double diagonalmayor;

    public Rombo(String caracteris,double dm,double dme) {
        super(caracteris);
        diagonalmenor = dme;
        diagonalmayor = dm;
    }
    //metodos establcer y calcular de la clase rombo
    public void establecerDiagonalMayor(double dm){
        diagonalmayor = dm;
    }
    public void establecerDiagonalMenor(double dme){
        diagonalmenor = dme;
    }
    //se sobrescribe el metodo abstract de la super clase
    @Override
    public void calcular_area() {
        area = (diagonalmayor * diagonalmenor )/ 2;
    }
    //metodos obtener de la clase rombo
    public double obtenerDiagonalMayor(){
        return diagonalmayor;
    }
    public double obtenerDiagonalMenor(){
        return diagonalmenor;
    }
    public double obtenerArea(){
        return area;
    }
    public String toString() {
        String cadena = String.format("%s", super.toString()
                + "Figura: Rombo");

        return cadena;
    }
}
