package servicios;

import java.util.Date;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import models.Cliente;

public class ClienteServices {
	
	private String endPoint;
	private Client objClientePeticiones; 
	
	public ClienteServices()
	{
		this.endPoint="http://localhost:8080/api/clientes";
		this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
	}
	
	
	public Cliente consultarCliente(Integer id)
	{
		Cliente  objCliente=null;	
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint+"/"+id);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);	
		
		objCliente = objPeticion.get(Cliente.class);
		
		return objCliente;
	}
	
	public List<Cliente> listarClientes()
	{
		List<Cliente> listaClientes=null;			
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON);
		
		listaClientes = objPeticion.get(new GenericType<List<Cliente>>() {});	
		
		return listaClientes;
	}
	
	
	public Cliente registrarCliente(Cliente objClienteRegistar)
	{
		Cliente  objCliente=null;
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint);	    
		
                Entity<Cliente> data = Entity.entity(objClienteRegistar, MediaType.APPLICATION_JSON_TYPE);

                Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);

                objCliente = objPeticion.post(data, Cliente.class);		
	    
		return objCliente;
	}
	
}
