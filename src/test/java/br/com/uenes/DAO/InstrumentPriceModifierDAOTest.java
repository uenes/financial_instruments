package br.com.uenes.DAO;

import java.sql.SQLException;
import java.util.List;

import br.com.uenes.model.InstrumentPriceModifier;
import junit.framework.TestCase;

public class InstrumentPriceModifierDAOTest extends TestCase{
	public void getInstrumentsPriceModifierTest() {
		InstrumentPriceModifierDAO instrumentModifierDAO = new InstrumentPriceModifierDAO();
		List<InstrumentPriceModifier> listInstrument = null;
		try {
			listInstrument = instrumentModifierDAO.getIntrumentsPriceModifiers();
		} catch (ClassNotFoundException e) {
			assertTrue(false);
		} catch (SQLException e) {
			assertTrue(false);
		}
        assertTrue( listInstrument != null && listInstrument.size() > 0 );
    }
}
