package HashCode2017;

/**
 *
 * @author Josep Dols
 */
public class Cache {
    protected int cacheId;
    protected int tamMax;
    protected int ocupado;
    
    public Cache(int c, int t){
        this.cacheId = c;
        this.tamMax = t;
        this.ocupado = 0;
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
