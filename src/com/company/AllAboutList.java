package com.company;

import java.awt.*;
import java.util.ArrayList;

public class AllAboutList {
    public static void main(String[] args) {

        List list = new List();

        ArrayList<String> arrayL = new ArrayList<String>(3);


        //Добавление элементов
        arrayL.add("Hi");
        arrayL.add("Hello");
        arrayL.add("Ciao");
        arrayL.add("Hola");
        arrayL.add("Привет");
        arrayL.add("Hey!");
        arrayL.add("This");
        arrayL.add("is");
        arrayL.add("my");
        arrayL.add("first");
        arrayL.add("list!");
        arrayL.add("Merhaba");
        arrayL.add("Aloha");
        arrayL.add("Гамарджоба");

        // Добавление в середину списка
        arrayL.add(3, "Дратути");

        // Удаление из списка
        arrayL.remove(1);    // Удаление по индексу
        arrayL.remove("Hola");   // Удаление по значению т.е. по ссылке

        // получить элемент из списка
        arrayL.get(8);
        System.out.println("получить элемент из списка  "+ arrayL.get(8));

        // получить индекс элемента списка
        arrayL.indexOf("Гамарджоба");
        System.out.println("получить индекс элемента списка  "+arrayL.indexOf("Гамарджоба"));

        // Заменить элемент списка другим элементом
        arrayL.set(7, "Zhopa новый элемент списка");


        //Размер списка
        System.out.println("Размер массива = " + arrayL.size());

        // Вывод всего списка
        System.out.println(arrayL.toString());

        // Проверить соделжит ли список элемент
        arrayL.contains("Привет");  // true
        System.out.println(arrayL.contains("Привет"));

        // Проход по списку

        for (int i =0; i<arrayL.size(); i++){
            System.out.println("Проход по списку for "+arrayL.get(i));
        }
/*

        boolean	add(E e)
//Appends the specified element to the end of this list.
        void	add(int index, E element)
//Inserts the specified element at the specified position in this list.
        boolean	addAll(Collection<? extends E> c)
//Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
        boolean	addAll(int index, Collection<? extends E> c)
//Inserts all of the elements in the specified collection into this list, starting at the specified position.
        void	clear()
//Removes all of the elements from this list.
        Object	clone()
//Returns a shallow copy of this ArrayList instance.
        boolean	contains(Object o)
//Returns true if this list contains the specified element.
        void	ensureCapacity(int minCapacity)
//Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
          E	get(int index)
//Returns the element at the specified position in this list.
        int	indexOf(Object o)
//Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        boolean	isEmpty()
//Returns true if this list contains no elements.
        Iterator<E>	iterator()
//Returns an iterator over the elements in this list in proper sequence.
        int	lastIndexOf(Object o)
//Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        ListIterator<E>	listIterator()
//Returns a list iterator over the elements in this list (in proper sequence).
        ListIterator<E>	listIterator(int index)
//Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
         E	remove(int index)
//Removes the element at the specified position in this list.
        boolean	remove(Object o)
//Removes the first occurrence of the specified element from this list, if it is present.
        boolean	removeAll(Collection<?> c)
//Removes from this list all of its elements that are contained in the specified collection.
        protected void	removeRange(int fromIndex, int toIndex)
//Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
        boolean	retainAll(Collection<?> c)
//Retains only the elements in this list that are contained in the specified collection.
        E	set(int index, E element)
//Replaces the element at the specified position in this list with the specified element.
        int	size()
//Returns the number of elements in this list.
        List<E>	subList(int fromIndex, int toIndex)
//Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        Object[]	toArray()
//Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        <T> T[]	toArray(T[] a)
//Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
        void	trimToSize()
//Trims the capacity of this ArrayList instance to be the list's current size.


*/


    }
}



