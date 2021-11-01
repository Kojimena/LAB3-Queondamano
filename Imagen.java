/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Imagen.java
* Hereda de multimedia
**/
public class Imagen extends Multimedia {
    private String formato;
    private int resolucion;

    public Imagen(String nombre, String hashtag, String url, int TamKb, String formato, int resolucion){
        super(nombre, hashtag, url, TamKb);
        this.formato= formato;
        this.resolucion=resolucion;
    }

    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtag + "\n(Imagen)"+ url+ "\n"+TamKb+" Kb, "+formato+" ,"+ resolucion+ " Megapixeles " ;
    }
}
