package at.ac.htlleonding;

import at.ac.htlleonding.repo.impl.ArrayListRepo;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.Arrays;
import java.util.stream.Collectors;

@Path("/restendpoint/")
public class SomeRessource {

  @Inject
  ArrayListRepo repo = new ArrayListRepo();

  @POST
  public void create(@QueryParam("value") String value) {
    repo.addValue(value);
  }

  @GET
  @Produces("application/json")
  public String read() {
    return Arrays.stream(repo.getValues()).collect(Collectors.joining(", "));
  }
}
