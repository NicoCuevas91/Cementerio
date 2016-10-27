package dominio.servicios;


import java.util.List;
import javax.inject.Inject;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.Optionality;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.apache.isis.applib.query.QueryDefault;
import org.joda.time.LocalDate;

import dominio.Acta;

@DomainService
@DomainServiceLayout(menuOrder = "5", named= "Busquedas")
public class Busqueda {

	public List<Acta> buscarPorFecha(@ParameterLayout(named= "Fecha (Inicial)") final LocalDate fechaInicial,
									 @ParameterLayout(named= "Fecha final(Si no se agrega facha se buscara por el dia ingresado anterior mente)")@Parameter(optionality= Optionality.OPTIONAL) final LocalDate fechaFinal){
		List<Acta> salida= null;
		if(fechaFinal==null){
			salida=container.allMatches(new QueryDefault<>(Acta.class,"fechaDefuncion","fecha",fechaInicial));
		}else
		{
			salida=container.allMatches(new QueryDefault<>(Acta.class,"fechaDefuncionEntreRangos","rangoInicio",fechaInicial,"rangoFinal",fechaFinal) );
		}
		return salida;
	}


	   @Inject 
	    DomainObjectContainer container;

}
