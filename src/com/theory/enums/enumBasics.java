package com.theory.enums;

public class enumBasics {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // these are enum constants
        // public, static and final
        // since these are final you can create child enums
        // type is Week
    }

    public static void main(String[] args) {
        Week anyDay = Week.Thursday;
        System.out.println(anyDay);
        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }
}
