package hogwarts;

import hogwarts.Hogwarts;

public class Kogtevran extends Hogwarts {
    protected int intelligence;
    protected int wisdom;
    protected int wit;
    protected int creativity;

    public Kogtevran(String name, String fakultet, int powerMagic, int trangressesDistance,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(name, fakultet, powerMagic, trangressesDistance);

        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;

    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }


    @Override
    public String toString() {
        return super.toString() +
                "ум " + intelligence + '\n' +
                "мудрость " + wisdom + '\n' +
                "остроумность " + wit + '\n' +
                "творчество " + creativity;
    }

    public void printInfo() {
        System.out.println(this);
    }

    int sum() {
        return intelligence + wisdom + wit + creativity;
    }


    public void compKogterUchenic(Kogtevran mag) {
        if (sum() > mag.sum()) {
            System.out.println(getName() + "  лучший студент факультета Когтевран чем " + mag.getName());
        } else if (sum() < mag.sum()) {
            System.out.println(getName() + "  лучший студент факультета Когтевран чем " + mag.getName());
        } else {
            System.out.println(getName() + " одинаков c " + mag.getName());
        }
    }
}
