package nuevo;

public class clase1 {
	private int atributo1;
	private int atributo2;

	public int getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}

	public int sumar() {
		return this.atributo1 + this.atributo2;
	}
	
	public int cuadrado(){
		return this.atributo1*this.atributo1;
	}
}
