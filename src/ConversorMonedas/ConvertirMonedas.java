package ConversorMonedas;

import javax.swing.JOptionPane;


public class ConvertirMonedas {
	
	public void ConvertirPesosColombianosADolares(double valor) {
		double monedaDolar = valor / 4500.02;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ "Dolares");
	}
	
	public void ConvertirPesosColombianosAEuros(double valor) {
		double monedaEuro = valor / 4458.75;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ "Euros");
	}
	
	public void ConvertirPesosColombianosALibras(double valor) {
		double monedaLibra = valor / 5145.52;
		monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ "Libras esterlinas");
	}
	
	public void ConvertirPesosColombianosAYen(double valor) {
		double monedaYen = valor / 31.79;
		monedaYen = (double) Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ "Yenes");
	}
	
	public void ConvertirPesosColombianosAWonCoreano(double valor) {
		double monedaWon = valor / 0.30;
		monedaWon = (double) Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ "Wones");
	}
	
	public void ConvertirDolaresAPesosColombianos(double valor) {
		double monedaPesoDolar = valor / 0.00022;
		monedaPesoDolar = (double) Math.round(monedaPesoDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaPesoDolar+ "Pesos colombianos");
	}

	public void ConvertirEurosAPesosColombianos(double valor) {
		double monedaPesoEuro = valor / 0.00022;
		monedaPesoEuro = (double) Math.round(monedaPesoEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaPesoEuro+ "Pesos colombianos");
	}
	
	public void ConvertirLibrasAPesosColombianos(double valor) {
		double monedaPesoLibra = valor / 0.00019;
		monedaPesoLibra = (double) Math.round(monedaPesoLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaPesoLibra+ "Pesos colombianos");
	}
	
	public void ConvertirYenAPesosColombianos(double valor) {
		double monedaPesoYen = valor / 0.031;
		monedaPesoYen = (double) Math.round(monedaPesoYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaPesoYen+ "Pesos colombianos");
	}

	public void ConvertirWonCoreanoAPesosColombianos(double valor) {
		double monedaPesoWon = valor / 0.30;
		monedaPesoWon = (double) Math.round(monedaPesoWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaPesoWon+ "Pesos colombianos");
	}

}
