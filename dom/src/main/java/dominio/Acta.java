package dominio;


import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberGroupLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;
import org.joda.time.LocalDate;

@javax.jdo.annotations.Queries
({
	@javax.jdo.annotations.Query(name = "fechaDefuncionEntreRangos", language = "JDOQL",value = "SELECT "+
										"FROM dominio.Acta "+
										"WHERE fechaDefuncion >= :rangoInicio && fechaDefuncion <= :rangoFinal"),
	@javax.jdo.annotations.Query(name = "fechaDefuncion", language = "JDOQL",value = "SELECT "+
										"FROM dominio.Acta "+
										"WHERE fechaDefuncion == :fecha")
})



@DomainObject(bounded=true,objectType = "ACTA")
@PersistenceCapable(identityType=IdentityType.DATASTORE)
@MemberGroupLayout(columnSpans={4,4,4,8},middle="Acta")
public class Acta {

	private Persona difunto;
	private LocalDate fechaDefuncion;
	private Persona responsable;
	private String observacion;
	private Lugar lugar;
	
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "1",name="Acta")
	@Title
	public Persona getDifunto() {
		return difunto;
	}
	public void setDifunto(Persona difunto) {
		this.difunto = difunto;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "2",name="Acta")
	public LocalDate getFechaDefuncion() {
		return fechaDefuncion;
	}
	public void setFechaDefuncion(LocalDate fechaDefuncion) {
		this.fechaDefuncion = fechaDefuncion;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "3",name="Acta")
	public Persona getResponsable() {
		return responsable;
	}
	public void setResponsable(Persona responsable) {
		this.responsable = responsable;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "4",name="Acta")
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "5",name="Acta")
	public Lugar getLugar() {
		return lugar;
	}
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	
	
	
}
