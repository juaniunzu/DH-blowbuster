package com.company;

public class Dvd extends Ejemplar {

  private String zonaReproduccion;

  public Dvd(Integer codigo, Pelicula pelicula, Boolean alquilado, String zonaReproduccion) {
    super(codigo, pelicula, alquilado);
    this.zonaReproduccion = zonaReproduccion;
  }

  public String getZonaReproduccion() {
    return zonaReproduccion;
  }

}
