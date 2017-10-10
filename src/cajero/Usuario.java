package cajero;

public class Usuario {
	String nombre,apellido;
	int saldo,clave,cedula;
	public Usuario(String nombre,String apellido,int saldo,int clave) {

		this.nombre=nombre;
		this.apellido=apellido;
		this.saldo=saldo;
		this.clave=clave;
	}
	public int getCedula() {
		return cedula;
	}
	public int getSaldo() {
		return saldo;
	}
	public int getClave() {
		return clave;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
}
