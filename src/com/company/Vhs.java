package com.company;

public class Vhs extends Ejemplar {

  private String fechaFabricacion;

  public Vhs(Integer codigo, Pelicula pelicula, Boolean alquilado, String fechaFabricacion) {
    super(codigo, pelicula, alquilado);
    this.fechaFabricacion = fechaFabricacion;
  }

  public String getFechaFabricacion() {
    return fechaFabricacion;
  }
}
