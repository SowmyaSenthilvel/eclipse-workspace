import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Dateformat {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date past = format.parse("01/10/2010");
        Date now = new Date();

        System.out.println(TimeUnit.MILLISECONDS.toMillis(now.getTime() - past.getTime()) + " milliseconds ago");
        System.out.println(TimeUnit.MILLISECONDS.toMinutes(now.getTime() - past.getTime()) + " minutes ago");
        System.out.println(TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime()) + " hours ago");
        System.out.println(TimeUnit.MILLISECONDS.toDays(now.getTime() - past.getTime()) + " days ago");

	}

}
