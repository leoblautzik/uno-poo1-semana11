package colecciones;

/*Se dispone de una lista de productos que contiene el stock de productos de varias sucursales. 
 * Cada producto se compone de :
 * codigoProducto alfanumerico de 6 caracteres, 3 letras seguidos de 3 digitos numéricos
 * y la cantidad que es un entero. 
 
 * ejemplo: 
 * Codigo ADF345
 * cantidad entero: 20 
 * 
 * Se desea obtener el Stock completo de cada producto en una sola lista, 
 * donde para cada producto se indique la cantidad total estockeada.
 * 
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Stock {
	
	private Map<String,Integer> stock = new LinkedHashMap<String,Integer>();
	
	public void agregar(Producto p) {
		if(stock.containsKey(p.getCodigoProducto())) {
			String clave = p.getCodigoProducto();
			Integer cantidadActual = stock.get(clave);
			Integer nuevaCantidad = cantidadActual+p.getCantidad(); 
			stock.put(clave, nuevaCantidad);
										   	
		}else
			stock.put(p.getCodigoProducto(), p.getCantidad());
	}
	
	public void listarStock() {
		 for (Map.Entry<String,Integer> entry : stock.entrySet())  
	            System.out.println("Producto = " + entry.getKey() + 
	                             ", Cantidad = " + entry.getValue()); 
	}
	
	public void listarOrdenadoPorCantidad() {
		Map<Integer,String> dadoVuelta = new TreeMap<Integer,String>();
		
		for (Map.Entry<String,Integer> cadaUno : stock.entrySet())
			dadoVuelta.put(cadaUno.getValue(), cadaUno.getKey());
		
		for (Map.Entry<Integer, String> cadaUnoDadoVuelta : dadoVuelta.entrySet())
			System.out.println("Cantidad " + cadaUnoDadoVuelta.getKey() +
					"  Codigo Producto " + cadaUnoDadoVuelta.getValue());
		
	}
	
	
	/* for(Integer cadaUno :  arreglo)
	 * 	cadaUno.algo();
	 */
	
	public void iterarStock() {
		Iterator<Map.Entry<String, Integer>> itr = stock.entrySet().iterator(); 

		while(itr.hasNext()) 
		{ 
			Map.Entry<String, Integer> entry = itr.next(); 
			System.out.println("Key = " + entry.getKey() +  
					", Value = " + entry.getValue()); 
		} 
	}
	
	
	public static void main(String[] args) {
		Stock s = new Stock();
		
		s.agregar(new Producto("abc123",100));
		s.agregar(new Producto("wer345",200));
		s.agregar(new Producto("abc123",567));
		s.agregar(new Producto("abc123",10));
		s.agregar(new Producto("wer123",111));
		s.agregar(new Producto("abc123",124));
		
		//s.listarStock();
		s.iterarStock();
		System.out.println("----------------------");
		s.listarOrdenadoPorCantidad();
		
		
	}

}
