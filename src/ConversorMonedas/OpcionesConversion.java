package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	public void ConvertirMonedas(double valor) {
	
	ConvertirMonedas monedas = new ConvertirMonedas();	
	String opciones = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir el dinero", 
			"Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"De Pesos colombianos a Dólar", 
			"De Pesos colombianos a Euro", "De Pesos colombianos a Libras", "De Pesos colombianos a Yen", "De Pesos colombianos a Won Coreano", "De Dólar a Pesos colombianos", 
			"De Euro a Pesos colombianos", "De Libras a Pesos colombianos", "De Yen a Pesos colombianos", "De Won Coreano a Pesos colombianos"}, "Selección").toString();
	switch (opciones) {
	case "De Pesos colombianos a Dólar": 
		monedas.ConvertirPesosColombianosADolares(valor);
		break;
	
	case "De Pesos colombianos a Euro":
		monedas.ConvertirPesosColombianosAEuros(valor);
		break;
		
	case "De Pesos colombianos a Libras":
		monedas.ConvertirPesosColombianosALibras(valor);
		break;
		
	case "De Pesos colombianos a Yen": 
		monedas.ConvertirPesosColombianosAYen(valor);
		break;
	
	case "De Pesos colombianos a Won Coreano":
		monedas.ConvertirPesosColombianosAWonCoreano(valor);
		break;
		
	case "De Dólar a Pesos colombianos":
		monedas.ConvertirDolaresAPesosColombianos(valor);
		break;
		
	case "De Euro a Pesos colombianos": 
		monedas.ConvertirEurosAPesosColombianos(valor);
		break;
	
	case "De Libras a Pesos colombianos":
		monedas.ConvertirLibrasAPesosColombianos(valor);
		break;
		
	case "De Yen a Pesos colombianos":
		monedas.ConvertirYenAPesosColombianos(valor);
		break;
		
	case "De Won Coreano a Pesos colombianos": 
		monedas.ConvertirWonCoreanoAPesosColombianos(valor);
		break;

		}
	}
}
