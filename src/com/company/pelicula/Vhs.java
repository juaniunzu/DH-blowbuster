package com.company.pelicula;

import com.company.pelicula.Ejemplar;
import com.company.pelicula.Pelicula;

public class Vhs extends Ejemplar {

  private String fechaFabricacion;

  public Vhs(Integer codigo, Pelicula pelicula, String fechaFabricacion) {
    super(codigo, pelicula);
    this.fechaFabricacion = fechaFabricacion;
  }

  public String getFechaFabricacion() {
    return fechaFabricacion;
  }
}
