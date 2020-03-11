package com.company;


import com.company.consola.Consola;
import com.company.pelicula.Ejemplar;

import java.util.ArrayList;

public class Videoclub {

  private ArrayList<Alquilable> listaDeAlquilables;

  public Videoclub() {
    this.listaDeAlquilables = new ArrayList<Alquilable>();
  }

  public void alquilarPelicula(Ejemplar unEjemplar){
    //todo
  }

  public void devolverPelicula(Ejemplar unEjemplar){
    //todo
  }

  public void alquilarConsola(Consola unaConsola){
    //todo
  }

  public void devolverConsola(Consola unaConsola){
    //todo
  }

  public boolean alquilado(Alquilable unAlquilable){
    return true;
    //todo
  }

  public ArrayList<Alquilable> getListaDeAlquilables() {
    return listaDeAlquilables;
  }
}
