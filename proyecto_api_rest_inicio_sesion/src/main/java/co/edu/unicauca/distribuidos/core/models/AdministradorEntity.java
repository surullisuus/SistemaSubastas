package co.edu.unicauca.distribuidos.core.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
//import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class AdministradorEntity {
    private Integer id;		
        @NotNull
        @Size(min = 5, max = 50)
	private String nombres;
        @NotNull	
        @Size(min = 5, max = 50)
        private String apellidos;
        @NotNull
        @Size(min = 10, max = 20)
        private String login;
        @NotNull		
        @Size(min = 10, max = 20)
        private String contraseña;
	public AdministradorEntity()
	{
		
	}
}
