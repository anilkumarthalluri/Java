enum Daysof_week{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class day_enum {
    public static void main(String[] args){
        Daysof_week day = Daysof_week.SUNDAY;
        System.out.println("Today is "+day);
    }
}