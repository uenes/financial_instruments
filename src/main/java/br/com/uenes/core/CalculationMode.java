package br.com.uenes.core;

import java.util.List;

import br.com.uenes.model.Instrument;

public class CalculationMode {
	private static Float instrument1Result;
	private static Float instrument2Result;
	private static Float instrument3Result;
	private static Float instrumentOtherResult;
	
	public static void calculateInstruments (List<Instrument> list) {
		Calculator calculator = null;
		// Calculate inst1
		calculator = new CalculatorInstrumentOne();
		CalculationMode.setInstrument1Result(calculator.calculate(list));
		// Calculate inst2
		calculator = new CalculatorInstrumentTwo();
		CalculationMode.setInstrument2Result(calculator.calculate(list));
		// Calculate others
		calculator = new CalculatorInstrumentDefault();
		CalculationMode.setInstrumentOtherResult(calculator.calculate(list));
	}
	
	public static Float getInstrument1Result() {
		return instrument1Result;
	}

	public static void setInstrument1Result(Float instrument1Result) {
		CalculationMode.instrument1Result = instrument1Result;
	}

	public static Float getInstrument2Result() {
		return instrument2Result;
	}

	public static void setInstrument2Result(Float instrument2Result) {
		CalculationMode.instrument2Result = instrument2Result;
	}

	public static Float getInstrument3Result() {
		return instrument3Result;
	}

	public static void setInstrument3Result(Float instrument3Result) {
		CalculationMode.instrument3Result = instrument3Result;
	}

	public static Float getInstrumentOtherResult() {
		return instrumentOtherResult;
	}

	public static void setInstrumentOtherResult(Float instrumentOtherResult) {
		CalculationMode.instrumentOtherResult = instrumentOtherResult;
	}
}
