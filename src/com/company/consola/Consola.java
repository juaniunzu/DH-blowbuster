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
    //todo
  }

  @Override
  public void devolver(Integer codigo) {
    //todo
  }

  @Override
  public Boolean alquilado() {
    return null;
    //todo
  }

  public String getNombre() {
    return nombre;
  }

  public Integer getCodigo() {
    return codigo;
  }

}
