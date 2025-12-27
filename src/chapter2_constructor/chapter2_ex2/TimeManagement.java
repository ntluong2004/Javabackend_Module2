package chapter2_constructor.chapter2_ex2;

public class TimeManagement {
    static void main() {


        Time a = new Time();
        a.exportTime();                           // 00:00:00
        Time b = new Time(7);
        b.exportTime();                           // 07:00:00
        Time c = new Time(7, 30);
        c.exportTime();                           // 07:30:00
        Time d = new Time(7, 30, 50);
        d.exportTime();                           // 07:30:50
        Time f = new Time(d);
        f.exportTime();// 07:30:50
    }
}
