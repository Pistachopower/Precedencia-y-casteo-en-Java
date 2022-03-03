
public class PrecedenciaJava {

	public static void main(String[] args) {
		
		/*
		 * En la precedencia en Java si hacemos una 
		 * operacion aritmetica es importante conocer los resultados de las 
		 * operaciones, es decir, si colocamos un tipo de dato entero como 
		 * es el ejemplo anterior, al realizar la division que está dentro 
		 * del paréntesis el resultado (que da 1,75) lo va a convertir en 
		 * entero (1) y va arrojar como resultado final un 8
		 * */
		
		//Java va a hacer la siguiente operacion: 7/4: 1,75 (quita los decimales) 
		//1*3:3+5:8
		int oper= 5+3*(7/4);
		System.out.println(oper);
		
		
		
		/*
		 * En el siguiente ejemplo Java realiza la operacion de izquierda 
		 * a derecha; ahora si se quiere obligar a que primero haga el ==
		 * podemos utilizar los paréntesis () para que haga primero dicha 
		 * expresion y luego las demás.   
		 *  
		 * */
		
		boolean operacion= 3<= 5 && 2==2;
		System.out.println(operacion);
		
		/*
		 * Otro punto importante es el casteo, es decir, cuando hay un valor entero
		 * y otro double. Java para realizar la operación cambia alguno de los tipos
		 * de datos (entero o decimal) y lo convierte al tipo seleccionado. Veamos el
		 * siguiente ejemplo:
		 * */
		
		int var=1;
		double var2= 3.5;
		
		int result=  (int) (var+var2);
		System.out.println(result);

	}

}
