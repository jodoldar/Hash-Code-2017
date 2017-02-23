package HashCode2017;

/**
 *
 * @author Josep Dols
 */
public class Request implements Comparable<Request>{
    protected Video videoId;
    protected Endpoint endpoint;
    protected int numRequests;
    
    public Request(Video v,Endpoint e,int num){
        this.videoId = v;
        this.endpoint = e;
        this.numRequests = num;
    }
    
    public Video getVideoId(){
        return this.videoId;
    }
    public Endpoint getEndpoint(){
        return this.endpoint;
    }
    public int getNumRequests(){
        return this.numRequests;
    }

    @Override
    public int compareTo(Request r){
        return r.numRequests -this.numRequests;
    }
}
