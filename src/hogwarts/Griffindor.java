package hogwarts;

public class Griffindor extends Hogwarts {
    protected int nobility;
    protected int honor;
    protected int brave;

    public Griffindor(String name, String fakultet, int powerMagic, int trangressesDistance,
                      int nobility, int honor, int brave) {
        super(name, fakultet, powerMagic, trangressesDistance);

        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBrave() {
        return brave;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() +
                "благородство " + nobility + '\n' +
                "честь " + honor + '\n' +
                "храбрость " + brave;
    }


    int sum() {
        return brave + honor + nobility;
    }


    public void compGriffUchenic(Griffindor mag) {
        if (sum() > mag.sum()) {
            System.out.println(getName() + "  лучший студент факультета Гриффендор чем " + mag.getName());
        } else if (sum() < mag.sum()) {
            System.out.println(getName() + "  лучший студент факультета Гриффендор чем " + mag.getName());
        } else {
            System.out.println(getName() + " одинаков c " + mag.getName());
        }

    }
}
