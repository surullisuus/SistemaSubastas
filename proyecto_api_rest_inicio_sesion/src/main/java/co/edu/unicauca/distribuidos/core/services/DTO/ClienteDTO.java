package co.edu.unicauca.distribuidos.core.services.DTO;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
//import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ClienteDTO {
        private Integer id;		
        @NotNull
        @Size(min = 5, max = 50)
	private String nombres;
        @NotNull	
        @Size(min = 5, max = 50)
        private String apellidos;
        @NotNull
        @Email(message="{user.email.mask}")
        private String correo;	
        @NotNull
        @Pattern(regexp = "[3][0-10]")
        private String telefono;
        @NotNull
        @Size(min = 10, max = 20)
        private String login;
        @NotNull
        @Size(min = 10, max = 20)
        private String contraseña;
	public ClienteDTO()
	{
		
	}
}