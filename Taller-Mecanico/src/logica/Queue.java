package logica;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> cola;
    
    public Queue() {
        cola = new LinkedList<> ();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }
    
    public void enqueue(T data) {
        cola.addLast(data);
    }  
    
    public T dequeue() {
        return cola.removeFirst();
    }  
    
    public T peek() {
        return cola.getFirst();
    }          
}
