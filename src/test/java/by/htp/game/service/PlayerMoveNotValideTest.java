package by.htp.game.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PlayerMoveNotValideTest {

	private static Set<String> cityPlayList;
	private String word;
	private char lastChar;

	public PlayerMoveNotValideTest(String word, char lastChar) {
		this.word = word;
		this.lastChar = lastChar;
	}

	@Parameters
	public static Collection<Object[]> set_of_parameters() {
		return Arrays.asList(new Object[][] { { "гомель", 'г' }, { "Вологда", 'в' }, { "Зеленоградск", 'к' },
				{ "ивдель", 'л' }, { "Минск", 'и' } });
	}

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
	public void testPlayerMoveNotValide() {
		assertFalse(GameLogic.inspectionWord(word, cityPlayList, lastChar));
	}

}
