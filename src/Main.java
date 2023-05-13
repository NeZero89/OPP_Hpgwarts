import hogwarts.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Griffindor harru = new Griffindor("Гарри Поттер", "Гриффиндор",
                92, 95, 85, 98, 92);
        Griffindor hermiona = new Griffindor("Гермиона Грейнджер", "Гриффиндор",
                95, 99, 91, 98, 90);

        Griffindor ron = new Griffindor("Рон Уизли ", "Гриффиндор"
                , 44, 69, 95, 99, 67);


        Puffendui zaharia = new Puffendui("Захария Смит", "Пуффендуй",
                35, 60, 11, 90, 88);
        Puffendui sederik = new Puffendui("Седрик Диггори", "Пуффендуй",
                41, 71, 55, 49, 100);

        Puffendui jastin = new Puffendui("Джастин Финч-Флетчли", "Пуффендуй",
                11, 43, 98, 54, 100);


        Kogtevran chjou = new Kogtevran("Чжоу Чанг", "Когтевран",
                45, 32, 11, 98, 83, 55);

        Kogtevran padma = new Kogtevran("Падма Патил", "Когтевран",
                51, 30, 24, 75, 39, 88);

        Kogtevran markus = new Kogtevran("Маркус Белби", "Когтевран",
                65, 71, 56, 33, 98, 100);

        Slizerin darko = new Slizerin("Драко Малфой", " Слизерин",
                34, 65, 89, 69, 89, 99, 55);

        Slizerin grehem = new Slizerin("Грэхэм Монтегю", "Слизерин",
                95, 54, 23, 96, 45, 78, 95);

        Slizerin gregory = new Slizerin("Грегори Гойл", "Слизерин",
                66, 100, 65, 45, 90, 89, 93);
//        метод, который выводит на экран описание студента
        System.out.println(harru);
        System.out.println();
//        метод который сравнивает между собой двух учеников по свойствам
        harru.compUchenic(chjou);
        //        метод который сравнивает между собой двух учеников одного факультета по свойствам

        System.out.println();
        ron.compGriffUchenic(harru);
        System.out.println();
        markus.compKogterUchenic(padma);
        System.out.println();
        darko.compSlizerUchenic(gregory);
        System.out.println();
        sederik.compPuffUchenic(zaharia);

    }
}
