package HashCode2017;

/**
 *
 * @author Josep Dols
 */
public class CacheConnection {
    protected int latency;
    protected int cacheId;
    protected int endpointId;
    
    public CacheConnection(int l, int c, int e){
        this.cacheId = c;
        this.endpointId = e;
        this.latency = l;
    }
    
    public int getLatency(){
        return this.latency;
    }
    public int getCacheId(){
        return this.cacheId;
    }
    public int getEndpointId(){
        return this.endpointId;
    }
}
