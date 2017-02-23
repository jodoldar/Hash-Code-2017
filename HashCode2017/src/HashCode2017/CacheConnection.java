package HashCode2017;

/**
 *
 * @author Josep Dols
 */
public class CacheConnection {
    protected int latency;
    protected Cache cacheId;
    protected Endpoint endpointId;
    
    public CacheConnection(Cache c,int l, Endpoint e){
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
    public Endpoint getEndpointId(){
        return this.endpointId;
    }
}
