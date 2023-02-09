

package co.edu.unicauca.distribuidos.core.controllers;

//import java.util.Date;
import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.services.DTO.AdministradorDTO;
import co.edu.unicauca.distribuidos.core.services.IAdministradorService;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;



@RestController
@RequestMapping("/api")
@Validated
public class AdministradorRestController {

	@Autowired
	private IAdministradorService ProductoService;
	
	@GetMapping("/admin")
	public List<AdministradorDTO> index() {
		return ProductoService.findAll();
	}
		
	
	@PostMapping("/admin")
	public AdministradorDTO create(@Valid @RequestBody AdministradorDTO cliente) {	
		AdministradorDTO objAdministrador = null;
		objAdministrador =  ProductoService.save(cliente);
		return objAdministrador;
	}	
       
}
