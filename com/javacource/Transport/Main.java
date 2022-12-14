package com.javacource.Transport;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "желтого цвета", "российская",
                "легковая", 200, 1, true, "перевозить людей",
                "В443АО123", 4, "легковая", true, "перевозить людей",
                "А443ВО123", 4);
        System.out.println(lada);
        lada.getBodyType();
        lada.getEnginePower();
        lada.getSeatCount();
        lada.getBrend();
        lada.getColor();
        lada.getCountry();
        lada.toString();
        lada.getYear();
        lada.refill("бензин98");

        Train lastochka = new Train("Lastochka", "B-901", 2011, "Россия", "white",
                60, "Беларусский вокзал", "Минск-Пассажирский", 11, 301);
        System.out.println(lastochka);
        lastochka.getBrend();
        lastochka.getColor();
        lastochka.getCountry();
        lastochka.getMaxSpeed();
        lastochka.getModel();
        lastochka.getYear();
        lastochka.refill("дизель");

        Train leningrad = new Train("Leningrad","D-125",2019,"Russia","purple",
                8,"Ленинградский вокзал","Ленинград Пассажирский",8,
                270);
        System.out.println(leningrad);
        leningrad.getYear();
        leningrad.getColor();
        leningrad.getModel();
        leningrad.getMaxSpeed();
        leningrad.getCountry();
        leningrad.getBrend();
        leningrad.refill("дизель");

        Bus ikarus = new Bus("Ikarus","X-456",2003,"Blue",150,"Чехия");
        System.out.println(ikarus);
        ikarus.getColor();
        ikarus.getMaxSpeed();
        ikarus.getYear();
        ikarus.getCountry();
        ikarus.getModel();
        ikarus.getBrend();
        ikarus.refill("бензин92");

        Bus suzuki = new Bus("Suzuki","C-456",2007,"green",120,"Япония");
        System.out.println(suzuki);
        suzuki.getBrend();
        suzuki.getCountry();
        suzuki.getYear();
        suzuki.getModel();
        suzuki.getMaxSpeed();
        suzuki.getColor();
        suzuki.refill("бензин95");

        Bus volvo = new Bus("Volvo","D-675",2006,"white",150,"Германия");
        System.out.println(volvo);
        volvo.getColor();
        volvo.getMaxSpeed();
        volvo.getBrend();
        volvo.getModel();
        volvo.getYear();
        volvo.getCountry();

        volvo.refill("дизель");
    }
}


