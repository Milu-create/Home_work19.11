package fairy.company;

public class Fairies {
    private String name;
    private int number_wings;

    public int getNumber_wings() {
        return number_wings;
    }

    protected void setNumber_wings(int number_wings) {
        this.number_wings = number_wings;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
