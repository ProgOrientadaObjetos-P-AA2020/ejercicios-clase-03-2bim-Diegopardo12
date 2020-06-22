
package paquetecinco;

import java.util.ArrayList;
import java.util.Scanner;
import paquetecuatro.Estudiante;
import paquetecuatro.EstudianteDistancia;
import paquetecuatro.EstudiantePresencial;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador = 0;
        int j =0;
        int a = 0;
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        System.out.println("Cuantos estudiantes desea ingresar: ");
        int n = entrada.nextInt();
        System.out.println("Cuantos estudiantes presencial desea ingresa de los "+ n +": ");
        int ep = entrada.nextInt();
        System.out.println("Cuantos estudiantes distancia desea ingresa de los "+ n +": ");
        int ed = entrada.nextInt();
        while (contador < n) {
            
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            if (tipoEstudiante  == 1) {
                if (a == ep) {
                        System.out.println("Limite de estudiantes alcanzado\n ");
                        continue;
                } 
                while (a < ep) {
                    System.out.println("Ingrese los nombres del estudiante");
                    nombresEst = entrada.nextLine();
                    System.out.println("Ingrese los apellidos del estudiante");
                    apellidosEst = entrada.nextLine();
                    System.out.println("Ingrese la identificación del estudiante");
                    identificacionEst = entrada.nextLine();
                    System.out.println("Ingrese la edad del estudiante");
                    edadEst = entrada.nextInt();

                    EstudiantePresencial estudianteP = new EstudiantePresencial();

                    System.out.println("Ingrese el número de créditos");
                    numeroCreds = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada créditos");
                    costoCred = entrada.nextDouble();

                    estudianteP.establecerNombresEstudiante(nombresEst);
                    estudianteP.establecerApellidoEstudiante(apellidosEst);
                    estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteP.establecerEdadEstudiante(edadEst);
                    estudianteP.establecerNumeroCreditos(numeroCreds);
                    estudianteP.establecerCostoCredito(costoCred);

                    estudiantes.add(estudianteP);
                    a++;
                    }
                } else {
                    if (j == ed) {
                        System.out.println("Limite de estudiantes alcanzado\n ");
                        continue;
                    }                     
                    while ( j < ed) {
                        System.out.println("Ingrese los nombres del estudiante");
                        nombresEst = entrada.nextLine();
                        System.out.println("Ingrese los apellidos del estudiante");
                        apellidosEst = entrada.nextLine();
                        System.out.println("Ingrese la identificación del estudiante");
                        identificacionEst = entrada.nextLine();
                        System.out.println("Ingrese la edad del estudiante");
                        edadEst = entrada.nextInt(); 
                        EstudianteDistancia estudianteD = new EstudianteDistancia();
                        // Solicitar ingreso de valores para variables 
                        // Solicitar numeroAsigs, costoAsig 
                        // Leer numeroAsigs, costoAsig
                        System.out.println("Ingrese el número de asignaturas");
                        numeroAsigs = entrada.nextInt();
                        System.out.println("Ingrese el costo de cada cada asignatura");
                        costoAsig = entrada.nextDouble();

                        estudianteD.establecerNombresEstudiante(nombresEst);
                        estudianteD.establecerApellidoEstudiante(apellidosEst);
                        estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                        estudianteD.establecerEdadEstudiante(edadEst);
                        estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                        estudianteD.establecerCostoAsignatura(costoAsig);

                        estudiantes.add(estudianteD);   
                        j++;
                    }
            
                }
            contador++;
        }
        
                
        for( int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    
    }
    }

