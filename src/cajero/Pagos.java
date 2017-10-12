package cajero;

public class Pagos {
	int referencia,valor,saldo;
	String empresa;
	public Pagos(int referencia,int valor,String empresa,int saldo) {
		this.referencia=referencia;
		this.valor=valor;
		this.empresa=empresa;
		this.saldo=saldo;
	}
	public int getSaldo() {
		if(saldo>=valor) {
			return saldo-valor;
		}else {
			return -1;
		}
		 
	}
}
