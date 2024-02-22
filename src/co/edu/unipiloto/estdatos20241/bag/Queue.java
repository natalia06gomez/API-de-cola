package co.edu.unipiloto.estdatos20241.bag;

import static java.nio.file.Files.size;
import java.util.Collection;
import java.util.Iterator;


public abstract class Queue<T> extends Queue<T>{

    //Constantes
    public static final int MAX = 10;
    //Atributos
    private T[] ts;
    private int actual;

    //Constructor
    public Queue() {
        ts = (T[]) new Object[MAX];
        actual = 0;
    }
    public Queue (int tamano){
        ts = (T[]) new Object[tamano];
        actual = 0;
    }

    public void add(T t) {

        if (actual > ts.length) {
            System.out.println("La cola esta llena. El elemento no sera adicionado");
        } else {
            ts[actual] = t;
            actual++;
        }
    }
    

    public boolean isEmpty() {
        return actual == 0;
    }

    public int size() {
        return actual;
    }

    @Override
    public Iterator<T> iterator() {
      return new ArrayIterator<T> ();  
    }

        public T dequeue(int size) {
          if (isEmpty()) {
            return null;
          } else {
              int front = 0;
            T t = ts[front];
            front = (front + 1) % ts.length;
            size--;
            return t;
          }
        }

    String dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class ArrayIterator<T> implements Iterator<T> {

        //Constatne
        //public static final int MAX = 10;
        private int posicion=0;

        

        @Override
        public boolean hasNext() {
            return actual < ts.length;
        }

        @Override
        public T next() {
            if (posicion < ts.length) {
                T t = (T) ts[posicion];
                posicion++;
                return t;
            } else {
                System.out.println("No existen mas elementos");
                return null;
            }

        }

    }

}