/**
* @author: Karen Jimena Hernández Ortega
* @version: 30-Oct-21
* @file: Controlador.java 
*Esta clase controla el programa y se encarga de las operaciones
**/
import java.util.ArrayList;


public class Controlador {
/**
* Main del programa.
**/ 
private static Vista vista = new Vista();


public static void main(String[] args){
    int opcion;
    vista.mensaje("\n" +"---QueOndaMano---");
    opcion = vista.menu(); //se llama la opción
    ArrayList<Post> posts = new ArrayList<Post>();


    /**
    * Ciclo mientras la opcion no sea 4 que es salir, sigue corriendo.
    **/

    while(opcion != 5){
        switch(opcion)
        {
            case 1:  
            //nuevo post
            int opcionpost = vista.menuPost();
            switch (opcionpost) {
                case 1:
                String name= vista.getNombre();
                String texto = vista.getPosttexto();
                String hashtag= vista.getHastag();
                posts.add(new Texto(name,hashtag, texto));
                break;

                case 2:
                break;

                case 3:
                break;
            }
            for (int i = 0; i < posts.size(); i++) {
                System.out.println(posts.get(i)); }

            break;
            case 2:
            //buscar post por fecha
            break;
            case 3:
            //buscar post por hashtag
            break;
            case 4:
            if(posts!=null){
                for (int i = 0; i < posts.size(); i++) {
                    System.out.println("Posts: ");
                    System.out.println(posts.get(i));
                   }
            }
            else    vista.mensaje("");  
            break;

            case 5:
             //salida del programa
             vista.mensaje("saliendo...");
             System.exit(0);
             break;
             //Se le avisa al usuario que no esta ingresando una opción correcta
            default: vista.mensaje("-Opcion invalida, porfavor ingrese una opción valida-");   break;

        } 
        opcion = vista.menu();
    }



    }
}
