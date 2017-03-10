package by.htp.game.service;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerMoveValideTest {

	private static Set<String> cityPlayList;

	@BeforeClass
	public static void initCitiesList() {
		cityPlayList = new LinkedHashSet<String>();
		cityPlayList.add("анапа");
		cityPlayList.add("пинск");
		cityPlayList.add("минск");
		cityPlayList.add("гомель");
		cityPlayList.add("вологда");
	}

	@Test
	public void testPlayerMoveValide() {
		boolean insFlag = GameLogic.inspectionWord("Молодечно", cityPlayList, 'м');
		assertTrue(insFlag);
	}

	@Test
	public void testCitiesChainMove() {
		int sizeList = cityPlayList.size();
		assertTrue(GameLogic.inspectionWord("брест", cityPlayList, 'б'));
		assertEquals((sizeList + 1), cityPlayList.size());
	}
}
