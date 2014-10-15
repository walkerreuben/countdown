package walkerreuben;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyDate {
	Calendar date = Calendar.getInstance();
	String name = "(Name not set)";
	
	public MyDate(String date, String name) throws ParseException {
		setDate(date);
		setName(name);
	}
	
	public MyDate() {
	}
	
	public long getSeconds() {
		return (date.getTimeInMillis())/1000;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDate(String date) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss, dd/MM/yyyy");
		this.date.setTime(df.parse(date));
	}
	
	public String getDiffString(MyDate d2) {
		long result = this.getSeconds() - d2.getSeconds();
		return NumberFormat.getNumberInstance().format(result);
	}
}