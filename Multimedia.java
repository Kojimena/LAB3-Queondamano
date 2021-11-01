/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Multimedia.java
* 
**/
public abstract class Multimedia extends Post{
    protected String url;
    protected int TamKb;
    public Multimedia(String nombre, String hashtag, String url, int TamKb){
        super(nombre,hashtag);
        this.url= url;
        this.TamKb= TamKb;
    }

    public String getUrl(){
        return url;
    }

    public int getTamKb(){
        return TamKb;
    }


}
