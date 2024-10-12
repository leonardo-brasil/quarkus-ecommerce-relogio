package unitins.br.ecommerce.relogio.resource;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import unitins.br.ecommerce.relogio.DTO.RelogioRequestDTO;
import unitins.br.ecommerce.relogio.DTO.RelogioResponseDTO;
import unitins.br.ecommerce.relogio.service.RelogioService;

@Path("/relogio")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RelogioResource {
    
    @Inject
    public RelogioService relogioService;

    @POST
    public Response create(RelogioRequestDTO dto) {

        RelogioResponseDTO relogio = relogioService.create(dto);
        return Response.status(Status.CREATED).entity(relogio).build();

    }

    @GET
    public Response read() {

        List<RelogioResponseDTO> lista = relogioService.read();
        return Response.status(Status.OK).entity(lista).build();

    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, RelogioRequestDTO dto) {

        relogioService.update(id, dto);
        return Response.status(Status.PARTIAL_CONTENT).build();

    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {

        relogioService.delete(id);
        return Response.status(Status.OK).build();

    }

}
