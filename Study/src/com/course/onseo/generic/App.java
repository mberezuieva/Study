package com.course.onseo.generic;

import com.course.onseo.animals.Animal;
import com.course.onseo.animals.Cat;
import com.course.onseo.animals.Dog;
import com.course.onseo.user.User;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Container<Integer> a = new Container<Integer>();
        a.addOneElement(5);
        a.addOneElement(10);
        a.addAllElements(new Integer[]{3, 11});
        a.clearAll();
        System.out.println(a.isEmpty());
        System.out.println(a.getLength());


//        int[] b = {1,2,3,4,5};
//        System.out.println(Temp(b));
//
//        Double[] c = {1.0, 2.0, 3.0};
//        System.out.println(Temp(c));
//
//        String[] d = {"aaa", "bbb", "ccc"};
//        System.out.println(Temp(d));
//
//
//    //    a.setObj(new String("bla-bla"));
//     //   System.out.println(a.getObj());
//
//     //   a.setObj(new User("ededed",21,true));
//
//
//     //   Container<User> d = new Container<>();
//     //   d.setObj(new User("ededed",21,true));
//
//    //    public static void www (Container <Human> obj) {
//     //       obj.getObj().move();
//
//
//        }
//
//        Container<Animal> s = new Container<>();
//     //   s.setObj(new Cat());
//     //   s.s
//
//        Container<? super Animal> r = new Container<>();
//     //   r.setObj(new Cat());
//     //   r.setObj(new Dog());
//
//    public static int Temp(int[] a){
//        Random rnd = new Random();
//        return a[rnd.nextInt(a.length)];
//    }
//
//    public static <Eeee> Eeee Temp (Eeee[] a) {
//        Random rnd = new Random();
//        return a[rnd.nextInt(a.length)];
//    }
    }
}



