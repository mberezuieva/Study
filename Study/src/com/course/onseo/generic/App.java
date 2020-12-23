package com.course.onseo.generic;

import com.course.onseo.animals.Animal;
import com.course.onseo.animals.Cat;
import com.course.onseo.animals.Dog;
import com.course.onseo.user.User;

public class App {
    public static void main(String[] args) {
        Container a = new Container();
    //    a.setObj(new String("bla-bla"));
        System.out.println(a.getObj());

     //   a.setObj(new User("ededed",21,true));


     //   Container<User> d = new Container<>();
     //   d.setObj(new User("ededed",21,true));

    //    public static void www (Container <Human> obj) {
     //       obj.getObj().move();


        }

        Container<Animal> s = new Container<>();
     //   s.setObj(new Cat());
     //   s.s

        Container<? super Animal> r = new Container<>();
     //   r.setObj(new Cat());
     //   r.setObj(new Dog());
    }

