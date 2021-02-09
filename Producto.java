/**
 * 
 * Clase producto calculadora actividad grupal 2
 * Encontramos diferentes m�todos donde podremos realizar las operaciones solicitadas. 
 * Casos especiales: En el caso de que los numeros para realizar la potencia sean demasiado grandes
 * como para ser procesador saldr� por consola un aviso de error. 
 * 
 * @author Guillermo
 * @see Producto
 * @version 1.0
 */
public class Producto {
	

	
	/**
	 * M�todo en el que dando dos parametros (double) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operaci�n (debe ser un double)
	 * @param b Segundo parametro para realizar la operaci�n (debe ser un double)
	 * @return  Producto de a y b
	 */
	
	public double pro1 (double a , double b) {
	return  a*b;
	}
	
	/**
	 * M�todo en el que dando dos parametros (int) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operaci�n (debe ser un int)
	 * @param b Segundo parametro para realizar la operaci�n (debe ser un int)
	 * @return  Producto de a y b
	 */
	
	
	public int pro2 (int a, int b) {
		return a*b;	
	}
	
	/**
	 * M�todo en el que dando tres parametros (double) nos devuelve su producto. 
	 * @param a Primer parametro para realizar la operaci�n (debe ser un double)
	 * @param b Segundo parametro para realizar la operaci�n (debe ser un double)
	 * @param c Tercer parametro para realizar la operaci�n (debe ser un double)
	 * @return  producto de a,b y c. 
	 */

	public double pro3( double a, double b, double c) {
		return a*b*c;
	}
	
	
	/**
	 * M�todo que nos devuelve un potencia dandole su base y cociente (ambos double)
	 * @param base Pase Primer parametro para realizar la operaci�n ( Debe ser la base y debe ser un double)
	 * @param cociente  Cociente Segundo parametro para realizar la operaci�n ( debe ser el cociente y debe ser un double)
	 * @return Potencia resultante. 
	 */
	public double prod4 (double base, double cociente) {
		return Math.pow ( base, cociente);
	}
}
