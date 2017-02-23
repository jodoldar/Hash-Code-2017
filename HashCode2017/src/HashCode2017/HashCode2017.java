package HashCode2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main class of the project
 * @author Josep Dols
 */
public class HashCode2017 {
    protected Video[] videos;
    protected Endpoint[] endpoints;
    protected Cache[] caches;
    protected Request[] requests;
    
    private void parser(File f) throws FileNotFoundException{
        Scanner in = new Scanner(f);
        int V,E,R,C,X;
        V = in.nextInt();
        E = in.nextInt();
        R = in.nextInt();
        C = in.nextInt();
        X = in.nextInt();
        videos = new Video[V];
        endpoints = new Endpoint[E];
        requests = new Request[R];
        caches = new Cache[C];
        
        //Inicializacion de las caches
        for(int i=0; i<C; i++){
            caches[i] = new Cache(i,X);
        }
        
        //Inicializacion de los videos
        for(int i=0; i<V; i++){
            videos[i] = new Video(i,in.nextInt());
        }
    }
    public static void main(String[] args){
        System.out.println("HashCode2017");
        if(args.length!=1){
            System.err.println("Numero de argumentos incorrecto");
            System.exit(1);
        }else{
            File f = new File(args[0]);
            try {
                parser(f);
            } catch (FileNotFoundException ex) {
                System.err.println("Exception: " + ex);
            }
        }
    }
}
