/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Audio.java
* Hereda de multimedia
**/
import java.util.ArrayList;
public class Audio extends Multimedia {
    private int Samplerate; //propiedades private
    private int BitDepth;

    //constructor de audio
    public Audio(String nombre,ArrayList<String> hashtags, String url, int TamKb, int Samplerate, int BitDepth, String fecha){
        super(nombre,hashtags, url, TamKb,fecha);
        this.Samplerate= Samplerate;
        this.BitDepth= BitDepth;
    }

    //Datos Override
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("\n"+"voy a SONAR este audio... con "+ Samplerate + "kHz de sample rate y " + BitDepth+" de bit depth");
	}

    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtags + "\n(Audio)"+ url+ "\n"+TamKb+" Kb, "+"Samplerate: "+Samplerate+"Khz"+" ,"+"BitDepth:"+ BitDepth+"\n"+"---> comentarios : "+ comentarios+"\n";
    }
}
