package comunicacion;

public class Fabula extends Escrito{
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	private String ensenanza;
	private String interpretacion;
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina * getPaginas();
	}
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		return getOrigen() + "\n"+ getTitulo() + "\n"+ 
			   getAutor() + "\n"+ getPaginas() + "\n"+ ensenanza;
	}
	
	
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
