package edu.jperaza.musicplatform.repository;

import java.util.Collection;

public interface ICrudRepository <T>{
    void add(T item);
    void remove(int id);
    Collection<T> getAll();
    T findById(int id);
}