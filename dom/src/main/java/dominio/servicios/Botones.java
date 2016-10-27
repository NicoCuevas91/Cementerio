package dominio.servicios;

import java.util.Date;

import javax.swing.JOptionPane;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Optionality;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;

import dominio.Acta;
import dominio.Lugar;
import dominio.Persona;
import dominio.utilidades.Estado;
import dominio.utilidades.Tipo;

@DomainService
public class Botones
{
/////////////////////////////////////////////////--Acta--/////////////////////////////////////////////////////////
	
@MemberOrder(sequence = "1")	
public Acta difunto
	(
			 final Acta a ,			
			 @ParameterLayout(named="Nombre") String nombre,
			 @ParameterLayout(named="DNI")@Parameter(optionality= Optionality.OPTIONAL) int dni,
			 @ParameterLayout(named="Direccion") @Parameter(optionality= Optionality.OPTIONAL)String direccion,
			 @ParameterLayout(named="Telefono") @Parameter(optionality= Optionality.OPTIONAL)String telefono,
			 @ParameterLayout(named="Fecha de nacimiento")@Parameter(optionality= Optionality.OPTIONAL) Date fechaNacimiento,
			 @ParameterLayout(named="Nacionalidad")@Parameter(optionality= Optionality.OPTIONAL) String nacionalidad
	)
	{
		final Persona c= container.newTransientInstance(Persona.class);
		c.setDifunto(true);
		c.setDireccion(direccion);
		c.setDni(dni);
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
			 @ParameterLayout(named="Nacionalidad")@Parameter(optionality= Optionality.OPTIONAL) String nacionalidad
	)
	{
		boolean salida= false;
		if(a==null)
			salida = true;
		return salida;
	}	
@MemberOrder(sequence = "2")
public Acta responsable
	(
			 final Acta a ,			
			 @ParameterLayout(named="Nombre") String nombre,
			 @ParameterLayout(named="DNI")@Parameter(optionality= Optionality.OPTIONAL) int dni,
			 @ParameterLayout(named="Direccion") @Parameter(optionality= Optionality.OPTIONAL)String direccion,
			 @ParameterLayout(named="Telefono") @Parameter(optionality= Optionality.OPTIONAL)String telefono,
			 @ParameterLayout(named="Fecha de nacimiento")@Parameter(optionality= Optionality.OPTIONAL) Date fechaNacimiento,
			 @ParameterLayout(named="Email")@Parameter(optionality= Optionality.OPTIONAL) String email,
			 @ParameterLayout(named="Nacionalidad")@Parameter(optionality= Optionality.OPTIONAL) String nacionalidad
	)
	{
		final Persona c= container.newTransientInstance(Persona.class);
		c.setDifunto(false);
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
public boolean hideResponsable
	(
			 final Acta a ,			
			 @ParameterLayout(named="Nombre") String nombre,
			 @ParameterLayout(named="DNI")@Parameter(optionality= Optionality.OPTIONAL) int dni,
			 @ParameterLayout(named="Direccion") @Parameter(optionality= Optionality.OPTIONAL)String direccion,
			 @ParameterLayout(named="Telefono") @Parameter(optionality= Optionality.OPTIONAL)String telefono,
			 @ParameterLayout(named="Fecha de nacimiento")@Parameter(optionality= Optionality.OPTIONAL) Date fechaNacimiento,
			 @ParameterLayout(named="Email")@Parameter(optionality= Optionality.OPTIONAL) String email,
			 @ParameterLayout(named="Nacionalidad")@Parameter(optionality= Optionality.OPTIONAL) String nacionalidad
	)
	{
		boolean salida= false;
		if(a==null)
			salida = true;
		return salida;
	}
@MemberOrder(sequence = "3")
public Acta lugar
	(		 
			Acta a,
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
		
		a.setLugar(c);
		container.persistIfNotAlready(c);
		
		return a;
	}
public boolean hideLugar
	(		 
			Acta a,
			 @ParameterLayout(named="Cuadro")final char cuadro,
			 @ParameterLayout(named="Numero (Nicho o Fosa)")final int numero,
			 @ParameterLayout(named="Fila")@Parameter(optionality= Optionality.OPTIONAL) final int fila,
			 @ParameterLayout(named="Fosa")@Parameter(optionality= Optionality.OPTIONAL) final int fosa,
			 @ParameterLayout(named="Tipo")final Tipo tipo,
			 @ParameterLayout(named="Estado")final Estado estado
			){		
		boolean salida= false;
		if(a==null)
			salida = true;
		return salida;
	}
public String eliminar(final Acta a){
	String salida="";
	Object [] opciones ={"Aceptar","Cancelar"};
	int eleccion = JOptionPane.showOptionDialog(null,"Real mente desea Eliminar este acta?","Mensaje de Confirmacion",
	JOptionPane.YES_NO_OPTION,
	JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
	if (eleccion == JOptionPane.YES_OPTION)
	{
		container.remove(a);
		salida = "Se ah eliminado correctamente el acta";
	}
	else{
		salida= "No se ah eliminado el acta de "+a.getDifunto().getNombre();
	}
	return salida;

}
public boolean hideEliminar(final Acta a){
	boolean salida= false;
	if(a==null)
		salida = true;
	return salida;
}
/////////////////////////////////////////////////////--Fin Acta--/////////////////////////////////////////////////////
	
	



	   @javax.inject.Inject 
	    DomainObjectContainer container;
}
