package br.com.uenes.core;

import java.util.List;

import br.com.uenes.DAO.InstrumentDAO;
import br.com.uenes.model.Instrument;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	
	public void getInstrumentsOne19960108Test() {
		InstrumentDAO instrumentDAO = new InstrumentDAO();
		List<Instrument> listInstrument = instrumentDAO.getInstruments();
		
		
		
        assertTrue(true);
    }
}
