package dominio;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberOrder;

import dominio.utilidades.Estado;
import dominio.utilidades.Tipo;



@DomainObject(bounded=true,objectType = "LUGARES")
@PersistenceCapable(identityType=IdentityType.DATASTORE)
public class Lugar 
{
	
	
	private char cuadro;
	private int numero;
	private int fila;
	private int fosa;
	private Estado estado;
	private Tipo tipo;
	
	
	@Column(allowsNull="true")
	@MemberOrder(sequence= "1",name="Lugar")
	public char getCuadro() {
		return cuadro;
	}
	public void setCuadro(char cuadro) {
		this.cuadro = cuadro;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "2",name="Lugar")
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "3",name="Lugar")
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "4",name="Lugar")
	public int getFosa() {
		return fosa;
	}
	public void setFosa(int fosa) {
		this.fosa = fosa;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "5",name="Lugar")
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Column(allowsNull="true")
	@MemberOrder(sequence= "6",name="Lugar")
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
