package HashCode2017;

/**
 *
 * @author Josep Dols
 */
public class Video {
    protected int Id;
    protected int size;
    
    public Video(int ident,int tam){
        this.Id = ident;
        this.size = tam;
    }
    
    public int getId(){
        return this.Id;
    }
    public int getSize(){
        return this.size;
    }
}
