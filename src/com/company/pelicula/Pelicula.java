package com.company.pelicula;

import com.company.pelicula.Ejemplar;

import java.util.*;

public class Pelicula {

  private String codigoImdb;
  private String titulo;
  private Integer año;
  private ArrayList<String> idiomaSubs;
  private ArrayList<Ejemplar> ejemplares;

  public Pelicula(String codigoImdb, String titulo, Integer año) {
    this.codigoImdb = codigoImdb;
    this.titulo = titulo;
    this.año = año;
    this.idiomaSubs = new ArrayList<String>();
    this.ejemplares = new ArrayList<Ejemplar>();
  }

  public void agregarIdiomas(String idioma){
    idiomaSubs.add(idioma);
  }

  public void agregarEjemplares(Ejemplar unEjemplar){
    ejemplares.add(unEjemplar);
  }

  public String getCodigoImdb() {
    return codigoImdb;
  }

  public String getTitulo() {
    return titulo;
  }

  public Integer getAño() {
    return año;
  }

  public List<String> getIdiomaSubs() {
    return idiomaSubs;
  }

  public List<Ejemplar> getEjemplares() {
    return ejemplares;
  }
}
