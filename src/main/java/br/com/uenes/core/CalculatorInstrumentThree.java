package br.com.uenes.core;

import java.util.List;

import br.com.uenes.model.Instrument;

public class CalculatorInstrumentThree implements Calculator{

	@Override
	public Float calculate(List<Instrument> listInstrument) {
		Float sum = 0f;
		int quantity = 0;
		for (Instrument i : listInstrument) {
			quantity++;
			sum += i.getValue();
		}
		return sum / quantity;
	}
	
}
