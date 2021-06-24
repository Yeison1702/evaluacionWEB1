/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionweb1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Patri
 */
public class EvaluacionWEB1 {
    


    
    public static void main(String[] args) {
        
    // En una finca entre gallinas y conejos, se cuentan
    //50 cabezas y 140 patas ¿Cuántas gallinas y conejos hay en la granja?
        
        
       /* Scanner entrada = new Scanner(System.in);
        //Definir Variables
        float patas,cabezas;
        double y,x;
        
        //Datos entrada
        System.out.println("Ingrese la cantidad de Cabezas: ");
        cabezas=entrada.nextFloat();
        System.out.println("Ingrese la cantidad de Patas: ");
        patas=entrada.nextFloat();
        
        //Ecuación
        
        y=((cabezas*-2)+patas)/2;
        x=cabezas-y;
        
        //Datos salida
        
        System.out.print("La cantidad de conejos es: " + y);
        System.out.print (" la cantidad de gallinas es: " + x);
       */
        
        
        
       // 2.(valor 1.0) Pedir 20 números y contar cuantos de los
       //ingresados fueron negativos
        
       /* Scanner entrada = new Scanner(System.in);
        
         //Definir variables
       int[] numeros= new int[20];
       int negativos=0;
       
         //Proceso y datos de entrada con ciclo for
        for (int i = 0; i < numeros.length ;i++) {

            System.out.print("Digite 20 numeros: ");
            numeros[i]=entrada.nextInt();
            
           
            if(numeros[i]<0){
              
                negativos++;
            }
            
           

        }
        //Datos de salida
        System.out.println("La cantidad de numero negativos es: " + negativos);
        */
        
       // 3.(valor 1.0) Crear una matriz de enteros (tamaño a elección
       //del usuario) y obtener en un nuevo arreglo unidimensional la suma de cada columna
        
        /*Scanner entrada = new Scanner(System.in);
        
        //Definir tamaño y variables (relleno random)
         System.out.print("Escriba un numero de columnas: ");
        int columnas=entrada.nextInt();
         System.out.print("Escriba un numero de filas: ");
        int filas=entrada.nextInt();
        
        int mat[][]=new int[filas][columnas];
        int sumcolumnas=0;
        Random r=new Random();
        
        
        //  Rellenar Matriz
             for (int i = 0; i < mat.length; i++) {  
             for (int j = 0; j < mat[0].length; j++) {  
         mat[i][j]=r.nextInt(5)+1;  
      }  
    }
        //Mostrar Matriz  
             for (int i = 0; i < mat.length; i++) {  
             for (int j = 0; j < mat[0].length; j++) {  
          System.out.print(mat[i][j]+"\t");  
       }  
        System.out.println("");  
      }  
        //Suma columnas  
     for (int i = 0; i < mat[0].length; i++) {  
       sumcolumnas=0;  
       for (int j = 0; j < mat.length; j++) {  
         sumcolumnas=sumcolumnas+mat[j][i];  
        }  
       //datos de salida
      System.out.println("La suma de los valores de la columna "+(i+1)+" es: "+sumcolumnas);  
    
     }  
        

    }  */
        
     //4.(valor 2.0) Reinaldo Rueda técnico de la selección Colombia
     //de futbol, lo contrata para elaborar un programa en JAVA que
     //cumpla las siguientes condiciones:
     //Codificar Menú de 5 opciones
    //- op1 Agregar un jugador (solo nombre) a un arreglo
    //- op2 Buscar un jugador por nombre y si no existe notificarlo
    //- op3 Editar un jugador por nombre y si no existenotificarlo
    //- op4 Mostrar toda la convocatoria de jugadores
    //- op5 Salir
    //Nota1: El inventario solo existe mientras se ejecute el
    //programa (23 jugadores en total)
    //Nota2: Trabaje en una interfaz cómoda para don Luis   
        
        
         Scanner entrada = new Scanner(System.in);

         String[] jugadores = new String[23];

        
        //Variables utilizadas
        boolean salir = false;
        int opcion;
        String agregarjugadores;
        
        
        //Utilizado para indicar si hemos entrado un jugador
        boolean rellenado = false;
        //Menu
        do {
 
            //Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Buscar jugador");
            System.out.println("3. Editar jugador");
            System.out.println("4. Mostrar jugadores");
            System.out.println("5. Salir");
            System.out.println("Elije una opcion");
            opcion = entrada.nextInt();
            
            switch (opcion) 
            {  
                case 1:
                rellenado=true;
             if(rellenado)
             {String nuevojugador;
            // Pedir el nombre del jugador que desea agregar
             System.out.println("Ingrese el nombre del jugador a agregar: ");
             nuevojugador=entrada.nextLine();
             // Arregar jugadores a la lista
                 jugadores[0]=nuevojugador;
                 jugadores[1]=nuevojugador;
                 jugadores[2]=nuevojugador;
                 jugadores[3]=nuevojugador;
                 jugadores[4]=nuevojugador;
                 jugadores[5]=nuevojugador;
                 jugadores[6]=nuevojugador;
                 jugadores[7]=nuevojugador;
                 jugadores[8]=nuevojugador;
                 jugadores[9]=nuevojugador;
                 jugadores[10]=nuevojugador;
                 jugadores[11]=nuevojugador;
             }
                              break;
                case 2:
 
                    if (rellenado) {
 
                      System.out.print("Digite un jugador a buscar: ");
                      int jugadoresbuscar=entrada.nextInt();

                    boolean bandera=false;
                    
                            for (int i = 0; i < jugadores.length; i++) {

                                    if(i==jugadoresbuscar){
                                         bandera=true;
               

                                     }else{
                                            bandera=false;
                                        }
                                }
                    

                    if(bandera){
                        System.out.print("el jugador existe en el arreglo");
                    }else{
                        System.out.print("el jugador no existe en el arreglo");
                    }
                  }
                             break;
                    
                    case 4: 
                             
                       if(rellenado){ 
                    
                         for (String nombre : jugadores) {
                        System.out.println(nombre);
                  }
                }
                        break;
                     
                    case 5: 
                        salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 5");
       
          
          
         }
        }
        while (!salir);
        System.out.println("FIN");
        }
}

           
        
        
