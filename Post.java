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
    Fecha tiempo = new Fecha();
    private ArrayList<Comentarios> comentarios = new ArrayList<>();


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

    public String getHora(){
        return hora;
    }
    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("Nombre: "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" ");
	}

    @Override
    public String toString() {
        return ""+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes ;
    }


    
}
