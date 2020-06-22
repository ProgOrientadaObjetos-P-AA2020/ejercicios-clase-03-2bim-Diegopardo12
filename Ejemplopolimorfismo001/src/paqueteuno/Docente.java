
package paqueteuno;
//la clase abstracta no deberia ir por q nohay metodos abstractos y por en ende no hay como utilizar en otras clases
public abstract class Docente {
    private String nombre;
    
    public Docente(String n){
        nombre = n;
    }
    
    public void establecerDocente(String n){
        nombre = n;
    }
    public abstract void setapellido();
    
    public String obtenerDocente(){
        return nombre;
    }
}
