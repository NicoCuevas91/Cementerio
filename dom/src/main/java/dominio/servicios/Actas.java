package dominio.servicios;

import java.util.List;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.ParameterLayout;

import dominio.Acta;

@DomainService
@DomainServiceLayout(menuOrder = "1")
public class Actas 
{
	public Acta cargarActa()
	{
		final Acta c= container.newTransientInstance(Acta.class);	
		container.persistIfNotAlready(c);
		return c;
	}
	
	public Acta buscarActa(@ParameterLayout(named="Acta") final Acta acta){
		return acta;
	}
	
	public List<Acta> listarActas(){
		List<Acta> salida = container.allInstances(Acta.class);
		return salida;
	}
	
	
	   @javax.inject.Inject 
	    DomainObjectContainer container;
}
