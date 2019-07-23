import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.codahale.metrics.annotation.Timed;

@Path("/hello")
@Produces(APPLICATION_JSON)
public class HelloResource {

    private String _template;

    public HelloResource(String _template) {
        this._template = template;
    }

    @GET
    @Timed
    public Hello say(@QueryParam("name") String name) {
        String massage = String.format(_template, name);
        Hello hello = new Hello(message);

        return hello;
    }
}