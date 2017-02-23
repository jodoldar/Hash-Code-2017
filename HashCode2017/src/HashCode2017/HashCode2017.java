package HashCode2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main class of the project
 * @author Josep Dols
 */
public class HashCode2017 {

    
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("HashCode2017");
        if(args.length!=1){
            System.err.println("Numero de argumentos incorrecto");
            System.exit(1);
        }else{
            Video[] videos;
            Endpoint[] endpoints;
            Cache[] caches;
            Request[] requests;
            File f = new File(args[0]);
            Scanner in = new Scanner(f);
            int V,E,R,C,X;
            V = in.nextInt();
            E = in.nextInt();
            R = in.nextInt();
            C = in.nextInt();
            X = in.nextInt();
            in.nextLine();
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
        
            //Inicializacion de Endpoints y CacheConnections
            for(int i=0; i<E; i++){
                int numCaches;
                endpoints[i] = new Endpoint(i, in.nextInt(), numCaches=in.nextInt());
                for(int j=0; j<numCaches; j++){
                    endpoints[i].connections[j] = new CacheConnection(caches[in.nextInt()], in.nextInt(), endpoints[i]);
                }
            }
        
            //Inicializacion de Requests
            for(int i=0; i<R; i++){
                int loc;
                requests[i] = new Request(videos[in.nextInt()], endpoints[loc=in.nextInt()], in.nextInt());
                endpoints[loc].addRequest(requests[i]);
            }
            
            System.out.println("DFGHJKLKJHGFDSDFGHJK");
        }
    }
}
