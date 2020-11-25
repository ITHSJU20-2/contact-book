package se.iths.grupp2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class Index {

    private final ContactBook contactBook = new ContactBook();

    @GET
    public String display() {
        return "Hello World!";
    }
}
