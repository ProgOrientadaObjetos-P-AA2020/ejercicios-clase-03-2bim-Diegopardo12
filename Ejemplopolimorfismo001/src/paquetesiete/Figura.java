
package paquetesiete;

public abstract class Figura {
    protected String caracteristicas;
    protected double area;
    //constructor de la Super clase Figura
    public Figura(String caracteris){
        caracteristicas = caracteris;   
    }
    //metodo establcer de la clase figura
    public void establecerCaracteristicas(String caracteris){
        caracteristicas = caracteris;
    }
    // método sin impĺementar 
    // implementacion en las clases derivadas
    public abstract void calcular_area();
     //metodos obtener de la clase figura
    public String obtenerCaracteristicas(){
        return caracteristicas;
    }

    public double obtenercalcular_area(){
        return area;
    }
    @Override
    public String toString() {
        String cadena = String.format("Caracteristica: %s\n"
                + "Area: %s\n",
                caracteristicas,
                area);

        return cadena;
    }
}
