package br.com.uenes.core;

import java.util.List;

import br.com.uenes.model.Instrument;

public class CalculatorInstrumentOne implements Calculator{
	
	@Override
	public Float calculate(List<Instrument> listInstrument) {
		Float sum = 0f;
		Integer count = 0;
		
		for (Instrument inst : listInstrument) {
			if (inst.getName().equals(Constants.INSTRUMENT_ONE)) {
				count++;
				sum += inst.getValue();
			}
		}
		
		Float result = sum / count;
		return result;
	}
}
