package lecture6;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    public void testCountCharactersNull() throws Exception {
        int count = stringUtils.countCharacters(null, ' ');
        assertEquals(0, count);
    }

    @Test
    public void testCountCharactersEmpty() throws Exception {
        int count = stringUtils.countCharacters("", ' ');
        assertEquals(0, count);
    }

    @Test
    public void testCountCharactersSuccess() throws Exception {
        int count = stringUtils.countCharacters("ololo", 'o');
        assertEquals(3, count);
    }

    @Test
    public void testCountCharactersSpaces() throws Exception {
        int count = stringUtils.countCharacters(" hello world !", ' ');
        assertEquals(3, count);
    }

    @Test
    public void testCountCharactersDigits() throws Exception {
        int count = stringUtils.countCharacters("7777777", '7');
        assertEquals(7, count);
    }
}