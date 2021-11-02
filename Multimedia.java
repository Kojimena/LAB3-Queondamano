/**
* @author: Karen Jimena Hernández Ortega
* @version: 31-Oct-21
* @file: Multimedia.java
* 
**/
import java.util.ArrayList;

public abstract class Multimedia extends Post{
    protected String url;
    protected int TamKb;
    public Multimedia(String nombre,ArrayList<String> hashtags , String url, int TamKb, String fecha){
        super(nombre,hashtags,fecha);
        this.url= url;
        this.TamKb= TamKb;
    }

    public int darLike(){
		if (likes<0){
			likes = 1;
		}else{
            likes= likes+1;
        }
		return likes; 
	}

    public String getUrl(){
        return url;
    }

    public int getTamKb(){
        return TamKb;
    }


}
