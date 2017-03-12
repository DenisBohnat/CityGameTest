package by.htp.game.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class OpponentMoveTest {

	private static Set<String> cityList;
	private static Set<String> cityPlayList;
	private String word;

	public OpponentMoveTest(String word) {
		this.word = word;
	}

	@Parameters
	public static Collection<Object[]> set_of_parameters() {
		return Arrays.asList(
				new Object[][] { { "ясная поляна" }, { "Вологда" }, { "Зеленоградск" }, { "ивдель" }, { "Полоцк" } });
	}

	@BeforeClass
	public static void initCitiesList() {
		cityList = new HashSet<String>();
		cityList.add("Анапа");
		cityList.add("Ангарск");
		cityList.add("Арзамас");
		cityList.add("Канск");
		cityList.add("Лепель");
		cityList.add("Клецк");
		cityPlayList = new LinkedHashSet<String>();
		cityPlayList.add("анапа");
		cityPlayList.add("пинск");
		cityPlayList.add("минск");
		cityPlayList.add("гомель");
		cityPlayList.add("вологда");
	}

	@Test
	public void testOpponentMoveValide() {
		assertTrue(GameLogic.opponentMove(word, cityList, cityPlayList));
	}

}
