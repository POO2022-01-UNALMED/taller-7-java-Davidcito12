package comunicacion;

public class Alfabeto extends Pictograma{
	public Alfabeto(String origen, String[] letras,String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	private String[] letras;
	private String interpretacion;
	
	public int cantidadLetras(){
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String value = "";
		for(String i:letras) {
			value += i;
			value += ",";
			value += " ";
		}
		value = value.substring(0,value.length()-2);
		return value;
	}

	
	
	
	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
