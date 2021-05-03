package com.gy.designpatterns.iterator.withgenerics;

public interface Iterator<T> {
    public boolean hasNext();
    public T next();
}
