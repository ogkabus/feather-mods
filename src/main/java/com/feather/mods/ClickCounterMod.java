package com.feather.mods;

import java.util.Scanner;

public class ClickCounterMod {
    private int clickCount;

    public ClickCounterMod() {
        clickCount = 0;
    }

    public void click() {
        clickCount++;
        displayCount();
    }

    public void displayCount() {
        System.out.println("Total Clicks: " + clickCount);
    }

    public static void main(String[] args) {
        ClickCounterMod counter = new ClickCounterMod();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Press Enter to click, type 'exit' to quit.");
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            counter.click();
        }
        scanner.close();
    }
}