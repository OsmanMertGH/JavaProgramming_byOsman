package day32_Constructor;

import java.lang.reflect.Constructor;

public class ConstructorsRule {

    public ConstructorsRule() {
        System.out.println("Defult Constructor");
    }

    public ConstructorsRule(int a) {
        this();
        System.out.println("Constructor with int argument");
    }
}
