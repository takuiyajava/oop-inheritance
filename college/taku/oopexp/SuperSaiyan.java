package college.taku.oopexp;

public class SuperSaiyan extends Saiyan {

    private String prefix;

    // update name
    public SuperSaiyan(String name) {

        // Call the superclass constructor to set the name
        super(name);

        // Inherit name from the superclass.¥
        setPrefix(super.getName());
    }

    // No args
    public SuperSaiyan() {
        setPrefix(super.getName());
    }


    private String getPrefix() {
        return this.prefix;
    }


    // Perspective: Super [Goku]
    private void setPrefix(String name) {

        this.prefix = "Super";

        // If return type is String use this
//        activeSuper = "I am " + this.prefix + " " + name;
//        return activeSuper;
        System.out.println("I am " + this.prefix + " " + name);
    }

    private String setDefaultPrefix() {
        this.prefix = "Super";
        return this.prefix;
    }

    public String modeSaiyan() {
        return  setDefaultPrefix() + " " + super.getName();
    }

}


class Test02 {

    public static void main(String[] args) {

        // Create Saiyan
        Saiyan goku = new Saiyan("Goku");
        String mainSaiyan = goku.getName();

        // Saiyan evolve to super saiyan by apssing SuperSaiyan class
        SuperSaiyan superGoku = new SuperSaiyan(mainSaiyan);


        // Update to supersaiyan from saiyan
        mainSaiyan = superGoku.getName();

        // Access only instance
        String superSaiyanMode = superGoku.modeSaiyan();

        System.out.println("I am changing mode " + superSaiyanMode);

    }

}