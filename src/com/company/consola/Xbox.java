package com.company.consola;

public class Xbox extends Consola {

  public Xbox(String nombre, Integer codigo) {
    super(nombre, codigo);
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
    return super.alquilado();
    //todo
  }
}
