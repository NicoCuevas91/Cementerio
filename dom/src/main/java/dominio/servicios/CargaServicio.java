package dominio.servicios;

import java.util.Date;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.ParameterLayout;
import dominio.Persona;


@DomainService
@DomainServiceLayout(menuOrder = "2", named= "Carga de datos")
public class CargaServicio
{
	

		@MemberOrder(sequence = "1")
		public Persona cargarPersona
		(
				 @ParameterLayout(named="Nombre")final String nombre,
				 @ParameterLayout(named="DNI")final int dni,
				 @ParameterLayout(named="Direccion")final String direccion,
				 @ParameterLayout(named="Telefono")final String telefono,
				 @ParameterLayout(named="Fecha de nacimiento")final Date fechaNacimiento,
				 @ParameterLayout(named="Email")final String email,
				 @ParameterLayout(named="Nacionalidad")final String nacionalidad,
				 @ParameterLayout(named="Difunto")final boolean difunto
		)
		{
			final Persona c= container.newTransientInstance(Persona.class);
			c.setDifunto(difunto);
			c.setDireccion(direccion);
			c.setDni(dni);
			c.setEmail(email);
			c.setFechaNacimiento(fechaNacimiento);
			c.setNacionalidad(nacionalidad);
			c.setNombre(nombre);
			c.setTelefono(telefono);
			container.persistIfNotAlready(c);
			return c;
		}
	 
	   
	 
	   @javax.inject.Inject 
	    DomainObjectContainer container;
	    
	    
}
