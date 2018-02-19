import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		int decision = 0;
		Scanner sc = new Scanner(System.in);
		
		Libro libro1 = new Libro();
		libro1.setAutor("Miguel de Cervantes");
		libro1.setTitulo("El Quijote de la Mancha");
		libro1.setEjemplareslibro(2);
		libro1.setEjemplaresprestados(0);
		
		Libro libro2 = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1, 1);
		
		System.out.println("En la libreria se encuentran los siguientes libros: ");
		System.out.println(libro1.toString() + "\n" + libro2.toString());
		
		do {
		System.out.println("MENU");
		System.out.println("Pulse 1 para pedir un prestamo del Quijote de la Mancha");
		System.out.println("Pulse 2 para devolver un libro del Quijote de la Mancha");
		System.out.println("Pulse 3 para pedir un prestamo del Capitán Alatriste");
		System.out.println("Pulse 4 para devolver un libro del Capitán Alatriste");
		System.out.println("Pulse 0 para salir del programa");
		
		decision = sc.nextInt();
		
		switch(decision) {
		
		case 1: 
		
			
			if(libro1.getEjemplareslibro() > 0) {
				libro1.prestamo();
				System.out.println("Se ha ha tomado prestado " + libro1.getTitulo() + ", quedan " + libro1.getEjemplareslibro() + " ejemplares disponibles.");
			
			}
			
			else {
				
				System.out.println("El libro que solicita no está disponible en la librería.");
				
			}
			break;
			
		case 2:
			
			if(libro1.getEjemplaresprestados() > 0) {
				libro1.devolucion();
				System.out.println("Se ha devuelto " + libro1.getTitulo() + ", quedan " + libro1.getEjemplareslibro() + " ejemplares disponibles.");
			
			}
			
			else {
				
				System.out.println("No puede devolverse un libro que no ha sido prestado");
				
			}
			
			break;
		
		case 3:
			
			if(libro2.getEjemplareslibro() > 0) {
				libro2.prestamo();
				System.out.println("Se ha ha tomado prestado " + libro2.getTitulo() + ", quedan " + libro2.getEjemplareslibro() + " ejemplares disponibles.");
			
			}
			
			else {
				
				System.out.println("El libro que solicita no está disponible en la librería.");
				
			}
			break;
		case 4:
			
			if(libro2.getEjemplaresprestados() > 0) {
				libro2.devolucion();
				System.out.println("Se ha devuelto " + libro2.getTitulo() + ", quedan " + libro2.getEjemplareslibro() + " ejemplares disponibles.");
			
			}
			
			else {
				
				System.out.println("No puede devolverse un libro que no ha sido prestado");
				
			}
			
			break;
		default:
			
			System.out.println("El parametro introducido no es correcto, porfavor introduzca un valor entre 1 y 4. ");
			
		}
		
		}while(decision != 0);
		
		sc.close();
	}

}
