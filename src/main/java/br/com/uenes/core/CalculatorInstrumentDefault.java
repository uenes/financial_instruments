package br.com.uenes.core;

import java.util.List;

import br.com.uenes.model.Instrument;

public class CalculatorInstrumentDefault implements Calculator{

	@Override
	public Float calculate(List<Instrument> listInstrument) {
		Float sum = 0f;
		Integer count = 0;
		
		int size = listInstrument.size();
		int sub = 10;
		if (size < sub)
			sub = size;
		for (int i = size - 1 ; i >= size - sub ; i--) { 
			if (isOtherInstrument(listInstrument.get(i))) {
				count++;
				sum += listInstrument.get(i).getValue();
			}
		}
		
		Float result = sum / count;
		return result;
	}

	private boolean isOtherInstrument(Instrument inst) {
		return !inst.getName().equals(Constants.INSTRUMENT_ONE) &&
				!inst.getName().equals(Constants.INSTRUMENT_TWO) &&
				!inst.getName().equals(Constants.INSTRUMENT_THREE);
	}

}
