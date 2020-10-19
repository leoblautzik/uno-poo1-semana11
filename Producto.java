package colecciones;

/* codigoProducto alfanumerico de 6 caracteres 3 letras seguidos de 3 digitos numéricos
 * ejemplo: ADF345
 * cantidad entero: 
 */


public class Producto {
	
	private String codigoProducto;
	private Integer cantidad;
	
	public Producto(String codigoProducto, int cantidad) {
		this.codigoProducto = codigoProducto;
		this.cantidad = cantidad;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}
