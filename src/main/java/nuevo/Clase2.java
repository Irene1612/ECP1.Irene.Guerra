package nuevo;

public class Clase2 {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String conGuion(){
		return this.nombre + "-";
	}
}
