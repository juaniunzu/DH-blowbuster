package com.company;

import com.company.consola.Ps4;
import com.company.consola.Xbox;
import com.company.pelicula.*;

public class Main {

    public static void main(String[] args) {

        Videoclub blockBusted = new Videoclub();

        Pelicula memento = new Pelicula("mmm", "Memento", 2000);
        Pelicula inception = new Pelicula("iii", "Inception", 2010);
        Pelicula pi = new Pelicula("ppp", "Pi, fe en el caos", 1998);

        Dvd mementoDvd = new Dvd(100001, memento, "Latinoamerica");
        memento.agregarEjemplares(mementoDvd);

        Bluray mementoBluray = new Bluray(100002, memento);
        memento.agregarEjemplares(mementoBluray);

        Dvd inceptionDvd = new Dvd(200001, inception, "Latinoamerica");
        inception.agregarEjemplares(inceptionDvd);

        Bluray inceptionBluray = new Bluray(200002, inception);
        inception.agregarEjemplares(inceptionBluray);

        Dvd piDvd = new Dvd(300001, pi, "Mundial");
        pi.agregarEjemplares(piDvd);

        Vhs piVhs = new Vhs(300030, pi, "01012000");
        pi.agregarEjemplares(piVhs);

        blockBusted.agregarEjemplar(mementoDvd);
        blockBusted.agregarEjemplar(mementoBluray);
        blockBusted.agregarEjemplar(inceptionBluray);
        blockBusted.agregarEjemplar(inceptionDvd);
        blockBusted.agregarEjemplar(piDvd);
        blockBusted.agregarEjemplar(piVhs);


        Ps4 psAAAA = new Ps4("psAAAA", 8000001);
        Ps4 psAAAB = new Ps4("psAAAB", 8000002);
        Ps4 psAAAC = new Ps4("psAAAC", 8000003);
        Xbox xboxAAAA = new Xbox("xboxAAAA", 9000001);
        Xbox xboxAAAB = new Xbox("xboxAAAB", 9000002);
        Xbox xboxAAAC = new Xbox("xboxAAAC", 9000003);

        blockBusted.agregarConsola(psAAAA);
        blockBusted.agregarConsola(psAAAB);
        blockBusted.agregarConsola(psAAAC);
        blockBusted.agregarConsola(xboxAAAA);
        blockBusted.agregarConsola(xboxAAAB);
        blockBusted.agregarConsola(xboxAAAC);



        blockBusted.alquilarConsola(8000001);
        blockBusted.consultarDisponibilidad(8000001);
        blockBusted.devolverConsola(8000001);
        blockBusted.consultarDisponibilidad(8000001);

        blockBusted.alquilarPelicula(100001);
        blockBusted.consultarDisponibilidad(100001);
        blockBusted.consultarDisponibilidad(200001);


    }
}
