package hackerrank;

public class TimeConversion {
    public static void main(String[] args) {

        timeConversion("07:34:12PM");
        timeConversion("07:34:12AM");
        timeConversion("12:00:00AM");
        timeConversion("12:00:00PM");

    }

    static String timeConversion(String s) {
        String hour = s.substring(0, 2);
        int hourInteger = Integer.parseInt(hour);
        String convertedHour="";
        if(s.contains("PM")) {
            if (hourInteger < 12){
                hourInteger+= 12;
            }
            convertedHour = hourInteger + "";
        } else {
            if (hourInteger == 12) {
                convertedHour = "00";
            } else {
                convertedHour = hourInteger < 10? "0" + hourInteger : "" + hourInteger;
            }
        }
        String convertedTime = ""+ convertedHour + s.substring(2,8);
        System.out.println("converted: " + convertedTime);
        return convertedTime;

    }

}
