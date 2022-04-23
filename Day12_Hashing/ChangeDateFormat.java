package Day12_Hashing;

import java.util.*;

public class ChangeDateFormat {
    public String solve(String A) {
        String dateStr = "";
        String tempStr = A.replace("st", "").replace("nd", "").replace("rd", "").replace("th", "");
        if (tempStr.length() < 11)
            tempStr = "0" + tempStr;
        String month = tempStr.substring(3, 6);
        String date = tempStr.substring(0, 2);
        String year = tempStr.substring(7);
        HashMap<String, String> mp = new HashMap<>();
        mp.put("Jan", "01");
        mp.put("Feb", "02");
        mp.put("Mar", "03");
        mp.put("Apr", "04");
        mp.put("May", "05");
        mp.put("Jun", "06");
        mp.put("Jul", "07");
        mp.put("Aug", "08");
        mp.put("Sep", "09");
        mp.put("Oct", "10");
        mp.put("Nov", "11");
        mp.put("Dec", "12");
        dateStr = year + "-" + mp.get(month) + "-" + date;
        return dateStr;

    }

    public static void main(String[] args) {
        ChangeDateFormat obj = new ChangeDateFormat();
        System.out.println(obj.solve("1st Mar 1984"));
    }
}
