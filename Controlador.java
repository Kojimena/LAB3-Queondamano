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
            String name= vista.getNombre();
            String hashtag= vista.getHastag();
            switch (opcionpost) {
                case 1:
                //post de texto
                String texto = vista.getPosttexto();
                posts.add(new Texto(name,hashtag, texto));
                break;

                case 2:
                //posts multimedia
                String Url = vista.getUrl();
                int Kb= vista.getTamKb();
                int opcionmultimedia= vista.menuPmultimedia();
                switch (opcionmultimedia) {
                    case 1:
                    //imagen
                    String formato= vista.getFormato();
                    int resolucion= vista.getResolucion();
                    posts.add(new Imagen(name,hashtag,Url,Kb,formato,resolucion));
                    break;
                    case 2:
                    //audio
                    break;
                    case 3:
                    //video
                    break;
                }

                break;

                case 3:
                //post emoticon
                String emoticon = vista.getPostemoticon();
                
                posts.add(new Emoticon(name,hashtag, emoticon));
                break;
            }
            for (int i = 0; i < posts.size(); i++) {
                System.out.println("\n"+posts.get(i)); }

            break;

            case 2:
            //buscar post por fecha
            break;
            case 3:
            //buscar post por hashtag
            break;
            case 4:
            //mostrar posts actuales 
            System.out.println("Posts: ");
            if(posts!=null){
                for (int i = 0; i < posts.size(); i++) {
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
