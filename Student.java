package qlsinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Windows 7 on 11/2/2016.
 */
public class Student {
    private String Name;
    private  int Age;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + Name+ '\'' +
                ", age=" + Age +
                '}';
    }


}
