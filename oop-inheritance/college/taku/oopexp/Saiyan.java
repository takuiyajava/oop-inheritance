package college.taku.oopexp;

public class Saiyan {

    private String name;

    public Saiyan() {}

    public Saiyan(String name) {
        this.name = name;
        System.out.println(getName());
    }


    // getter
    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = getName();
    }
}


class Test {
    public static void main(String[] args) {
        Saiyan goku = new Saiyan("Goku");
    }
}
