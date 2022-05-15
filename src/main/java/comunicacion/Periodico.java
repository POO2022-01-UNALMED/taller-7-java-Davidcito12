package comunicacion;

public class Periodico extends Escrito{
	public Periodico(String origen, String titulo, String autor, int paginas, 
						String fecha,String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
		
	}
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	@Override
	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina * getPaginas() * 10;
	}
	@Override
	String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		return getOrigen() + "\n"+ getTitulo() + "\n"+ getAutor() + "\n"+
			   getPaginas() + "\n"+ fecha + "\n"+ primicia;
	}
}
