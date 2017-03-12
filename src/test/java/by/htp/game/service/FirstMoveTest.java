package by.htp.game.service;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

public class FirstMoveTest {

	private static char lastChar;
	private static Set<String> cityPlayList;

	@BeforeClass
	public static void initCitiesList() {
		lastChar = ' ';
		cityPlayList = new LinkedHashSet<String>();
	}

	@Test
	public void testPlayerFirstMove() {
		assertTrue(GameLogic.inspectionWord("Новополоцк", cityPlayList, lastChar));
		assertEquals(1, cityPlayList.size());
	}

}
