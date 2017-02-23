package HashCode2017;

/**
 *
 * @author Josep Dols
 */
public class CacheConnection {
    protected int latency;
    protected Cache cacheId;
    protected int endpointId;
    
    public CacheConnection(int l, Cache c, int e){
        this.cacheId = c;
        this.endpointId = e;
        this.latency = l;
    }
    
    public int getLatency(){
        return this.latency;
    }
    public Cache getCacheId(){
        return this.cacheId;
    }
    public int getEndpointId(){
        return this.endpointId;
    }
}
