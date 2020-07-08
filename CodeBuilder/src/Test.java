import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		String [] dateArray = {"2019-01-02","2019-01-03"};
		List<String> listDate = new ArrayList<String>();
		for(String date:dateArray){
			listDate.add(date);
		}
		Collections.sort(listDate);
		
		List<List<String>> ss = new ArrayList<List<String>>();
		
		for(int i=0;i<listDate.size();i++){
			List<String> ll = new ArrayList<String>();
			if(i==listDate.size()-2){
				break;
			}
			ll.add(listDate.get(i));
			ll.add(listDate.get(i+1));
			ll.add(listDate.get(i+2));
			ss.add(ll);
		}
		for(List<String> list1:ss){
			for(String str:list1){
				System.out.print(str+" ");
			}
			
			Date date1 = null;
			Date date2 = null;
			
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
			  try {
				date1=formatter.parse(list1.get(0));
				date2=formatter.parse(list1.get(2)); 
				int count = differentDays(date1,date2);
				if(count<=30){
					System.out.print("   "+count+"天  是1月内连续3次");
				}else{
					System.out.print("   "+count+"天  不是1月内连续3次");
				}
			} catch (ParseException e) {
				e.printStackTrace();
			} 
			  
			 
			System.out.println();
		}
	}
	
	public static int differentDays(Date date1,Date date2)
    {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
       int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);
        
        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2)   //同一年
        {
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年            
                {
                    timeDistance += 366;
                }
                else    //不是闰年
                {
                    timeDistance += 365;
                }
            }
            
            return timeDistance + (day2-day1) ;
        }
        else    //不同年
        {
//            System.out.println("判断day2 - day1 : " + (day2-day1));
            return day2-day1;
        }
    }
	
}
