package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversion;

public class Principal {

	public static void main(String[] args) {

		OpcionesConversion conversion = new OpcionesConversion();
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opci�n de conversi�n", 
					"Men�", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Conversor de monedas", 
					"Conversor de temperatura"}, "Elegir").toString();
			
			switch(opciones) {
			case "Conversor de monedas":

				try {
					
				    String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
					double valorRecibido = Double.parseDouble(input);
					conversion.ConvertirMonedas(valorRecibido);
					
				} catch (NumberFormatException e) {

					JOptionPane.showMessageDialog(null, "Valor no v�lido");
				}
				
				


				
				
		
				int respuesta = JOptionPane.showConfirmDialog(null, "�Desea realizar otra conversi�n?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opci�n afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
					System.exit(0);
				}
				break;
			}
		}

	}

}
