import java.sql.Timestamp;
import java.util.Date;

public class TimeStampDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timestamp timestamp=new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		
		Date date=new Date();
		System.out.println(new Timestamp(date.getTime()));
	}

}
