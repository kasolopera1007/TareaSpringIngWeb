/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Test MyException
 */

package co.edu.udea.exception;

/** En esta clase se manejaran todas las exceociones o errores que el rpograma pueda generar en el desarrollo de las pruebas
*Se utiliza una clase personal para tener un mejor control de los errores en cada puntyo o paso del programa en ejecucion
*/

public class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyException(String message) {
		super(message);
	}

	public MyException(Throwable cause) {
		super(cause);
	}

}
