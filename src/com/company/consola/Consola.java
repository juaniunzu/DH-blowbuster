package com.company.consola;

import com.company.Alquilable;

public abstract class Consola implements Alquilable {

  private String nombre;
  private Integer codigo;
  private Boolean alquilado;

  public Consola(String nombre, Integer codigo) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.alquilado = false;
  }

  @Override
  public void alquilar() {
    this.alquilado = true;
    System.out.println("Se está alquilando la consola " + this.nombre);
  }

  @Override
  public void devolver() {
    this.alquilado = false;
    System.out.println("Se esta devolviendo la consola "+ this.nombre);
  }

  @Override
  public Boolean alquilado() {
    if(this.alquilado){
      System.out.println("La consola está alquilada");
    } else {
      System.out.println("La consola está disponible para alquilar");
    }
    return this.alquilado;

  }

  public String getNombre() {
    return nombre;
  }

  public Integer getCodigo() {
    return codigo;
  }

}
