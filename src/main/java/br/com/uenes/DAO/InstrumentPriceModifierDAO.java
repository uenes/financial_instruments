package br.com.uenes.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.uenes.model.InstrumentPriceModifier;

public class InstrumentPriceModifierDAO {

	public InstrumentPriceModifierDAO() {

	}

	public List<InstrumentPriceModifier> getIntrumentsPriceModifiers() throws SQLException, ClassNotFoundException {
		Connection connection = openConnection();
		List<InstrumentPriceModifier> list = new ArrayList<InstrumentPriceModifier>();
		
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM INSTRUMENT_PRICE_MODIFIER");
		while (rs.next()) {
			InstrumentPriceModifier instrumentPriceModifier = new InstrumentPriceModifier();
		    instrumentPriceModifier.setName(rs.getString("ID"));
		    instrumentPriceModifier.setMultiplier(rs.getDouble("MULTIPLIER"));
		    
		    list.add(instrumentPriceModifier);
		}
		
		connection.close();
		return list;
	}

	private Connection openConnection() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		return conn;
	}
}
