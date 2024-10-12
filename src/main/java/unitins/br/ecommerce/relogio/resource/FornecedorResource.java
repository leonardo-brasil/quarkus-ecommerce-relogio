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
import unitins.br.ecommerce.relogio.DTO.FornecedorRequestDTO;
import unitins.br.ecommerce.relogio.DTO.FornecedorResponseDTO;
import unitins.br.ecommerce.relogio.service.FornecedorService;

@Path("/fornecedor")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FornecedorResource {

    @Inject
    public FornecedorService fornecedorService;

    @POST
    public Response create(FornecedorRequestDTO dto) {

        FornecedorResponseDTO fornecedor = fornecedorService.create(dto);
        return Response.status(Status.CREATED).entity(fornecedor).build();

    }

    @GET
    public Response read() {

        List<FornecedorResponseDTO> lista = fornecedorService.read();
        return Response.status(Status.OK).entity(lista).build();

    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, FornecedorRequestDTO dto) {

        fornecedorService.update(id, dto);
        return Response.status(Status.PARTIAL_CONTENT).build();

    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {

        fornecedorService.delete(id);
        return Response.status(Status.OK).build();

    }
    
}
