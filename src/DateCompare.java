import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateCompare {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	      //Date date1 = sdf.parse("2009-12-31");
	      Date date1 = sdf.parse("2020-02-01");
	      Date date2 = sdf.parse("2020-02-01");

	      System.out.println("date1 : " + sdf.format(date1));
	      System.out.println("date2 : " + sdf.format(date2));

	      if (date1.equals(date2)) {
	          System.out.println("Date1 is equal Date2");
	      }

	      if (date1.after(date2)) {
	          System.out.println("Date1 is after Date2");
	      }

	      if (date1.before(date2)) {
	          System.out.println("Date1 is before Date2");
	      }
	}

}
