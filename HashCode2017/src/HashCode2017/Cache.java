package HashCode2017;

import java.util.ArrayList;

/**
 *
 * @author Josep Dols
 */
public class Cache {
    protected int cacheId;
    protected int tamMax;
    protected int ocupado;
    protected ArrayList<Video> videos;
    
    public Cache(int c, int t){
        this.cacheId = c;
        this.tamMax = t;
        this.ocupado = 0;
        videos = new ArrayList<Video>();
    }
    
    public int getCacheId(){
        return this.cacheId;
    }
    public int getTamMax(){
        return this.tamMax;
    }
    public int getOcupado(){
        return this.ocupado;
    }
    
    public void addVideo(Video d){
        this.ocupado+=d.size;
    }
}
