package dominio.servicios;

import java.util.Date;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.Optionality;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;

import dominio.Acta;
import dominio.Persona;

@DomainService
public class Botones
{

	public Acta difunto
	(
			 final Acta a ,			
			 @ParameterLayout(named="Nombre") String nombre,
			 @ParameterLayout(named="DNI")@Parameter(optionality= Optionality.OPTIONAL) int dni,
			 @ParameterLayout(named="Direccion") @Parameter(optionality= Optionality.OPTIONAL)String direccion,
			 @ParameterLayout(named="Telefono") @Parameter(optionality= Optionality.OPTIONAL)String telefono,
			 @ParameterLayout(named="Fecha de nacimiento")@Parameter(optionality= Optionality.OPTIONAL) Date fechaNacimiento,
			 @ParameterLayout(named="Email")@Parameter(optionality= Optionality.OPTIONAL) String email,
			 @ParameterLayout(named="Nacionalidad")@Parameter(optionality= Optionality.OPTIONAL) String nacionalidad,
			 @ParameterLayout(named="Difunto") boolean difunto
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
		a.setDifunto(c);
		
		return a;
	}
	
	
	public boolean hideDifunto
	(
			 final Acta a ,			
			 @ParameterLayout(named="Nombre") String nombre,
			 @ParameterLayout(named="DNI")@Parameter(optionality= Optionality.OPTIONAL) int dni,
			 @ParameterLayout(named="Direccion") @Parameter(optionality= Optionality.OPTIONAL)String direccion,
			 @ParameterLayout(named="Telefono") @Parameter(optionality= Optionality.OPTIONAL)String telefono,
			 @ParameterLayout(named="Fecha de nacimiento")@Parameter(optionality= Optionality.OPTIONAL) Date fechaNacimiento,
			 @ParameterLayout(named="Email")@Parameter(optionality= Optionality.OPTIONAL) String email,
			 @ParameterLayout(named="Nacionalidad")@Parameter(optionality= Optionality.OPTIONAL) String nacionalidad,
			 @ParameterLayout(named="Difunto") boolean difunto
	)
	{
		boolean salida= false;
		if(a==null)
			salida = true;
		return salida;
	}
	
	
	   @javax.inject.Inject 
	    DomainObjectContainer container;
}
