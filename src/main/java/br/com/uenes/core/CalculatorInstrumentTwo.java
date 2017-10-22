package br.com.uenes.core;


import java.time.LocalDate;
import java.util.List;

import br.com.uenes.model.Instrument;

public class CalculatorInstrumentTwo implements Calculator{
	private static final Integer YEAR = 2014;
	private static final Integer NOVEMBER = 10;
	
	@Override
	public Float calculate(List<Instrument> listInstrument) {
		Float sum = 0f;
		Integer count = 0;
		
		for (Instrument inst : listInstrument) {
			if (inst.getName().equals(Constants.INSTRUMENT_TWO) && isNovember2014(inst.getDate())) {
				count++;
				sum += inst.getValue();
			}
		}
		
		Float result = sum / count;
		return result;
	}
	
	private boolean isNovember2014(LocalDate date) {
		return (date.getMonthValue() == NOVEMBER && date.getYear() == YEAR);
	}
}
