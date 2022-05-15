package comunicacion;

public class Test {
	public static void main(String[] args) {
		Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, 
				"N/A", "Doubleday", "Primera", "Escrito largo");
		String  comp = "Creacion\n" + 
				"El resplandor\n" + 
				"Stephen King\n" + 
				"599\n" + 
				"N/A\n" + 
				"Doubleday\n" + 
				"Primera";
		System.out.println(libro.toString());
		System.out.println("////////////////////");
		
		System.out.println(comp);
		
	}
}
