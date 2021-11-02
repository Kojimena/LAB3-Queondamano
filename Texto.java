/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Texto.java
* Creación de clase hija texto
**/
import java.util.ArrayList;

public class Texto extends Post {
    private String texto; //propiedades private

    //constructor
    public Texto(String nombre, ArrayList<String> hashtags , String texto, String fecha){
        super(nombre,hashtags,fecha);
        this.texto= texto;
    }

    /**
    * @return texto
    * getter
    */
    public String getTexto(){
        return texto;
    }

    //Datos Override
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("\n"+"texto: "+ texto);
	}

    @Override
    public String toString() {
        return ""+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtags + "\n(texto)"+ texto+"\n"+"---> comentarios : "+ comentarios+"\n";
    }

}
