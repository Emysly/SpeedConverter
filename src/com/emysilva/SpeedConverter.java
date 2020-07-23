package com.emysilva;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(-2000));
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long milePerHour = Math.round(kilometersPerHour * 0.6213711922);
            return milePerHour;
        }
    }
}
