package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversion;

public class Principal {

	public static void main(String[] args) {

		OpcionesConversion conversion = new OpcionesConversion();
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", 
					"Menú", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Conversor de monedas", 
					"Conversor de temperatura"}, "Elegir").toString();
			
			switch(opciones) {
			case "Conversor de monedas":

				try {
					
				    String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
					double valorRecibido = Double.parseDouble(input);
					conversion.ConvertirMonedas(valorRecibido);
					
				} catch (NumberFormatException e) {

					JOptionPane.showMessageDialog(null, "Valor no válido");
				}
				
				


				
				
		
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opción afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
					System.exit(0);
				}
				break;
			}
		}

	}

}
