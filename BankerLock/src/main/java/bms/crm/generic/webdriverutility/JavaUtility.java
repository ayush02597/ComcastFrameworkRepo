package bms.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random ran = new Random();
		int randomno = ran.nextInt(5000);
		return randomno;

	}

	public String getSystemDateDDmmYYYY() {
		Date dateobj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy ");
		String date = sdf.format(dateobj);
		return date;

	}

	public String getRequiredDateDDmmYYYY(int days) {
		Date dateobj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy ");
		String date = sdf.format(dateobj);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 30);
		String reqdate = sdf.format(cal.getTime());
		return reqdate;

	}
}
