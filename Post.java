/**
* @author: Karen Jimena Hernández Ortega
* @version: 30-Oct-21
* @file: Post.java
* Creación de clase madre "POST"
**/
import java.util.ArrayList;


public abstract class Post {
    //propiedades protected 
    protected String nombre; //propiedades protected por ser clase abstracta
    protected int likes;
    protected String hora;
    protected String fecha;
    protected boolean sipost;
    Fecha tiempo = new Fecha();
    protected ArrayList<Comentarios> comentarios = new ArrayList<>(); //string de comentarios
    protected ArrayList<String> hashtags = new ArrayList<>();//string de hashtags

    //constructor
    public Post(String nombre,ArrayList<String> hashtagsp, String fecha){
        this.nombre = nombre;
        likes = 0;
        hora = tiempo.horaActual();
        this.fecha = fecha;
        for (int i = 0; i < hashtagsp.size(); i++){
            hashtags.add(hashtagsp.get(i));
        }
 
    }

    /**
    * @return fecha
    * getter
    */
    public String getFecha(){
        return fecha;
    }

    /**
    * @return nombre
    * getter
    */
    public String getName(){
        return nombre;
    }

    /**
    * @return Hora
    * getter
    */
    public String getHora(){
        return hora;
    }

    /**
    * @return Arraylist de hashtags
    * getter
    */
    public ArrayList<String> hashtagsgetHashtag(){
        return hashtags;
    } 

    /**
    * @return likes
    * método para incrementar likes
    */
    public int darLike(){
		if (likes<0){
			likes = 1;
		}else{
            likes= likes+1;
        }
		return likes; 
	}

    /**
    * @return comentarios
    * @param Comentario
    */
    public ArrayList<Comentarios> Comentar(Comentarios comentario){
        comentarios.add(comentario);
        return comentarios;
    }

    /**
    * @return sipost
    * verificador si hay post
    */
    public boolean isPost() {
        return sipost;
    }
    
    public int getLikes(){
        return likes;
    }

    //Datos método abstracto
	//Mostrar en pantalla los datos 
	public abstract void mostrar();

    @Override
    public String toString() {
        return ""+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes ;
    }


    
}
