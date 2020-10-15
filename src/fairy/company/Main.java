package fairy.company;

public class Main {

    public static void main(String[] args) {
        Fairy dindin = new Fairy("Динь - динь", 4);
        System.out.println(dindin.getName() + "\n" + dindin.getNumber_wings());
        dindin.magic("природы", "Oчень сильная");

    }
}
