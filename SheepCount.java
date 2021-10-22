package com.company;

public class SheepCount {

    public static void main(String[] args) {
        int counter = count("sheep", args);
        int wolfcounter = count("wolf", args);

        System.out.println("Total number of sheep: " + counter);
        System.out.println("Total number of wolf: " + wolfcounter);


    }

    public static int count(String target, String[] strings) {
        int count = 0;
        for (String element : strings) {
            if (target.equals(element)) {
                count += 1;
            }
        }

        return count;
    }

}
