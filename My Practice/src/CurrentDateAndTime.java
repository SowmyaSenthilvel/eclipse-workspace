import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class CurrentDateAndTime {
	//1.SimpleDateFormat

	public static void main(String[] args) {
		Date dat=new Date(System.currentTimeMillis());
		System.out.println(dat);
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		

	}

}
