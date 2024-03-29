package genericLabraries;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class javaUtility {

	/**
	 * This method generates random number within the limit specified
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
	/**
	 * This method generates current time 
	 * @return
	 */
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
		return sdf.format(date);
	}
}
