package test;

import test.Car;

/**
 * Created by Maksym_Hromyk on 18.07.2017.
 */
public class Person {

    private String name;
    private Car car;

    public Person(String name){
        this.name = name;
        car = new Car("Volvo", "1234");
    }

    @Override
    public String toString() {
        return "Hi, I am "+name+" and my car is "+car.getModel()+" and it's plate is: "+car.getPlate();
    }
}
