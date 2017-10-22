package br.com.uenes.DAO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import br.com.uenes.core.CalculationMode;
import br.com.uenes.core.Calculator;
import br.com.uenes.core.CalculatorInstrumentDefault;
import br.com.uenes.core.CalculatorInstrumentThree;
import br.com.uenes.core.Constants;
import br.com.uenes.model.Instrument;

public class InstrumentDAO {
	private ArrayList<Instrument> listInstrument = new ArrayList<Instrument>();

	public List<Instrument> getInstruments() {
		try (Stream<String> stream = Files.lines(Paths.get(Constants.FILE_PATH))) {

			stream.parallel().forEach(s -> listInstrument.add(getInstrumentFromString(s)));
			//stream.forEach(s -> listInstrument.add(getInstrumentFromString(s)));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		listInstrument.sort(Comparator.comparing(Instrument::getDate));

		return listInstrument;
	}

	private Instrument getInstrumentFromString(String line) {
		Instrument instrument = null;
		String[] arr = line.split("[,]");
		if (arr.length == 3) {
			LocalDate date = getDate(arr[1]);
			String name = arr[0];
			Float price = Float.parseFloat(arr[2]);
			
			if (name.equals(Constants.INSTRUMENT_THREE)) {
				Calculator calculator = new CalculatorInstrumentThree();
				List<Instrument> list = (List<Instrument>) listInstrument.clone();
				Instrument i = new Instrument(name, date, price);
				list.add(i);
				CalculationMode.setInstrument3Result(calculator.calculate(list));
			}
			
			instrument = new Instrument(name, date, price);
		}
		return instrument;
	}

	private LocalDate getDate(String txtDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy").withLocale(Locale.US);
		return LocalDate.parse(txtDate, formatter);
	}

}
