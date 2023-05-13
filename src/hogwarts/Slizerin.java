package hogwarts;

import hogwarts.Hogwarts;

public class Slizerin extends Hogwarts {
    protected int cunning;
    protected int susceptibility;
    protected int impregnability;
    protected int resourcefulness;
    protected int lustForPower;

    public Slizerin(String name, String fakultet, int powerMagic, int trangressesDistance,
                    int cunning, int susceptibility, int impregnability, int resourcefulness, int lustForPower) {
        super(name, fakultet, powerMagic, trangressesDistance);

        this.cunning = cunning;
        this.susceptibility = susceptibility;
        this.impregnability = impregnability;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }

    public int getCunning() {
        return cunning;
    }

    public int getSusceptibility() {
        return susceptibility;
    }

    public int getImpregnability() {
        return impregnability;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

//    public int sum() {
//        int result = (this.cunning + this.lustForPower + this.impregnability + this.susceptibility + this.resourcefulness);
//        return result;
//    }
//
//    public void compare(Slizerin otherStudents) {
//        int result = (otherStudents.powerMagic + trangressesDistance + cunning + susceptibility +
//                impregnability + resourcefulness + lustForPower);}


    @Override
    public String toString() {
        return super.toString() +
                "хитрость " + cunning + '\n' +
                "решительность " + susceptibility + '\n' +
                "амбициозность " + impregnability + '\n' +
                "находчивость " + resourcefulness + '\n' +
                "жажда власти " + lustForPower;
    }

    public void printInfo() {
        System.out.println(this);
    }

    int sum() {
        return cunning + susceptibility + impregnability + resourcefulness + lustForPower;
    }


    public void compSlizerUchenic(Slizerin mag) {
        if (sum() > mag.sum()) {
            System.out.println(getName() + "  лучший студент факультета Слизерин чем " + mag.getName());
        } else if (sum() < mag.sum()) {
            System.out.println(getName() + "  лучший студент факультета Слизерин чем " + mag.getName());
        } else {
            System.out.println(getName() + " одинаков c " + mag.getName());
            }


    }
}
