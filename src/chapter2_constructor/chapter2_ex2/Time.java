package chapter2_constructor.chapter2_ex2;

public class Time {
    int hour = 0;
    int minute = 0;
    int second = 0;


    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public void exportTime() {
        System.out.printf("%02d:%02d:%02d \n", this.hour, this.minute, this.second);
    }

    public Time(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(Time time) {
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }

}
