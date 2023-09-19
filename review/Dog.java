package review;

public class Dog {
    //instance variables
    private int age;
    public String breed;
    public Dog(int dogAge, String breed) {
        this.age = dogAge;
        this.breed = breed;
    }

    //default constructor
    public Dog(int dogAge) {
        this.age = dogAge;
    }

    public void setAge(int dogAge) {
       // this.age = dogAge;
        if (dogAge < 0) {
            System.out.println("Not possible");
        } else {
            this.age = dogAge;
        }
    }

    public int getAge() {
        return age;
    }


    public void eat() {
        System.out.println("Dogs eat bones");
    }
}
