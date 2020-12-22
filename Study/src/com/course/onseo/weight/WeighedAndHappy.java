package com.course.onseo.weight;

import com.course.onseo.user.User;

public class WeighedAndHappy {
    private Participant[] part;

    public void createParticipants (int count) {
        part = new Participant[count];
    }

    public void initParticipants() {
        for (int i = 0; i < part.length; i++) {
                part[i] = new Participant(new String(97+i+""),(int)(Math.random()*15));
            }
    }

     public void showParticipants() {
        for (int i = 0; i < part.length; i++) {
            System.out.println(part[i].toString());
        }
    }

    public void divideParticipants() {
        Participant[] part1 = new Participant[part.length/2+1];
        Participant[] part2 = new Participant[part.length/2+1];
        int weightCount1 = 0;
        int weightCount2 = 0;
        for (int i = 0; i < part.length; i++) {
            for (int j = 0; i < part1.length; j++) {
                if (weightCount2 > weightCount1) part1[j] = part[i];
                else part2[j] = part[i];
            }

        }

    }
}
