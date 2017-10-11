package cajero;

public class Retiro {
	int cantidad,cantidad2;
	public Retiro(int cantidad,int cantidad2) {
		this.cantidad=cantidad;
		this.cantidad2=cantidad2;
	}
	public int getRetiro() {
		if(cantidad>=cantidad2) {
			return cantidad-cantidad2;
		}else {
			return cantidad;
		}
		
	}
}
