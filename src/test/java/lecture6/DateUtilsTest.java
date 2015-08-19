package lecture6;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class DateUtilsTest {

    DateUtils dateUtils = new DateUtils();

    @Test
    public void testConvertDateSuccess() throws Exception {
        String actual = dateUtils.convertDate(new Date());
        assertNotNull(actual);
    }

    @Test
    public void testConvertDateMatches() throws Exception {
        String actual = dateUtils.convertDate(new Date());
        assertTrue(actual.matches("\\d\\d\\d\\d/\\d\\d/\\d\\d"));
    }

    @Test
    public void testConvertDateNull() throws Exception {
        String actual = dateUtils.convertDate(null);
        assertEquals("", actual);
    }

    @Test
    public void testConvertDateValid() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, Calendar.AUGUST, 20);
        String actual = dateUtils.convertDate(calendar.getTime());
        assertTrue(actual.endsWith("08/20"));
    }

    @Test
    public void testConvertDateValidMonth() throws Exception {
        String actual = dateUtils.convertDate(new Date());
        int month = Integer.parseInt(actual.substring(5, 7));
        assertTrue(month > 0 && month < 13);
    }

}