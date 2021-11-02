/**
* @author: Karen Jimena Hernández Ortega
* @version: 30-Oct-21
* @file: Vista.java
* Esta clase es la vista del programa.Imprime resultados y pide datos.
**/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException; 

public class Vista {
   private Scanner scan = new Scanner(System.in);
   private  int opcion;
   private int contador = 0;

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
                System.out.println("2. Buscar y mostrar un post por fecha en particular ");
                System.out.println("3. Buscar y mostrar un post por hashtag");
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
           mensaje("El texto posee más de 20 caracteres, pruebe con otro texto ");
           Ptexto= scan.nextLine();
        }
        return Ptexto;
    }  

    public String getPostemoticon(){
        System.out.printf("\nIngrese el emoticon que desea postear [ejemplos: :) :( <3 ] ");

        String Ptexto= scan.nextLine();

        while(Ptexto.length()>5){
           mensaje("El emoticon que esta ingresando no es válido, pruebe con otro ");
           Ptexto= scan.nextLine();
        }
        return Ptexto;
    }  

    public ArrayList<String> getHastag(){
        ArrayList<String> hashtagsv= new ArrayList<String>();
        int sihashtag ;
        String hashtag;

        System.out.printf("\n Agregue el hashtag para el post ");  
        do {
        System.out.printf("\nIngrese el hashtag que deseea agregar (unicamente la palabra) ");
        hashtag = scan.nextLine();
        hashtagsv.add("#"+ hashtag);
        System.out.printf("\n ¿Desea agregar otro hashtag elija(1 o 2)? 1.si 2.no");
        sihashtag = scan.nextInt();
        scan.nextLine();
        if (sihashtag == 2)
                System.out.println( "No se agregarán" );
        }
        while (sihashtag == 1);

        return hashtagsv;
    }  

    public String getUrl(){
        
        System.out.printf("\nIngrese el url de su post ");

        String url = scan.nextLine();

        return url;
    }  

    public int getTamKb(){
        int Kb;
        System.out.printf("\nIngrese el tamaño en Kb de su post ");
        try {
            Kb = scan.nextInt();

        } catch (InputMismatchException e) {
            mensaje("Porfavor, ingrese un número");
                Scanner scan = new Scanner(System.in);
                Kb = scan.nextInt();
            
            }
		scan.nextLine();
        return Kb;
    }

    public int getResolucion(){
        int resolucion;
        System.out.printf("\nIngrese la resolución de su imagen en Megapixeles ");
        try {
            resolucion = scan.nextInt();

        } catch (InputMismatchException e) {
            mensaje("Porfavor, ingrese un número");
                Scanner scan = new Scanner(System.in);
                resolucion = scan.nextInt();
            
            }
		scan.nextLine();

        return resolucion;
    } 

    public String getFormato(){

        System.out.printf("\nIngrese el formato de su imagen de su imagen (png,gif,jpeg) ");
        String formato = scan.nextLine();
        return formato;
    }


    public int getSampleRate(){
        int SampleRate;
        System.out.printf("\nIngrese el SampleRate del audio (Khz) ");
        try {
            SampleRate = scan.nextInt();

        } catch (InputMismatchException e) {
            mensaje("Porfavor, ingrese un número");
                Scanner scan = new Scanner(System.in);
                SampleRate = scan.nextInt();
            
            }
		scan.nextLine();

        return SampleRate;
    } 

    public int getBitdepth(){
        int Bitdepth;
        System.out.printf("\nIngrese el Bitdepth del audio ");
        try {
            Bitdepth = scan.nextInt();

        } catch (InputMismatchException e) {
            mensaje("Porfavor, ingrese un número");
                Scanner scan = new Scanner(System.in);
                Bitdepth = scan.nextInt();
            
            }
		scan.nextLine();

        return Bitdepth;
    } 

    public int getFramerate(){
        int framerate ;
        System.out.printf("\nIngrese el framerate del video (fps) ");
        try {
            framerate  = scan.nextInt();

        } catch (InputMismatchException e) {
            mensaje("Porfavor, ingrese un número");
                Scanner scan = new Scanner(System.in);
                framerate  = scan.nextInt();
            
            }
		scan.nextLine();

        return framerate ;
    } 

    public String getFechabusqueda(){

        System.out.printf("\nIngrese la fecha del post que desea (formato: dd/mm/aa) ");
        String fechabusqueda = scan.nextLine();
        return fechabusqueda;
    }

    
    public String getHastagbusqueda(){
        
        System.out.printf("\nIngrese el hashtag con el que deseea buscar posts (unicamente la palabra) ");

        String hashtag = scan.nextLine();

        return "#"+ hashtag;
    }  

    public int menuLikeorcomment(){
		int opcion;
                mensaje("\n" +"¿Qué desea hacer?");
                System.out.println("1. Darle like al post seleccionado");
                System.out.println("2. Comentar el post seleccionado");
                System.out.println("3. Salir de QueOndaMano");

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

    public static int checkNumerico(String numero){
        int resultado = 0; //Valor predeterminado 0
        try{
            if(numero != null){
                resultado =  Integer.parseInt(numero);

                if(resultado < 0){
                    resultado = Math.abs(resultado);
                }
            }
        }catch(NumberFormatException nfe){
            System.out.println("Error NumberFormatException value: " + numero);
        }
        return resultado;
    }

    public int choosePost(ArrayList<Post> postbusquedah){
        int space = 0;
        String esp;
        int indice =0;
        
        while(space == 0){
              System.out.printf("\nIngrese el número del post que desea: ");
              esp = scan.nextLine();
              int res = checkNumerico(esp);
              
              
              if(res == 0){
                 System.out.printf("Debes ingresar un numero!");
              }
              else{
                  indice = res - 1;
                  if(postbusquedah.get(indice).isPost() == true){
                      System.out.printf("Post seleccionado: " + (res)+"\n");
                      space=1;
                  }
                  else{
                      System.out.printf("Post seleccionado: " + (res));
                         space= space +1;
                  }
              }
            
        }
          
        return indice;
       
    }

    public String getComentariospost(){
        System.out.printf("\nIngrese el comentario que desea colocar en el post (longitud máx:20 caracteres) ");

        String Ptexto= scan.nextLine();

        while(Ptexto.length()>20){
           mensaje("El comentario posee más de 20 caracteres, pruebe con otro texto ");
           Ptexto= scan.nextLine();
        }
        return Ptexto;
    }  

    public String getDate(){
        
        System.out.printf("\nIngrese la fecha del post en formato (dd/mm/aa) ");

        String date = scan.nextLine();

        return date;
    } 
    
}