import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.deploy.Verticle;

public class Server extends Verticle {
	public void start() {
		vertx.createHttpServer()
				.requestHandler(new Handler<HttpServerRequest>() {
					public void handle(HttpServerRequest req) {
						// String file = req.path.equals("/") ? "index.html" :
						// req.path;
						// req.response.sendFile("webroot/" + file);
						req.response.end("helloworld");
					}
				}).listen(8090);
	}
}
