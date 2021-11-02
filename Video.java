/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Video.java
* 
**/
import java.util.ArrayList;
public class Video extends Multimedia{
    private int Framerate; //propiedades private

    //constructor de Video
    public Video(String nombre,ArrayList<String> hashtags , String url, int TamKb,int Framerate, String fecha){
    super(nombre, hashtags , url, TamKb,fecha);
    this.Framerate= Framerate;
    }

    //Datos Override
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("\n"+"voy a MOSTRAR este video... con "+ Framerate + " fps ");
	}

    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtags + "\n(Audio)"+ url+ "\n"+TamKb+" Kb, "+"Framerate: "+ Framerate+"\n"+"---> comentarios: "+ comentarios+"\n";
    }
}
