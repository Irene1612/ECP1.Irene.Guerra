package nuevo;

public class Clase1 {
	private int atributo1;
	private int atributo2;

	public int getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}

	public int getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}
	
	public int doble(){
		return this.atributo1*2;
	}
	
	public int triple(){
		return this.doble()+this.atributo1;
	}
}
