package com.company.pelicula;

import com.company.Alquilable;

public abstract class Ejemplar implements Alquilable {

  private Integer codigo;
  private Pelicula pelicula;
  private Boolean alquilado;

  public Ejemplar(Integer codigo, Pelicula pelicula) {
    this.codigo = codigo;
    this.pelicula = pelicula;
    this.alquilado = false;
  }

  public void alquilar(){
    this.alquilado = true;
    System.out.println("Se está alquilando la película " + this.pelicula.getTitulo());
  }

  public void devolver(){
    this.alquilado = false;
    System.out.println("Se devuelve la película " + this.pelicula.getTitulo());
  }

  public Boolean alquilado(){
    if(this.alquilado){
      System.out.println("La película " + this.pelicula.getTitulo() + " está alquilada");
    } else {
      System.out.println("La película " + this.pelicula.getTitulo() + " está disponible para alquilar");
    }
    return this.alquilado;
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
