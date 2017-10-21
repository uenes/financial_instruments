package br.com.uenes.DAO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import br.com.uenes.core.Constants;
import br.com.uenes.model.Instrument;

public class InstrumentDAO {

	public List<Instrument> getInstruments() {
		List<Instrument> listInstrument = new ArrayList<Instrument>();
		try (Stream<String> stream = Files.lines(Paths.get(Constants.FILE_PATH))) {

			stream.parallel().forEach(s -> listInstrument.add(getInstrumentFromString(s)));

		} catch (IOException e) {
			e.printStackTrace();
		}

		return listInstrument;
	}

	private Instrument getInstrumentFromString(String line) {
		Instrument instrument = null;
		String[] arr = line.split("[,]");
		if (arr.length == 3) {
			Date date = getDate(arr[1]);
			String name = arr[0];
			Float price = Float.parseFloat(arr[2]);
			instrument = new Instrument(name, date, price);
		}
		return instrument;
	}

	private Date getDate(String txtDate) {
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.US);
		Date date = null;
		try {
			date = df.parse(txtDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
