package br.com.uenes;

import br.com.uenes.DAO.InstrumentDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	long startTime = System.currentTimeMillis();
    	
        InstrumentDAO instrumentDAO = new InstrumentDAO();
        instrumentDAO.getInstruments();
        
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
