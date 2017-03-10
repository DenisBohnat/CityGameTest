package by.htp.game.dao;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class WrirecitiesTest {

	private int cityListSizeBefore;

	@Before
	public void initCitiesList() {
		Set<String> cityList;
		GameDaoImpl gameDao = new GameDaoImpl();
		cityList = gameDao.readCityList();
		cityListSizeBefore = cityList.size();
	}

	@Test
	public void testWriteWord() {
		GameDaoImpl gameDaoTest = new GameDaoImpl();
		gameDaoTest.addToFileCity("лос-анджелес");
		Set<String> cityListTest = gameDaoTest.readCityList();
		assertEquals(cityListSizeBefore + 1, cityListTest.size());
	}

}
