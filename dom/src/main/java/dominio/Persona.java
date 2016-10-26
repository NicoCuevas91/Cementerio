package dominio;

import java.util.Date;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;


@javax.jdo.annotations.Unique(name="Persona_numPersona_key", members = {"dni"})
@DomainObject(bounded=true,objectType = "PERSONA")
@PersistenceCapable(identityType=IdentityType.DATASTORE)
public class Persona 
{
	
	private String nombre;
	private int dni;
	private String direccion;
	private String telefono;
	private Date fechaNacimiento;
	private String email;
	private String nacionalidad;
	private boolean difunto;
	
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "1",name="Persona")
	@Title
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "2",name="Persona")
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "3",name="Persona")
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "4",name="Persona")
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "5",name="Persona")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "6",name="Persona")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "7",name="Persona")
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "8-",name="Persona")
	public boolean isDifunto() {
		return difunto;
	}
	public void setDifunto(boolean difunto) {
		this.difunto = difunto;
	}
	
	
	
	
	
} 
