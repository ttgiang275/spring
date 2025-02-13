package com.river.helper;

public class ClassPathXmlHelper {
    public static void demo() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
//        Alien alien = context.getBean("alien", Alien.class);
//        Alien alien2 = context.getBean("alien", Alien.class);

        /*If change value of object1 will be change object2 as well. Because they use the same object.
          But if we change scope of bean to prototype when use context.getBean will create new object.
          And scope is prototype when load application, Spring will not auto create new object.
         */
//        alien.setAge(10);
//        System.out.println(alien2.getAge());

//        System.out.println("--------------------------------------------------------------------");
//        alien.code();
//        alien.transport();


//        Transport car = context.getBean(Car.class);
//        car.drive();

//        alien.write();
    }
}
