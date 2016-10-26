package dominio.servicios;

import java.util.List;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.ParameterLayout;

import dominio.Acta;

@DomainService
@DomainServiceLayout(menuOrder = "1")
public class Actas 
{
	
	@MemberOrder(sequence = "1")
	public Acta cargarActa()
	{
		final Acta c= container.newTransientInstance(Acta.class);	
		container.persistIfNotAlready(c);
		return c;
	}
	
	@MemberOrder(sequence = "2")
	public Acta buscarActa(@ParameterLayout(named="Acta") final Acta acta){
		return acta;
	}
	
	public boolean hideBuscarActa(@ParameterLayout(named="Acta") final Acta acta){
		boolean bandera= true;
		if(acta == null){
			bandera = false;
		}
		return bandera;
	}
	
	@MemberOrder(sequence = "9")
	public List<Acta> listarActas(){
		List<Acta> salida = container.allInstances(Acta.class);
		return salida;
	}
	
	
	   @javax.inject.Inject 
	    DomainObjectContainer container;
}
