package dominio.servicios;

import java.util.Date;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Optionality;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;

import dominio.Lugar;
import dominio.Persona;
import dominio.utilidades.Estado;
import dominio.utilidades.Tipo;


@DomainService
@DomainServiceLayout(menuOrder = "2", named= "Carga de datos")
public class CargaServicio
{
	

		@MemberOrder(sequence = "1")
		public Persona cargarPersona
		(
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
			return c;
		}
		
		@MemberOrder(sequence = "2")
		public Lugar cargarLugar
		(
				 @ParameterLayout(named="Cuadro")final char cuadro,
				 @ParameterLayout(named="Numero (Nicho o Fosa)")final int numero,
				 @ParameterLayout(named="Fila")@Parameter(optionality= Optionality.OPTIONAL) final int fila,
				 @ParameterLayout(named="Fosa")@Parameter(optionality= Optionality.OPTIONAL) final int fosa,
				 @ParameterLayout(named="Tipo")final Tipo tipo,
				 @ParameterLayout(named="Estado")final Estado estado

		)
		{
			
			final Lugar c= container.newTransientInstance(Lugar.class);
			c.setCuadro(cuadro);
			c.setEstado(estado);
			c.setFila(fila);
			c.setFosa(fosa);
			c.setNumero(numero);
			c.setTipo(tipo);		
			container.persistIfNotAlready(c);
			
			return c;
		}
		
		
	 
	   
	 
	   @javax.inject.Inject 
	    DomainObjectContainer container;
	    
	    
}
