package com.javarush.task.task34.task3414;

import java.io.*;
import java.util.*;

public class AmigoSet<E> extends AbstractSet implements Serializable, Cloneable, Set {

    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        int size = (int) Math.ceil(Math.max(16, (collection.size()/.75f)));
        this.map = new HashMap<>(size);
        for (E e : collection) {
            this.map.put(e, PRESENT);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    @Override
    public Iterator<E> iterator() {
        return this.map.keySet().iterator();
    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public boolean add(Object o) {
        return map.put((E)o, PRESENT) == null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.map.containsKey(o);
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public boolean remove(Object o) {
        this.map.remove(o);
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            AmigoSet copy = (AmigoSet)super.clone();
            copy.map = (HashMap) map.clone();
            return copy;
        } catch (Exception e) {
            throw new InternalError(e);
        }
    }
}
