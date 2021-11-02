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
    //protected String hashtag; //n
    protected int likes;
    protected String hora;
    protected String fecha;
    protected boolean sipost;
    Fecha tiempo = new Fecha();
    protected ArrayList<Comentarios> comentarios = new ArrayList<>();
    protected ArrayList<String> hashtags = new ArrayList<>();//n

    public Post(String nombre,ArrayList<String> hashtagsp, String fecha){
        this.nombre = nombre;
        likes = 0;
        hora = tiempo.horaActual();
        this.fecha = fecha;
        for (int i = 0; i < hashtagsp.size(); i++){
            hashtags.add(hashtagsp.get(i));
        }
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

    public ArrayList<String> hashtagsgetHashtag(){
        return hashtags;
    } //n

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
