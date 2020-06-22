/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        Scanner entrada = new Scanner(System.in);
        String caracteristicas = "son figuras cuyos puntos están en un plano, esto es,"
                + " tienen anchura y altura";
        //declaracion de variables
        double lado;
        double diagonalmenor ;
        double diagonalmayor;
        double base;
        double altura;
        int c = 0,cua = 0,rom = 0,tri = 0;
        int op =0;
        
        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
         
        while(c < 13){
            //menu para que el usuario ingrese los datos
            System.out.println("Que figura desea ingresar:\n"
                    + "1.Ingresar un cuadrado: \n"
                    + "2.Ingresar un Rombo: \n"
                    + "3.Ingresar un Triangulo: \n");
            op = entrada.nextInt();
            if (op == 1 ) {
                if (cua == 4) {
                    System.out.println("Limite de cuadrados alcanzado\n ");
                        continue;
                }
                while(cua < 4){
                    System.out.println("Ingrese el valor de un lado del cuadrado: ");
                    lado = entrada.nextDouble();
                    //objeto de tipo cuadrado
                    Cuadrado cuadr1 = new Cuadrado(caracteristicas,lado);
                    figuras.add(cuadr1);
                    cua++;
                  break;  
                }
            } else {
            if (op == 2) {
                if (rom == 3) {
                    System.out.println("Limite de rombos alcanzado\n ");
                        continue;
                }
                //ciclo para ingresar datos de a la clase rombo
                while (rom < 3 ){
                    System.out.println("Ingrese la diagonal mayor");
                    diagonalmayor = entrada.nextDouble();
                    System.out.println("Ingrese la diagonal menor");
                    diagonalmenor = entrada.nextDouble();
                    //objeto de tipo rombo
                    Rombo rom1 = new Rombo(caracteristicas,diagonalmayor,diagonalmenor);
                    figuras.add(rom1);
                    rom++;
                   break;
                }
                
            }else{
            if (op == 3) {
                if (tri == 5 ) {
                    System.out.println("Limite de triangulos alcanzado\n ");
                        continue;
                }
                //ciclo para ingresar datos para la clase triangulo
                while(tri < 5){
                    System.out.println("Ingrese la base del triangulo: \n");
                    base = entrada.nextDouble();
                    System.out.println("Ingrese la altura del triangulo: \n");
                    altura = entrada.nextDouble();
                    //objeto de tipo Triangulo
                    Figura tri1 = new Triangulo(caracteristicas,base,altura);
                    figuras.add(tri1);
                    tri++;
                    break;
                }   
            }
             }
            
            }
        }
        
        
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
           System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
    }
}
