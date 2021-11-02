/**
* @author: Karen Jimena Hernández Ortega
* @version: 30-Oct-21
* @file: Post.java
* Creación de clase madre "POST"
**/
import java.util.ArrayList;


public abstract class Post {
    //propiedades protected 
    protected String nombre;
    protected String hashtag;
    protected int likes;
    protected String hora;
    protected String fecha;
    protected boolean sipost;
    Fecha tiempo = new Fecha();
    protected ArrayList<Comentarios> comentarios = new ArrayList<>();

    public Post(String nombre, String hashtag){
        this.nombre = nombre;
        likes = 0;
        hora = tiempo.horaActual();
        fecha =tiempo.fechaActual();
        this.hashtag= hashtag; 
        //Comentarios comments = new Comentarios();
        //comentarios.add(comments);
    }

    public String getFecha(){
        return fecha;
    }

    public String getName(){
        return nombre;
    }

    public String getHora(){
        return hora;
    }

    public String getHashtag(){
        return hashtag;
    }

    public int darLike(){
		if (likes<0){
			likes = 1;
		}else{
            likes= likes+1;
        }
		return likes; 
	}

    public ArrayList<Comentarios> Comentar(Comentarios comentario){
        comentarios.add(comentario);
        return comentarios;
    }


    public boolean isPost() {
        return sipost;
    }
    
    public int getLikes(){
        return likes;
    }

    //Datos
	//Mostrar en pantalla los datos 
	public abstract void mostrar();

    @Override
    public String toString() {
        return ""+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes ;
    }


    
}
