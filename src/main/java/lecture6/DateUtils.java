package lecture6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public String convertDate(Date date) {
        if (date == null) return "";
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        return format.format(date);
    }
}
