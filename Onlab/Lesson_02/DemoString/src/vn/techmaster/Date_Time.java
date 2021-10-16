package vn.techmaster;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date_Time {
    public static void getDate(){
        LocalDate toDay = LocalDate.now();
        System.out.println("Hôm nay là ngày: " +toDay);

        LocalDate currentDate = LocalDate.of(2021, 10, 20);
        System.out.println("Ngày nào đấy: " +currentDate);

        LocalDate date = LocalDate.of(2012, Month.MAY, 13);
        System.out.println("Sử dụng enum: " + date);
        System.out.println("Ngày mai : " + toDay.plusDays(1));
        System.out.println("Ngày này tháng sau: " + toDay.plusMonths(1));
        System.out.println("ngày này năm sau: " + toDay.plusYears(1));

        System.out.println("Ngày hôm qua: " +toDay.minusDays(1));

        System.out.println(toDay.getDayOfWeek());
        System.out.println(toDay.getDayOfYear());

    }

    public static void getTime(){
        LocalTime now = LocalTime.now();
        System.out.println("Bây giờ là: " +now);

        LocalTime hour = LocalTime.of(12, 30);
        System.out.println("Giờ nào đấy: " +hour);
    }


    public static void getDateTime(){
        LocalDateTime toDay = LocalDateTime.now();
        System.out.println("Ngày và giờ hiện tại: " + toDay);

        LocalDateTime currentDate = LocalDateTime.of(2021, 10, 13, 12, 30);
        System.out.println("nagyf giờ nào đấy: " +currentDate);
    }

    public void FormatDateTime(){
        LocalDate now = LocalDate.now();
        System.out.println("Ngày khi chưa định dạng: " +now);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Ngày tháng sau khi định dạng: " +now.format(myFormat));

        LocalDateTime toDay = LocalDateTime.now();
        System.out.println("Khi chưa định dạng: " +toDay);
        DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("HH:mm, dd/MM/yyyy");
        System.out.println("Sau khi định dạng: " +toDay.format(myFormat2));
    }



}
