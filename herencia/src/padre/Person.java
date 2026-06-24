package padre;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Random random;


    public Person(){
        System.out.println("Constructor Person");
    }

    public Person(String name, int age) {
        try {
            if (name== null) {
                this.name = "Generic Person";
                throw new IllegalArgumentException("Blank name not allowed, you will be a Generic Person");
            }else{
                this.name = name;
            }
            if (age <=0) {
                this.age = random.nextInt();
                throw new IllegalArgumentException("No age, dont worry, ill give you one");
            }else{
                this.age = age;
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error handled by constructor: "+e.getMessage());
        }
        
        
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void showInformation(){
        System.out.println("Name: %s\tAge: %d".formatted(name,age));
    }

    
}
