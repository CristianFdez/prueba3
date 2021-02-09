public class Resta {
	
	/**
	 * @author Cristian Fern�ndez
	 * @version 1.0
	 * @since 05/02/2021
	 */
	
	/**
	 * Declaro varios valores para hacer las operaciones de resta,
	 * 3 valores reales y 2 enteros, y resultado como valor de la soluci�n.
	 */
	private double a, b, c, resultado;
	private int  d, e;
	
	/**
	 * Declaro el constructor sin nada, vac�o.
	 */
	public Resta() {
		super();
	}

	/**
	 * Declaro el constructor con todos los valores.
	 * @param a es un n�mero real.
	 * @param b es un n�mero real.
	 * @param c es un n�mero real.
	 * @param d es un n�mero entero.
	 * @param e es un n�mero entero.
	 */
	public Resta(double a, double b, double c, int d, int e) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	/**
	 *  M�todo para restar n�meros reales.
	 *  Recibe 2 par�metros de entrada y 1 de salida que ser� el resultado.
	 *  Si uno de los datos es 0, el resultado ser�a igual al otro valor.
	 *  Si uno de los datos introducido es negativo, dar�a error.
	 *  @return resultado
	 */
	public double restaReales() {
		resultado = a - b;
		return resultado;
	}

	/**
	 *  M�todo para restar n�meros enteros.
	 *  Recibe 2 par�metros de entrada y 1 de salida que ser� el resultado.
	 *  Si uno de los datos es 0, el resultado ser�a igual al otro valor.
	 *  Si uno de los datos introducido es negativo, dar�a error.
	 *  @return resultado
	 */
	public double restaEnteros() {
		resultado = d - e;
		return resultado;
	}

	/**
	 *  M�todo para restar tres n�meros reales.
	 *  Recibe 3 par�metros de entrada y 1 de salida que ser� el resultado.
	 *  Si uno de los datos es 0, el resultado ser�a igual a la resta de los otros dos valores.
	 *  Si uno de los datos introducido es negativo, dar�a error.
	 *  @return resultado
	 */
	public double restaTres() {
		resultado = a - b - c;
		return resultado;
	}

	/**
	 *  M�todo para restar n�mero acumulado.
	 *  Recibe 1 par�metro de entrada y 1 de salida que ser� el resultado.
	 *  Si uno de los datos es 0, el resultado ser�a 0.
	 *  Si uno de los datos introducido es negativo, dar�a error.
	 */
	public void restaAcumulado() {
		resultado = c - c;
		

	}

}