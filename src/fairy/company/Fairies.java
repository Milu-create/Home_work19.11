package fairy.company;

public class Fairies {
    private String name, name_house;
    private int number_wings;
    protected int number_fayries = 0;

    public int getNumber_wings() {
        return number_wings;
    }

    protected void setNumber_wings(int number_wings) {
        this.number_wings = number_wings;
    }

    protected void setNumber_wings(int number_wings, char name) {
        this.number_wings = number_wings + 10;
        this.name = name + this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setNameHouse(String name) {
        this.name_house = name;
    }

    public String getName(){
        return name;
    }
}
