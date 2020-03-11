package com.company.pelicula;

import com.company.Alquilable;

public abstract class Ejemplar implements Alquilable {

  private Integer codigo;
  private Pelicula pelicula;
  private Boolean alquilado;

  public Ejemplar(Integer codigo, Pelicula pelicula, Boolean alquilado) {
    this.codigo = codigo;
    this.pelicula = pelicula;
    this.alquilado = false;
  }

  public void alquilar(){
    //todo
  }

  public void devolver(Integer codigo){
    //todo
  }

  public Boolean alquilado(){
    //todo
    return true;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public Pelicula getPelicula() {
    return pelicula;
  }

  public Boolean getAlquilado() {
    return alquilado;
  }
}
