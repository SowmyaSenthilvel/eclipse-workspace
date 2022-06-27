import java.sql.Timestamp;
import java.util.*;
import java.util.Date;

public class TimeStampDemo {

	public static void main(String[] args) {
		System.out.println("Enter a date");
		Timestamp timestamp=new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		System.out.println(System.currentTimeMillis());
		Date date=new Date();
		long milli=date.getTime();
		System.out.println(milli);
		System.out.println(new Timestamp(date.getTime()));

	}

}
