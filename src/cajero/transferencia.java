package cajero;

public class transferencia {
	String nombre;
	int numcuenta,valor,valor2;
	public transferencia(String nombre,int numcuenta,int valor,int valor2) {
		this.nombre=nombre;
		this.numcuenta=numcuenta;
		this.valor=valor;
		this.valor2=valor2;
	}
	public int getSaldo() {
		if(valor2>=valor) {
			return valor2-valor;
		}else {
			return -1;
		}
		
	}
}
