package una_clase_sin_metodos;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		 String cadena;
   	  double ladoA;
   	  double ladoB;
   	  double resultado;
   	   
   	  cadena = JOptionPane.showInputDialog(null,"ingrese la longitud del lado a:");
   	  ladoA = Double.parseDouble(cadena);
   	  
   	  cadena = JOptionPane.showInputDialog(null,"ingrese la longitud del lado B:");
   	  ladoB = Double.parseDouble(cadena);
   	  
   	  
   	  resultado = ladoA * ladoB;
   	  JOptionPane.showMessageDialog(null, "el resultado es: "+ resultado);
 
	}

}
