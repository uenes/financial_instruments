package br.com.uenes.DAO;

import java.util.List;

import br.com.uenes.model.Instrument;
import junit.framework.TestCase;

public class InstrumentDAOTest extends TestCase {
	public void testApp() {
		InstrumentDAO instrumentDAO = new InstrumentDAO();
		List<Instrument> listInstrument = instrumentDAO.getInstruments();
        assertTrue( listInstrument != null && listInstrument.size() > 0 );
    }
}
