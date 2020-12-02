package fairy.company;

public class Fairy extends Fairies {
    public Fairy(String name, int number_wings){
        this.number_fayries++;
        this.setName(name);
        this.setNumber_wings(number_wings);
    }
    public void magic(String magic, String moch){
        System.out.println(moch + " " + "фея" + " " + magic);
    }
}
