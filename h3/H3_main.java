package h3;

public class H3_main {

    public static void main(String[] args) {
        Mensch person = new Mensch();
        
        person.setName("Julius");
        person.setGebJahr(2005);

        person.setAlter();

        System.out.println("Name: " + person.getName());
        System.out.println("Geburtsjahr: " + person.getGebJahr());
        System.out.println("Alter (in 2025): " + person.getAlter());
    }
}