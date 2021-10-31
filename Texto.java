/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Texto.java
* Creación de clase hija texto
**/
public class Texto extends Post {
    private String texto;

    public Texto(String nombre, String hashtag, String texto){
        super(nombre,hashtag);
        this.texto= texto;
    }


    public String getTexto(){
        return texto;
    }

    //Datos
	//Mostrar en pantalla los datos 
	public void mostrar(){
		System.out.println("Nombre: "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtag + "(texto)"+ texto );
	}

    @Override
    public String toString() {
        return "Nombre: "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtag + "\n(texto)"+ texto ;
    }

}
