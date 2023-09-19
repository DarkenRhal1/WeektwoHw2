package calc;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);


        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);
        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);
    }

        public static void feed(Animal animal) {
            if (animal instanceof Dog) {
                System.out.println("Here is your Dog phone");
            } else if (animal instanceof Cat) {
                System.out.println("Here is your Cat food");
            } else {
                System.out.println("Here is your food");
            }
        }


}
