package util;

import java.util.Calendar;


public class Commons {

    public void getDate()
    {
       Calendar c = Calendar.getInstance();
        System.out.println(" The present Date is = " + c.getTime()) ;
        // increasing the present date by 1
        c.add(Calendar.DATE, 1) ;
        System.out.println(" The date after increasing is = " + c.getTime()) ;
        String date = c.getTime().toString();
    }
}
