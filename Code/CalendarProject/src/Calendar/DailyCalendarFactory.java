package Calendar;

import Calendar.CalendarAbstract;
import Calendar.CalendarFactory;
import Calendar.DailyCalendar;

public class DailyCalendarFactory implements CalendarFactory {
    @Override
    public CalendarAbstract createCalendar() {
        return new DailyCalendar();
    }
}