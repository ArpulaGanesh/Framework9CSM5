package genericLibraries2;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class javaUtility {
	public int generateRandomNum(int limit)
	  {
		  Random random=new Random();
		  return random.nextInt(limit);
	  }
	  public String getcurrentTime()
	  {
		  Date data=new Date(0);
		  SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
		  return sdf.format(data);
	  }
}
