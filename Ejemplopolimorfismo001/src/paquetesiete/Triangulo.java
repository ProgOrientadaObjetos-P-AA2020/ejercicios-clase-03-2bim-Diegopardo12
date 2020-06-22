
package paquetesiete;
    
public class Triangulo extends Figura {
    
    double base;
    double altura;
    //constructor de la calse triangulo
    //se le pasan los parametros de la super clase
    public Triangulo(String caracteristica, double bas, double al){
        super(caracteristica);
        base = bas;
        altura = al;    
    }
    //metodos estblecer y calcular de la clase triangulo
    public void establecerBase(double bas){
        base = bas;
    }
    
    public void establecerAltura(double al){
        altura = al ;
    }
    // se sobreescribe el metodo
    @Override
    public void calcular_area(){
        area = (base  * altura )/2;
    }
    //metodos obetener de la clase triangulo
    public double obtenerBase(){
        return base;
    }
    
    public double obtenerAltura(){
        return altura;
    }
    
    public double obtenerArea(){
        return area;
    }
    //metodo para retornar y mostrar en pantalla los valores
    public String toString() {
        String cadena = String.format("%s", super.toString()
                + "Figura: Triangulo");

        return cadena;
    }
}
