/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Audio.java
* Hereda de multimedia
**/
public class Audio extends Multimedia {
    private int Samplerate;
    private int BitDepth;
    public Audio(String nombre, String hashtag, String url, int TamKb, int Samplerate, int BitDepth){
        super(nombre, hashtag, url, TamKb);
        this.Samplerate= Samplerate;
        this.BitDepth= BitDepth;
    }

    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "likes:"+ likes +" "+ "\n"+ hashtag + "\n(Audio)"+ url+ "\n"+TamKb+" Kb, "+"Samplerate: "+Samplerate+"Khz"+" ,"+"BitDepth:"+ BitDepth;
    }
}
