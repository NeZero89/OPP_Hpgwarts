package hogwarts;

//abstract
abstract class Hogwarts {
    protected final String name;
    protected final String fakultet;
    protected int powerMagic;
    protected int trangressesDistance;

    public Hogwarts(String name, String fakultet, int powerMagic, int trangressesDistance) {
        this.name = name;
        this.fakultet = fakultet;
        this.powerMagic = powerMagic;
        this.trangressesDistance = trangressesDistance;
    }

    ;

    public String getName() {
        return name;
    }

    public String getFakultet() {
        return fakultet;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTrangressesDistance() {
        return trangressesDistance;
    }

    @Override
    public String toString() {
        return
                "Имя " + name + '\n' +
                        "Факультет " + fakultet + '\n' +
                        "Сила магии " + powerMagic + '\n' +
                        "Дистанция трансгрессии " + trangressesDistance + '\n';
    }

    public void printInfo() {
        System.out.println(this);
    }

    abstract int  sum();

     public void compUchenic(Hogwarts uchenic) {
        System.out.println(getName());
        if (getPowerMagic()>uchenic.getPowerMagic() ){
            System.out.println("  Обладает большей силой магии ");
        }
        else if (getPowerMagic()<uchenic.getPowerMagic()){
            System.out.println(" Обладает меньшей силой магии ");
        }
        else{
            System.out.println(" Сила магии студентов одинакова ");
        }
        if (getTrangressesDistance()>uchenic.getTrangressesDistance()){
            System.out.println(" и большим растоянием трансгресии, чем ");

        }else if (getTrangressesDistance()<uchenic.getTrangressesDistance()){
            System.out.println(" и меньшим расстоянием трансгрессии, чем ");
        }else {
            System.out.println(" и таким же расстоянием трансгресии, как и ");
        }
         System.out.println(uchenic.getName());
    }
}
