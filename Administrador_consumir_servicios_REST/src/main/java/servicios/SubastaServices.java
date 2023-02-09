package servicios;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;
import models.Subasta;

public class SubastaServices {
	
	private String endPoint;
	private Client objSubastaPeticiones; 
	
	public SubastaServices()
	{
		this.endPoint="http://localhost:5000/api/subastas";
		this.objSubastaPeticiones = ClientBuilder.newClient().register(new JacksonFeature());
	}
	
	
	public Subasta consultarSubasta(Integer id)
	{
		Subasta  objSubasta=null;	
		
		WebTarget target = this.objSubastaPeticiones.target(this.endPoint+"/"+id);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);	
		
		objSubasta = objPeticion.get(Subasta.class);
		
		return objSubasta;
	}
	
	public List<Subasta> listarSubastas()
	{
		List<Subasta> listaSubastas=null;			
		
		WebTarget target = this.objSubastaPeticiones.target(this.endPoint);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON);
		
		listaSubastas = objPeticion.get(new GenericType<List<Subasta>>() {});	
		
		return listaSubastas;
	}
	
	
	public Subasta registrarSubasta(Subasta objSubastaRegistar)
	{
            Subasta objSubasta = null;

            WebTarget target = this.objSubastaPeticiones.target(this.endPoint);

            Entity<Subasta> data = Entity.entity(objSubastaRegistar, MediaType.APPLICATION_JSON_TYPE);

            Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

            objSubasta = objPeticion.post(data, Subasta.class);

           return objSubasta;
	}
        
        public Subasta actualizarSubasta(Subasta objClienteActualizar,Integer id)
	{
		Subasta  objCliente=null;		
		
		WebTarget target = this.objSubastaPeticiones.target(this.endPoint+"/"+id);	  
		
                Entity<Subasta> data = Entity.entity(objClienteActualizar, MediaType.APPLICATION_JSON_TYPE);

                Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);

                objCliente = objPeticion.put(data, Subasta.class);		
		
		return objCliente;
	}
	
}
