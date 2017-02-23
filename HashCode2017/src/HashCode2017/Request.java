package HashCode2017;

/**
 *
 * @author Josep Dols
 */
public class Request {
    protected Video videoId;
    protected int endpoint;
    protected int numRequests;
    
    public Request(Video v,int e,int num){
        this.videoId = v;
        this.endpoint = e;
        this.numRequests = num;
    }
    
    public Video getVideoId(){
        return this.videoId;
    }
    public int getEndpoint(){
        return this.endpoint;
    }
    public int getNumRequests(){
        return this.numRequests;
    }
}
