package by.htp.game.dao;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class WrireCitiesTest {

	private static final String PATH = "src/test/resources\\CityListTest.txt";
	private String testWord="лос-анджелес";
	
	private int cityListSizeBefore;

	@Before
	public void initCitiesList() throws DaoException {
		Set<String> cityList;
		GameDaoImpl gameDao = new GameDaoImpl();
		cityList = gameDao.readCityList(PATH);
		cityList.remove(testWord);
		cityListSizeBefore = cityList.size();
	}

	@Test
	public void testWriteWord() throws DaoException {
		GameDaoImpl gameDaoTest = new GameDaoImpl();
		gameDaoTest.addToFileCity(testWord,PATH);
		Set<String> cityListTest = gameDaoTest.readCityList(PATH);
		assertEquals(cityListSizeBefore + 1, cityListTest.size());
	}

}
