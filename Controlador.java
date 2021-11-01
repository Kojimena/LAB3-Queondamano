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
    ArrayList<Post> postbusquedaf = new ArrayList<Post>();
    ArrayList<Post> postbusquedah = new ArrayList<Post>();


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
                    int Samplerate = vista.getSampleRate();
                    int Bitdepth = vista.getBitdepth();
                    posts.add(new Audio(name, hashtag, Url, Kb, Samplerate, Bitdepth));
                    break;

                    case 3:
                    //video
                    int framerate= vista.getFramerate();
                    posts.add(new Video(name, hashtag, Url, Kb, framerate));
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
            String resp = "";
            //buscar post por fecha
            String fechabusqueda= vista.getFechabusqueda();
            vista.mensaje("Los posts encontrados en la fecha"+ fechabusqueda+ " son los siguientes:");
            for (int i = 0; i < posts.size(); i++) {
                if (posts.get(i).getFecha().equals(fechabusqueda)) {
                    postbusquedaf.add(posts.get(i));
                    //System.out.println(postbusquedaf);
                    
                }
            }
            for (int i = 0; i < postbusquedaf.size(); i++) {
                for(int j = i + 1; j < postbusquedaf.size(); j++)  {
                    if(postbusquedaf.get(i).getName().equals(postbusquedaf.get(j).getName())){    
                        postbusquedaf.remove(j);

                        j--;
                    }
                }
               resp = "\n"+resp + (i+1) + ". " + postbusquedaf.get(i);   
            }
            vista.mensaje(resp); 
            int espacioSelecc = vista.choosePost(postbusquedaf);

            int LikeoComment= vista.menuLikeorcomment();
            switch (LikeoComment) {
                case 1:
                //like 
                postbusquedaf.get(espacioSelecc).darLike();
                vista.mensaje("Se ha dado correctamente el like");
                break;
                case 2:
                //comment
                break;
                case 3:
                //salir
                vista.mensaje("saliendo...");
                System.exit(0);
                break;
            }

            break;

            case 3:
            //buscar post por hashtag
            String res = "";
            String hashtagbusqueda= vista.getHastagbusqueda();
            vista.mensaje("Los posts encontrados con el hashtag"+ hashtagbusqueda+ " son los siguientes:");
            for (int i = 0; i < posts.size(); i++) {
                if (posts.get(i).getHashtag().equals(hashtagbusqueda)) {
                    postbusquedah.add(posts.get(i));
                }
            }
            
            
            for (int i = 0; i < postbusquedah.size(); i++) {
                for(int j = i + 1; j < postbusquedah.size(); j++)  {
                    if(postbusquedah.get(i).getName().equals(postbusquedah.get(j).getName())){    
                        postbusquedah.remove(j);

                        j--;
                    }
                }
               res = "\n"+res + (i+1) + ". " + postbusquedah.get(i);   
            }
            vista.mensaje(res);  
                
            int espacioSelec = vista.choosePost(postbusquedah);

            
            int LikeComment= vista.menuLikeorcomment();
            switch (LikeComment) {
                case 1:
                //like 
                postbusquedah.get(espacioSelec).darLike();
                vista.mensaje("Se ha dado correctamente el like");
                break;
                case 2:
                //comment
                break;
                case 3:
                //salir
                vista.mensaje("saliendo...");
                System.exit(0);
                break;
            }
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
