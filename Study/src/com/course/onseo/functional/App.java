package com.course.onseo.functional;

import com.course.onseo.animals.Animal;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Action act1 = str -> {
            System.out.println(str);
            return 0;
        };
        act1.func("csdsc");

        Action act2 = sss -> {return -1;};

        Set<String> set = new HashSet<>(names);
        //set.forEach(System.out::println);
        set.forEach(str -> { if (str.contains("M"))
            System.out.println(str);
        });

        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            humans.add(new Human(getName(),(int)(Math.random()*10)));
        }

//        humans.forEach(human -> {
//            human.setName(Math.random()*10+"");
//            human.setAge((int)(Math.random()*10));
//        });

        Comparator<Human> comparator = (o1, o2) -> {
            int n = o1.getName().compareTo(o2.getName());
            if (n ==0) return o1.getAge().compareTo(o2.getAge());
            return n;
        };


        humans.sort(comparator);

        humans.forEach(human -> {
            System.out.println(human.getName()+" "+human.getAge());
        });

    }




        private static List<String> names = Arrays.asList("Ivan","Fedor","Katerina","Maria","Artem");
        public static String getName() {
            return names.get((int)(Math.random()* names.size()));
        }


    
}
