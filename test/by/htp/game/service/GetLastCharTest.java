package by.htp.game.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.htp.game.service.GameLogic;

@RunWith(value = Parameterized.class)
public class GetLastCharTest {

	private String word;
	private char lastChar;

	@Parameters
	public static Collection<Object[]> set_of_parameters() {
		return Arrays.asList(new Object[][] { { "√омель", 'л' }, { "√усь-’рустальный", 'н' }, { "«еленоградск", 'к' },
				{ "»вдель", 'л' }, { "Ћенинск- узнецкий", 'и' } });
	}

	public GetLastCharTest(String word, char lastChar) {
		this.word = word;
		this.lastChar = lastChar;
	}

	@Test
	public void testLastChar() {
		char testChar;
		testChar = GameLogic.getNormalLastChar(word);
		assertEquals(lastChar, testChar);
	}

}
