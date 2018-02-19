
public class Libro {
	
	private String titulo;
	private String autor;
	private int ejemplareslibro;
	private int ejemplaresprestados;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int ejemplareslibro, int ejemplaresprestados) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplareslibro = ejemplareslibro;
		this.ejemplaresprestados = ejemplaresprestados;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplareslibro() {
		return ejemplareslibro;
	}
	public void setEjemplareslibro(int ejemplareslibro) {
		this.ejemplareslibro = ejemplareslibro;
	}
	public int getEjemplaresprestados() {
		return ejemplaresprestados;
	}
	public void setEjemplaresprestados(int ejemplaresprestados) {
		this.ejemplaresprestados = ejemplaresprestados;
	}
	
	public boolean prestamo() {
		
		if (ejemplareslibro > 0) {
			
			ejemplaresprestados++;
			ejemplareslibro--;
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	public boolean devolucion() {
		
		if(ejemplaresprestados > 0) {
			
			ejemplaresprestados--;
			ejemplareslibro++;
			return true;
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	public String toString() {
		
		String mensaje = titulo + ", escrito por " + autor + ". Quedan " + ejemplareslibro + " ejemplares.";
		return mensaje;
		
	}

}
