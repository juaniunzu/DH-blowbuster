package com.company.pelicula;

public class Dvd extends Ejemplar {

  private String zonaReproduccion;

  public Dvd(Integer codigo, Pelicula pelicula, String zonaReproduccion) {
    super(codigo, pelicula);
    this.zonaReproduccion = zonaReproduccion;
  }

  public String getZonaReproduccion() {
    return zonaReproduccion;
  }

}
