/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Imagen.java
* Hereda de multimedia
**/
import java.util.ArrayList;

public class Imagen extends Multimedia {
    private String formato; //propiedades private
    private int resolucion;

    //constructor de Imagen
    public Imagen(String nombre, ArrayList<String> hashtags , String url, int TamKb, String formato, int resolucion, String fecha){
        super(nombre,hashtags, url, TamKb,fecha);
        this.formato= formato;
        this.resolucion=resolucion;
    }

    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("\n"+"estoy mostrando esta imagen... con "+ resolucion + " Megapixeles de resolución ");
	}


    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtags + "\n(Imagen)"+ url+ "\n"+TamKb+" Kb, "+formato+" ,"+ resolucion+ " Megapixeles "+"\n"+"---> comentarios : "+ comentarios+"\n" ;
    }
}
