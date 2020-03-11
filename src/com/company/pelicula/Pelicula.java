package com.company.pelicula;

import com.company.pelicula.Ejemplar;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pelicula {

  private String codigoImdb;
  private String titulo;
  private Integer año;
  private List<String> idiomaSubs;
  private List<Ejemplar> ejemplares;

  public Pelicula(String codigoImdb, String titulo, Integer año) {
    this.codigoImdb = codigoImdb;
    this.titulo = titulo;
    this.año = año;
    this.idiomaSubs = new List() {
      @Override
      public int size() {
        return 0;
      }

      @Override
      public boolean isEmpty() {
        return false;
      }

      @Override
      public boolean contains(Object o) {
        return false;
      }

      @Override
      public Iterator iterator() {
        return null;
      }

      @Override
      public Object[] toArray() {
        return new Object[0];
      }

      @Override
      public Object[] toArray(Object[] objects) {
        return new Object[0];
      }

      @Override
      public boolean add(Object o) {
        return false;
      }

      @Override
      public boolean remove(Object o) {
        return false;
      }

      @Override
      public boolean containsAll(Collection collection) {
        return false;
      }

      @Override
      public boolean addAll(Collection collection) {
        return false;
      }

      @Override
      public boolean addAll(int i, Collection collection) {
        return false;
      }

      @Override
      public boolean removeAll(Collection collection) {
        return false;
      }

      @Override
      public boolean retainAll(Collection collection) {
        return false;
      }

      @Override
      public void clear() {

      }

      @Override
      public Object get(int i) {
        return null;
      }

      @Override
      public Object set(int i, Object o) {
        return null;
      }

      @Override
      public void add(int i, Object o) {

      }

      @Override
      public Object remove(int i) {
        return null;
      }

      @Override
      public int indexOf(Object o) {
        return 0;
      }

      @Override
      public int lastIndexOf(Object o) {
        return 0;
      }

      @Override
      public ListIterator listIterator() {
        return null;
      }

      @Override
      public ListIterator listIterator(int i) {
        return null;
      }

      @Override
      public List subList(int i, int i1) {
        return null;
      }
    };
    this.ejemplares = new List<Ejemplar>() {
      @Override
      public int size() {
        return 0;
      }

      @Override
      public boolean isEmpty() {
        return false;
      }

      @Override
      public boolean contains(Object o) {
        return false;
      }

      @Override
      public Iterator<Ejemplar> iterator() {
        return null;
      }

      @Override
      public Object[] toArray() {
        return new Object[0];
      }

      @Override
      public <T> T[] toArray(T[] ts) {
        return null;
      }

      @Override
      public boolean add(Ejemplar ejemplar) {
        return false;
      }

      @Override
      public boolean remove(Object o) {
        return false;
      }

      @Override
      public boolean containsAll(Collection<?> collection) {
        return false;
      }

      @Override
      public boolean addAll(Collection<? extends Ejemplar> collection) {
        return false;
      }

      @Override
      public boolean addAll(int i, Collection<? extends Ejemplar> collection) {
        return false;
      }

      @Override
      public boolean removeAll(Collection<?> collection) {
        return false;
      }

      @Override
      public boolean retainAll(Collection<?> collection) {
        return false;
      }

      @Override
      public void clear() {

      }

      @Override
      public Ejemplar get(int i) {
        return null;
      }

      @Override
      public Ejemplar set(int i, Ejemplar ejemplar) {
        return null;
      }

      @Override
      public void add(int i, Ejemplar ejemplar) {

      }

      @Override
      public Ejemplar remove(int i) {
        return null;
      }

      @Override
      public int indexOf(Object o) {
        return 0;
      }

      @Override
      public int lastIndexOf(Object o) {
        return 0;
      }

      @Override
      public ListIterator<Ejemplar> listIterator() {
        return null;
      }

      @Override
      public ListIterator<Ejemplar> listIterator(int i) {
        return null;
      }

      @Override
      public List<Ejemplar> subList(int i, int i1) {
        return null;
      }
    };
  }

  public void agregarIdiomas(String idioma){
    //todo
  }

  public void agregarEjemplares(Ejemplar unEjemplar){
    //todo
  }

}
