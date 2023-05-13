package hogwarts;

import hogwarts.Hogwarts;

public class Puffendui extends Hogwarts {
    protected int diligence;
    protected int honor;
    protected int loyalty;

    public Puffendui(String name, String fakultet, int powerMagic, int trangressesDistance, int diligence, int loyalty, int honor) {
        super(name, fakultet, powerMagic, trangressesDistance);

        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getHonor() {
        return honor;
    }

    public int getLoyalty() {
        return loyalty;
    }

    @Override
    public String toString() {
        return super.toString() + "Трудолюбие " + diligence + '\n' + "Верность " + loyalty + '\n' + "Честность " + honor + '\n';
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    int sum() {
        return diligence + loyalty + honor;
    }


    public void compPuffUchenic(Puffendui mag) {
        if (sum() > mag.sum()) {
            System.out.println(getName() + "  лучший студент факультета Пуффендуй чем " + mag.getName());
        } else if (sum() < mag.sum()) {
            System.out.println(getName() + "  лучший студент факультета Пуффендуй чем " + mag.getName());
        } else {
            System.out.println(getName() + " одинаков c " + mag.getName());
        }
    }

}




