package server;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class Server {
    public static void startServer(String url, boolean loadFromFile){
        final String pack = "dev.bsinfo.ressource";
        System.out.println("Start server");
        System.out.println(url);
        final ResourceConfig rc = new ResourceConfig().packages(pack);
        final HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create(url), rc);
        System.out.println("Ready for Requests....");
    }
    public static void stopServer(boolean saveToFile){

    }
}
