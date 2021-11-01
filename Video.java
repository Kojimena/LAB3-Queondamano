/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Video.java
* 
**/
public class Video extends Multimedia{
    private int Framerate;

    public Video(String nombre, String hashtag, String url, int TamKb,int Framerate){
    super(nombre, hashtag, url, TamKb);
    this.Framerate= Framerate;
    }

    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtag + "\n(Audio)"+ url+ "\n"+TamKb+" Kb, "+"Framerate: "+ Framerate+"\n";
    }
}
