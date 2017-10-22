package br.com.uenes;

import java.util.List;

import br.com.uenes.DAO.InstrumentDAO;
import br.com.uenes.core.CalculationMode;
import br.com.uenes.model.Instrument;

public class App {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		// Get the price modifier
		// Get all instruments in a ordered list by date from file calculating on-the-fly
		InstrumentDAO instrumentDAO = new InstrumentDAO();
		List<Instrument> listInstruments = instrumentDAO.getInstruments(); 
		//for (Instrument i : listInstruments) 
		//	System.out.println(i.getDate());
		// Pass to Calculation Mode the read list
		CalculationMode.calculateInstruments(listInstruments);
		// Show the result
		System.out.println("Calculation of Instrument 1 - " + CalculationMode.getInstrument1Result());
		System.out.println("Calculation of Instrument 2 - " + CalculationMode.getInstrument2Result());
		System.out.println("Calculation of Instrument 3 - " + CalculationMode.getInstrument3Result());
		System.out.println("Calculation of Instrument Others - " + CalculationMode.getInstrumentOtherResult());

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("-------------------------------------------");
		System.out.println("Execution Time : " + totalTime + " ms");
	}
}
