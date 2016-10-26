package dominio;

import java.util.Date;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;


@DomainObject(bounded=true,objectType = "ACTA")
@PersistenceCapable(identityType=IdentityType.DATASTORE)
public class Acta {

	private Persona difunto;
	private Date fechaDefuncion;
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
	public Date getFechaDefuncion() {
		return fechaDefuncion;
	}
	public void setFechaDefuncion(Date fechaDefuncion) {
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
