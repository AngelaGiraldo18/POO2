package poo;

import javax.swing.JOptionPane;

public class Number {
		int number;// Variable para almacenar el número ingresado
		int i , neg= 0, par = 0;// Variables de control para contar números negativos y pares

		public void entrada() {
			for (i = 0; i < 5; i++) {// Ciclo para solicitar 5 números al usuario
				number= Integer.parseInt(JOptionPane.showInputDialog("digite numero "+(1+i)));
				if(number%2==0) {// Comprobar si el número es par
					par++;// Incrementar el contador de números pares
				}else if (number<0) {// Comprobar si el número es negativo
					
					neg ++;// Incrementar el contador de números negativos
				}
			} // Mostrar el resultado con JOptionPane
			JOptionPane.showInputDialog(null,"el numero de numeros pares es: "+par+"\n"+" Y los numeros negativos son :"+neg);
		}
		public static int ingresarDatos(String mensaje) {
			String cadena;
			int valor;
			cadena = JOptionPane.showInputDialog(null,mensaje);// Mostrar el mensaje y recibir la entrada del usuario
			valor = Integer.parseInt(cadena);// Convertir la entrada a un entero
			return valor;// Devolver el valor ingresado
		}

}
