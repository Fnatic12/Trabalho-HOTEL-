package br.com.fei.hotel.common.utils.structure;

/**
 *
 * @author vitor
 * @param <E>
 */
public interface Structure<E> extends Iterable<E>
{
    boolean add(E element);
    E find(int index);
    E find(E element);
    boolean remove(int index);
    boolean remove(E element);
    int getSize();
}