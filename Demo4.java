public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String DAYCLR= "\033[32m";
        String MONTHCLR = "\033[33m";
        String YEARCLR= "\033[34m";
        String HOURCLR = "\033[35m";
        String MINUTECLR = "\033[36m";
        String SECONDCLR = "\033[37m";
        String RESET = "\033[0m";

        System.out.printf("%s%s%s/%s%s%3$s/%s%s%3$s %s%s%3$s:%s%s%3$s:%s%s%3$s\n", DAYCLR,day,RESET,MONTHCLR,month,YEARCLR,year,HOURCLR,hour,MINUTECLR,minute,SECONDCLR,second);
    }
}