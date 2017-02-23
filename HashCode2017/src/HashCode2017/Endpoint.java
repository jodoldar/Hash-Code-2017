package HashCode2017;

import java.util.ArrayList;

/**
 *
 * @author Josep Dols
 */
public class Endpoint {
    protected int endpointId;
    protected int latency;
    protected CacheConnection[] connections;
    protected ArrayList<Request> requests;
    
    public Endpoint(int e, int l, int c){
        this.endpointId = e;
        this.latency = l;
        this.connections = new CacheConnection[c];
        this.requests = new ArrayList<Request>();
    }
    
    public int getEndpointId(){
        return this.endpointId;
    }
    public int getLatency(){
        return this.latency;
    }
    public CacheConnection[] getAllConnections(){
        return this.connections;
    }
    public CacheConnection getConnectionTo(int c){
        return this.connections[c];
    }
    public ArrayList getAllRequests(){
        return this.requests;
    }
    
    public void addRequest(Request r){
        this.requests.add(r);
    }

    public int minLatency(){
        int minLatency = 0;
        for(int i =0;i<= connections.length;i++){
            if(minLatency > connections.getLatency()){
                minLatency = connections.getLatency();
            }
        }
        return minLatency;
    }

    public CacheConnection minCache(){
        int minLatency = 0;
        int minCache = null;
        for(int i =0;i<= connections.length;i++){
            if(minLatency > connections[i].getLatency()){
                minLatency = connections[i].getLatency();
                minCache = connections[i];
            }
        }
        return minCache;
    }
}
