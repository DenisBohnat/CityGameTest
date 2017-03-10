package by.htp.game.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReadCitiesTest {
	
	@Test
	public void testReadCollection() {
		GameDaoImpl gameDao = new GameDaoImpl();
		assertFalse(gameDao.readCityList().isEmpty());
	}

}
