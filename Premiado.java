package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 *  Se recibe una lista de deportistas premiados con indicación de campeonato y año del premio. 
 *  Como resultado se debe devolver una lista ordenada por año y para cada año 
 *  todos los deportistas premiados y el campeonato ganado. 
 *  Por ejemplo, si la lista que se recibe es 
 *  [(“Gabriela Sabatini”, 1990, “Individual F US Open”),
 *   (“Gabriela Sabatini”, 1988, “Dobles F US Open”), 
 *   (“Steffi Graf”, 1988, “Dobles F US Open”), 
 *   (“Gabriela Sabatini”, 1991, “Dobles F Wimbledon”), 
 *   (“Steffi Graf”, 1991, “Dobles F Wimbledon”)] 
 *   
 *   el resultado debe ser 
 *   [(1988, [(“Steffi Graf”, “Dobles F US Open”), (“Gabriela Sabatini”, “Dobles F US Open”)]), 
 *    (1990, [(“Gabriela Sabatini”, “Individual F US Open”)]), 
 *    (1991, [(“Steffi Graf”, “Wimbledon”), (“Gabriela Sabatini”, “Dobles F Wimbledon”)])].
 *  Para resolver el ejercicio utilizar las estructuras estudiadas en clase 
 *  (Pila, Cola, Lista, Conjunto y/o Diccionario).  
 * 
 */
public class Premiado {
	
	private List<Deportista> premiados = new ArrayList<Deportista>();
	
	private Map<Integer,List<Deportista>> ordenados = new TreeMap<Integer, List<Deportista>>();
	
	public void resolver() {
		for(Deportista cadaDeportista : premiados) {
			// agregar el año del deportista al mapa y agregarlo a la lista de premiados de ese año
			if(ordenados.containsKey(cadaDeportista.getAnio())) {
				
				Integer anio = cadaDeportista.getAnio();
				List<Deportista> aux = ordenados.get(anio);
				
				aux.add(cadaDeportista);
				ordenados.put(anio,aux);
			}
			else
			{
				List<Deportista> aux = new ArrayList<Deportista>();
				aux.add(cadaDeportista);
				ordenados.put(cadaDeportista.getAnio(), aux);
			}
		}
		
		for(Map.Entry<Integer, List<Deportista>> entry : ordenados.entrySet()) {
			Integer anio = entry.getKey();
			System.out.println(anio);
			List<Deportista> aux = ordenados.get(anio);
			for(Deportista cadaDeportista : aux)
				System.out.println(cadaDeportista);
		}
			
					
	}
	
	
	
	public static void main(String[] args) {
		
		Premiado p = new Premiado();
		p.premiados.add(new Deportista("Gabriela Sabatini", 1990, "Individual F US Open"));
		p.premiados.add(new Deportista("Gabriela Sabatini", 1988, "Dobles F US Open"));
		p.premiados.add(new Deportista("Steffi Graf", 1988, "Dobles F US Open"));
		p.premiados.add(new Deportista("Gabriela Sabatini", 1991, "Dobles F Wimbledon"));
		p.premiados.add(new Deportista("Steffi Graf", 1991, "Dobles F Wimbledon"));
		
		p.resolver();
		
	}
	
	
	
	
	
	
	

}
