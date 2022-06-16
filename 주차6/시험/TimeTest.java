package 시험;

import 수업.test1;

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(1, 10, 9);
        Time t2 = new Time(2, 20, 10);

        System.out.println(t1.diff(t2));
        System.out.println(t1.equals(t2));
        System.out.println(t1.compareTo(t2));

        Time t3 = new Time(19, 23, 9);
        Time t4 = new Time(7, 59, 37);
        System.out.println(Time.toSecond(19, 23, 9));

        System.out.println(t3.diff(t4));
        
    }
}

class Time implements Comparable<Time> {
    private int h, m, s; // 시 분 초

    public Time() {

    }

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public String toString() {
        return String.format("%d:%d:%d", h, m, s);
    }

    public Time diff(Time t) {
        if (toSecond(h, m, s) > toSecond(t.h, t.m, t.s)) { // 첫번째 객체가 더 큰경우
            if (m > t.m)
                return new Time(h - t.h, m - t.m, s - t.s);
            else if (m < t.m) { // 첫번째 객체가 두번째 객체의 '분'보다 더 작은경우
                if (s > t.s)
                    return new Time(h - t.h, m - t.m, s - t.s);
                else if (s < t.s) // 첫번째 객체가 두번째 객체의 분과 초가 더 작은경우
                    return new Time(h - 1 - t.h, m - t.m + 60 - 1, s + 60 - t.s);

                return new Time(h - 1 - t.h, m + 60 - t.m, s - t.s);
            }

            if (s > t.s)
                return new Time(h - t.h, m - t.m, s - t.s);
            else if (s < t.s) // 첫번째 객체가 두번째 객체의 '초'보다 더 작은경우
                return new Time(h - t.h, m - t.m - 1, s + 60 - t.s);

            return new Time(h - t.h, m - t.m, s - t.s);

        } else {
            if (toSecond(h, m, s) < toSecond(t.h, t.m, t.s)) { // 두번째 객체가 더 큰경우
                if (t.m > m)
                    return new Time(t.h - h, t.m - m, t.s - s);
                else if (t.m < m) { // 두번째 객체가 첫번째 객체의 '분'보다 더 작은경우
                    if (t.s > s)
                        return new Time(t.h - h, t.m - m,t.s -s);
                    else if (t.s < s) // 두번째 객체가 첫번째 객체의 분과 초가 더 작은경우
                        return new Time(t.h - 1 -h , t.m - m + 60 - 1  , t.s - s + 60);

                    return new Time(t.h- h - 1, t.m - m + 60 ,t.s- s );
                }

                if (s > t.s)
                    return new Time( t.h- h, t.m - m , t.s - s );
                else if (s < t.s) // 두번째 객체가 첫번째 객체의 '초'보다 더 작은경우
                    return new Time(t.h - h, t.m -1- m , t.s- s + 60 );
            }
                return new Time(t.h - h, t.m - m , t.s - s);
            
        }
    }

    public static int toSecond(int h, int m, int s) {
        int getSeconds = h * 3600 + m * 60 + s;
        return getSeconds;
    }

    public boolean equals(Object o) {
        Time t1 = (Time) o; // downcasting
        return h == t1.h && m == t1.m && s == t1.s;
    }

    public int compareTo(Time t) {
        if (toSecond(h, m, s) > toSecond(t.h, t.m, t.s)) {
            return 1;
        } else if (toSecond(h, m, s) < toSecond(t.h, t.m, t.s)) {
            return -1;
        } else {
            return 0;
        }
    }

}