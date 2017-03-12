package by.htp.game.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReadCitiesTest {

	private static final String PATH = "src/test/resources\\CityListTest.txt";
	
	@Test
	public void testReadCollection() throws DaoException {
		GameDaoImpl gameDao = new GameDaoImpl();
		assertFalse(gameDao.readCityList(PATH).isEmpty());
	}

}
