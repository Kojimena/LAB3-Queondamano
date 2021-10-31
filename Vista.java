/**
* @author: Karen Jimena Hernández Ortega
* @version: 30-Oct-21
* @file: Vista.java
* Esta clase es la vista del programa.Imprime resultados y pide datos.
**/

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.InputMismatchException; 

public class Vista {
    Scanner scan = new Scanner(System.in);
    int opcion;

    /**
    * @param: String
    * imprime texto
    **/ 
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    */
    public int menu(){
		int opcion;
                mensaje("\n" +"¿Qué desea hacer?");
                System.out.println("1. Realizar un post");
                System.out.println("2. Buscar un post por fecha en particular ");
                System.out.println("3. Buscar un post por hashtag");
                System.out.println("4. Mostrar posts");
                System.out.println("5. Salir de QueOndamano ");

                System.out.print("Seleccion: ");
            try {
                opcion = scan.nextInt();
            
            } catch (InputMismatchException e) {
                mensaje("Porfavor, ingrese una opción válida");
                Scanner scan = new Scanner(System.in);
                opcion = scan.nextInt();
            
            }
        
		scan.nextLine();
		return opcion;
    }

    /**
    * Despliega el menú de opciones de tipo de post para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    */
    public int menuPost(){
		int opcion;
                mensaje("\n" +"¿Qué tipo de post desea subir?");
                System.out.println("1. Texto");
                System.out.println("2. Multimedia ");
                System.out.println("3. Emoticon");

                System.out.print("Seleccion: ");
            try {
                opcion = scan.nextInt();
            
            } catch (InputMismatchException e) {
                mensaje("Porfavor, ingrese una opción válida");
                Scanner scan = new Scanner(System.in);
                opcion = scan.nextInt();
            
            }
        
		scan.nextLine();
		return opcion;
    }

    /**
    * Despliega el menú de opciones de post multimedia para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    */
    public int menuPmultimedia(){
		int opcion;
                mensaje("\n" +"¿Qué tipo de post multimedia desea subir?");
                System.out.println("1. Imagen");
                System.out.println("2. Audio ");
                System.out.println("3. Video");

                System.out.print("Seleccion: ");
            try {
                opcion = scan.nextInt();
            
            } catch (InputMismatchException e) {
                mensaje("Porfavor, ingrese una opción válida");
                Scanner scan = new Scanner(System.in);
                opcion = scan.nextInt();
            
            }
        
		scan.nextLine();
		return opcion;
    }

    public String getNombre(){
        System.out.printf("\nIngrese su nombre de usuario ");

        String nombre = scan.nextLine();

        return nombre;
    }  

    public String getPosttexto(){
        System.out.printf("\nIngrese el Texto que desea publicar (longitud máx:20 caracteres) ");

        String Ptexto= scan.nextLine();

        while(Ptexto.length()>20){
           mensaje("El texto posee más de 20 caracteres, pruebe con otro texto");
           Ptexto= scan.nextLine();
        }
        return Ptexto;
    }  

    public String getHastag(){
        System.out.printf("\nIngrese el hashtag que deseea agregar (unicamente la palabra)");

        String hashtag = scan.nextLine();

        return "#"+ hashtag;
    }  





}