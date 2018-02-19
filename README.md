Clase llamada Libro que guarda la información de cada uno de los libros de una biblioteca. La clase guarda el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contiene los siguientes métodos:

Constructor por defecto.
Constructor con parámetros.
Métodos setters y getters.
Método prestamo() que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
Método devolucion() que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
Método toString() para mostrar los datos de los libros.

También se implementa un programa que simula el comportamiento de esta clase.
