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
import models.Producto;

public class ProductoServices {
	
	private String endPoint;
	private Client objProductoPeticiones; 
	
	public ProductoServices()
	{
		this.endPoint="http://localhost:5000/api/productos";
		this.objProductoPeticiones = ClientBuilder.newClient().register(new JacksonFeature());
	}
	
	
	public Producto consultarProducto(Integer id)
	{
		Producto  objProducto=null;	
		
		WebTarget target = this.objProductoPeticiones.target(this.endPoint+"/"+id);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);	
		
		objProducto = objPeticion.get(Producto.class);
		
		return objProducto;
	}
	
	public List<Producto> listarProductos()
	{
		List<Producto> listaProductos=null;			
		
		WebTarget target = this.objProductoPeticiones.target(this.endPoint);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON);
		
		listaProductos = objPeticion.get(new GenericType<List<Producto>>() {});	
		
		return listaProductos;
	}
	
	
	public Producto registrarProducto(Producto objProductoRegistar)
	{
            Producto objProducto = null;

            WebTarget target = this.objProductoPeticiones.target(this.endPoint);

            Entity<Producto> data = Entity.entity(objProductoRegistar, MediaType.APPLICATION_JSON_TYPE);

            Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

            objProducto = objPeticion.post(data, Producto.class);

           return objProducto;
	}
        
        public Producto actualizarProducto(Producto objClienteActualizar,Integer id)
	{
		Producto  objCliente=null;		
		
		WebTarget target = this.objProductoPeticiones.target(this.endPoint+"/"+id);	  
		
                Entity<Producto> data = Entity.entity(objClienteActualizar, MediaType.APPLICATION_JSON_TYPE);

                Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);

                objCliente = objPeticion.put(data, Producto.class);		
		
		return objCliente;
	}
	
}
