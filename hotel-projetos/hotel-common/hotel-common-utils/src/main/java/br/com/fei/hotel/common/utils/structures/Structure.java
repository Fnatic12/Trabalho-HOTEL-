package br.com.fei.hotel.common.utils.structures;

/**
 *
 * @author vitor
 * @param <E>
 */
public interface Structure<E>
{
    int add(E element);
    E findByIndex(int index);
    E findeByElement(E element);
    boolean remove(int index);
    boolean remove(E element);
    int size();
}