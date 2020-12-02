package fairy.company;

public class Home extends Fairies{
    public Home (String name, int number_home){
        this.setNameHouse(name);
        System.out.println("У вас деревенька с " + number_home + " домами. Там живёт " + this.number_fayries + " фей.");
    }
}
