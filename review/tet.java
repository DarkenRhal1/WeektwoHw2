package review;

public class tet {
    public static void main(String[] args) {
        //primitive variable
        int price; //initialized it
        price = 45; //declared a variable

        //reference variables
        String list = "Klaus";

        //reference variables
        Dog corgi = new Dog(15, "corgi");
       // System.out.println(corgi.getAge());
        Dog poodle = new Dog(5);
        Dog boxer = new Dog (7, "Boxer");

      /*  Dog[] pets = new Dog[3];
        pets[0] = poodle;
        pets[1] = corgi;
        pets[2] = boxer;
        */
        corgi.setAge(-5);
        int dogsAge = corgi.getAge();
        //System.out.println(dogsAge);
        //An array literal
        Dog[] pets = { corgi, poodle, boxer};
       // System.out.println(pets.length);
       for(int x =0; x < pets.length; x= x+1){
           System.out.println(pets[x].getAge());
       }

       //pets[1];

    }
}
