/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Emoticon.java
* Creación de clase hija emoticon
**/
public class Emoticon extends Post {
    private String emoticon;

    public Emoticon(String nombre, String hashtag, String emoticon){
        super(nombre,hashtag);
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
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtag + "\n(emoticon)"+ emoticon+ "\n"+"---> comentarios : "+ comentarios+"\n";
    }
}
