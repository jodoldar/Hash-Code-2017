package HashCode2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
            Arrays.sort(requests);
            List<Request> newRequests = new ArrayList<Request>(Arrays.asList(requests));
            while(!newRequests.isEmpty()){
                Request auxReq = newRequests.remove(0);
                Video auxVid = auxReq.videoId;
                if(!auxVid.getEnCache() && auxVid.size<X){
                    Endpoint auxEnd = auxReq.getEndpoint();
                    CacheConnection auxCacCon = auxEnd.minCache();
                    if(auxCacCon==null){
                        continue;
                    }
                    Cache auxCac = auxCacCon.getCacheId();
                    if(auxCac.tamMax-auxCac.ocupado>=auxVid.size){
                        auxCac.videos.add(auxVid);
                        auxCac.ocupado+=auxVid.size;
                        auxVid.enCache = true;
                    }else{
                        CacheConnection auxCacCon = auxEnd.nextMinCache(auxCacCon);
                        if(auxCacCon==null){
                            continue;
                        }
                        auxCac = auxCacCon.getCacheId();
                        if(auxCac.tamMax-auxCac.ocupado>=auxVid.size){
                            auxCac.videos.add(auxVid);
                            auxCac.ocupado+=auxVid.size;
                            auxVid.enCache = true;
                    }
                    //Falta un else    
                    
                }
            }
            System.out.println("DFGHJKLKJHGFDSDFGHJK");
            int cacheOut=0;
            String salida = "";
            for(int i=0; i<caches.length; i++){
                if (!caches[i].videos.isEmpty()){
                    cacheOut++;
                    salida+= "\n" + caches[i].cacheId;
                    for(int j=0; j<caches[i].videos.size();j++){
                        salida+= " " + caches[i].videos.get(j).Id;
                    }
                    
                }
            }
            System.out.println(cacheOut + "\n" + salida);
            PrintWriter out = new PrintWriter(new File(args[0]+".out"));
            out.print(cacheOut);
            out.print(salida);
            out.close();
        }
    }
}
