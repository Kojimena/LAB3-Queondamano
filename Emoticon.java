/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Emoticon.java
* Creación de clase hija emoticon
**/
import java.util.ArrayList;

public class Emoticon extends Post {
    private String emoticon;

    public Emoticon(String nombre,ArrayList<String> hashtags , String emoticon, String fecha){
        super(nombre,hashtags,fecha);
        this.emoticon= emoticon;
    }


    public String getEmoticon(){
        return emoticon;
    }

    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("\n"+"emoticon: "+ emoticon);
	}

    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtags + "\n(emoticon)"+ emoticon+ "\n"+"---> comentarios : "+ comentarios+"\n";
    }
}
