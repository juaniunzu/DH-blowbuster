package com.company;

import com.company.consola.Consola;
import com.company.pelicula.Ejemplar;
import com.sun.tools.javac.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Videoclub {

  private HashMap<Integer, Alquilable> listaDeAlquilables;

  public Videoclub() {
    this.listaDeAlquilables = new HashMap();
  }

  public void agregarEjemplar(Ejemplar unEjemplar){
    listaDeAlquilables.put(unEjemplar.getCodigo(), unEjemplar);
  }

  public void agregarConsola(Consola unaConsola){
    listaDeAlquilables.put(unaConsola.getCodigo(), unaConsola);
  }

  public void alquilarPelicula(Integer codigo){
    listaDeAlquilables.get(codigo).alquilar();
  }

  public void devolverPelicula(Integer codigo){
    listaDeAlquilables.get(codigo).devolver();
  }

  public boolean consultarDisponibilidad(Integer codigo){
    return listaDeAlquilables.get(codigo).alquilado();
  }

  public void alquilarConsola(Integer codigo){
    listaDeAlquilables.get(codigo).alquilar();
  }

  public void devolverConsola(Integer codigo){
    listaDeAlquilables.get(codigo).devolver();
  }

  public boolean alquilado(Integer codigo){
    return listaDeAlquilables.get(codigo).alquilado();
  }

  public HashMap<Integer, Alquilable> getListaDeAlquilables() {
    return listaDeAlquilables;
  }
}
