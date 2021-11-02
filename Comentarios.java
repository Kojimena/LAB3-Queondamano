/**
* @author: Karen Jimena Hernández Ortega
* @version: 30-Oct-21
* @file: Comentarios.java 
*Esta clase será para los comentarios de los posts
**/

public class Comentarios {
    private String comentario;

    public Comentarios(String comentario){
        this.comentario= comentario;
    }

    public Comentarios(){
        this.comentario= "ninguno";
    }

    public String getComentario(){
        return comentario;
    }

    @Override
    public String toString() {
        return " "+ comentario;
    }
}
