

package co.edu.unicauca.distribuidos.core.repositories;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;


import co.edu.unicauca.distribuidos.core.models.AdministradorEntity;

@Repository
public class AdministradorRepository {
	
	private ArrayList<AdministradorEntity> listaDeClientes;
	
	public AdministradorRepository()
	{
		this.listaDeClientes= new ArrayList<AdministradorEntity>();
		cargarAdministradores();
	}
	
   public List<AdministradorEntity> findAll()
   {
	   System.out.println("Invocando a listar admins");
	   return this.listaDeClientes;	
   }
	
	
	public AdministradorEntity save(AdministradorEntity producto)	
	{
		 System.out.println("Invocando a registrar admin");
		 AdministradorEntity objProducto=null;
		 if (this.listaDeClientes.add(producto))
		 {
			 objProducto=producto;
		 }
		 
		 return objProducto;
	}
	private void cargarAdministradores()
	{
		AdministradorEntity objAdmin1= new AdministradorEntity(1,"Daniel juan","Dorado","dannieldorado","1234567890");
		this.listaDeClientes.add(objAdmin1);
		AdministradorEntity objAdmin2= new AdministradorEntity(2, "julia sofia","deDiego","julisurullisus","diegopipimuerto");
		this.listaDeClientes.add(objAdmin2);

	}
}
