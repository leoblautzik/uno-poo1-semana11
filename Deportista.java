package colecciones;

public class Deportista{
	public String nombre;
	public Integer anio;
	public String premio;
	
	public Deportista(String nombre, Integer anio, String premio) {
		this.nombre = nombre;
		this.anio = anio;
		this.premio = premio;
	}
	public String getNombre() {
		return nombre;
	}
	public Integer getAnio() {
		return anio;
	}
	public String getPremio() {
		return premio;
	}
	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", premio=" + premio + "]";
	}
	
	
	

	
	
}