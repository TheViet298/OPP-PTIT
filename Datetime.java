import java.util.Calendar;

public class Datetime {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month+1);
        System.out.println(day);
        
        // 
    }
}
