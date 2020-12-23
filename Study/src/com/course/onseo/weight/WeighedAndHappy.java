package com.course.onseo.weight;

import com.course.onseo.user.User;

import java.util.Arrays;

public class WeighedAndHappy {
    private Participant[] part;

    public void createParticipants(int count) {
        part = new Participant[count];
    }

    public void initParticipants() {
        for (int i = 0; i < part.length; i++) {
            part[i] = new Participant(new String(97 + i + ""), (int) (Math.random() * 15));
        }
    }

    public void showParticipants() {
        for (int i = 0; i < part.length; i++) {
            System.out.println(part[i].getWeight());
        }
    }

    public void SortParticipants() {
        Arrays.sort(part);
        System.out.println("sorted");
    }


    public void divideParticipants() {
        Participant[] part1 = new Participant[part.length];
        Participant[] part2 = new Participant[part.length];
        int weightCount1 = 0;
        int weightCount2 = 0;
        int index1 = 0;
        int index2 = 0;

        for (int i = part.length-1; i >= 0; i--) {
            if (weightCount2 > weightCount1) {
                part1[index1] = part[i];
                weightCount1 += part1[index1].getWeight();
                index1++;
            } else {
                part2[index2] = part[i];
                weightCount2 += part2[index2].getWeight();
                index2++;
            }
        }
        System.out.println("part1 total weight: " + weightCount1);
        for (int i = 0; i < index1; i++) {
            System.out.println(part1[i].getWeight());
        }
        System.out.println("part2 total weight: " + weightCount2);
        for (int i = 0; i < index2; i++) {
            System.out.println(part2[i].getWeight());
        }

    }
}
