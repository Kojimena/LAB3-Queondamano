/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Multimedia.java
* 
**/
import java.util.ArrayList;

public abstract class Multimedia extends Post{
    protected String url; //propiedades protected
    protected int TamKb;

    //constructor de multimedia
    public Multimedia(String nombre,ArrayList<String> hashtags , String url, int TamKb, String fecha){
        super(nombre,hashtags,fecha);
        this.url= url;
        this.TamKb= TamKb;
    }

    //override likes
    public int darLike(){
		if (likes<0){
			likes = 1;
		}else{
            likes= likes+1;
        }
		return likes; 
	}

    /**
    * @return Url
    * getter
    */
    public String getUrl(){
        return url;
    }

    /**
    * @return Tamaño en Kb
    * getter
    */
    public int getTamKb(){
        return TamKb;
    }


}
