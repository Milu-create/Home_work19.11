package fairy.company;

public class SuperFairies extends Fairies{
    public SuperFairies(String name, int number_wings){
        this.number_fayries++;
        this.setName(name);
        this.setNumber_wings(number_wings, 'S');
    }
    public void magic(String magic, String moch){
        System.out.println(moch + " " + "фея" + " " + magic);
    }
    public void magic(String magic, String moch, int plus){
        System.out.println(moch + " " + "супер мощная фея" + " " + magic + " + " + plus);
    }
}