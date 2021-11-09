/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class DLDqueue implements Dqueue {

    DNode head, tail;
    int size;

    public DLDqueue() {
        head = new DNode();
        tail = new DNode();
        head.setNext(tail);
        tail.setPrev(head);
        size = 0;
    }

//insertar primero
    public void insertFirst(Object obj) {
        DNode h = head;
        DNode node = new DNode();
        node.setVal(obj);
        node.setNext(h);
        h.setPrev(node);
        head = node;
        if (size == 0) {
            tail = node;
        }
        size++;

    }

//insetar de ultimo 
    public void insertLast(Object obj) {
        DNode t = tail;
        DNode node = new DNode();
        node.setVal(obj);
        node.setPrev(t);
        t.setNext(node);
        tail = node;
        if (size == 0) {
            head = node;
        }
        size++;
    }

//quitar primero
    public Object removeFirst() {
        if (head == null) {
            return null;
        }
        Object val = head.getVal();
        head = head.getNext();
        size--;
        return val;
    }

//quitar el ultimo
    public Object removeLast() {
        if (tail == null) {
            return null;
        }
        Object val = tail.getVal();
        tail = tail.getPrev();
        size--;
        return val;
    }

//obtener el tamaño
    public int size() {
        return size;
    }

//obtener los datos
    public String toString() {
        String s = "head [";
        DNode aux = head;
        for (int i = 0; i < size; i++) {
            s += aux.getVal();
            if (aux == tail) {
                break;
            }
            s += "-";
            aux = aux.getNext();
        }
        return s + "] tail";
    }

}
