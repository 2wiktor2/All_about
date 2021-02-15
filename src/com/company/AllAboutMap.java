package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllAboutMap {
    public static void main(String[] args) {


        //Map Udemy
        //Если так написать то появится куча методов которые нужно переопределить
        //Map<String, String> dictionary = new Map<String, String>() {        };

        //что бы не переопределять эти методвы существуют реализации Map
        Map<String, String> dictionary = new HashMap<>();
        Map<String, String> dictionary2 = new TreeMap<>();
        dictionary.put("Key1", "Value5");
        dictionary.put("Key2", "Value4");
        dictionary.put("Key3", "Value3");
        dictionary.put("Key4", "Value2");
        dictionary.put("Key5", "Value1");
        dictionary.put("Key10", "Value10");
        dictionary.put("Key9", "Value9");
        dictionary.put("Key8", "Value8");
        dictionary.put("Key7", "Value7");
        dictionary.put("Key6", "Value6");

        dictionary2.put("Key1", "Value5");
        dictionary2.put("Key2", "Value4");
        dictionary2.put("Key3", "Value3");
        dictionary2.put("Key4", "Value2");
        dictionary2.put("Key5", "Value1");
        dictionary2.put("Key10", "Value10");
        dictionary2.put("Key9", "Value9");
        dictionary2.put("Key8", "Value8");
        dictionary2.put("Key7", "Value7");
        dictionary2.put("Key6", "Value6");

        for (String key : dictionary.keySet()) {
            System.out.print(key + ", ");   //Key2, Key1, Key6, Key5, Key4, Key3, Key9, Key8, Key7, Key10, ключи хранятся в без порядка
        }
        System.out.println();
        for (String key : dictionary2.keySet()) {
            System.out.print(key + ", ");   //Key1, Key10, Key2, Key3, Key4, Key5, Key6, Key7, Key8, Key9,  ключи хранятся в в алфавитном порядке
        }
        System.out.println();

        //мап вместо pojo-объекта
        Map<String, Object> user = new HashMap<>();
        user.put("name", "Ivan");
        user.put("lastName", "Ivanov");
        user.put("age", 15);

        ArrayList<Map<String, Object>> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Map<String, Object> user2 = new HashMap<>();
            user2.put("name", "Ivan" + i);
            user2.put("lastName", "Ivanov" + i);
            user2.put("age", 15 + i);
            users.add(user2);
        }

        //вывести все значения
        for (Map<String, Object> mapUser : users) {
            // вывести все ключи
            for (String key : mapUser.keySet()) {
                System.out.println(key);
                // получить значения по ключу
                System.out.println(mapUser.get(key));
            }
            // вывести все значения
            for (Object value : mapUser.values()) {
                System.out.println(value);
            }
        }


        // Теория ----------------------------------------------------------------------------------------

        // Интерфейс Map<K, V> представляет отображение или иначе говоря словарь, где каждый элемент представляет
        // пару "ключ-значение". При этом все ключи уникальные в рамках объекта Map. Такие коллекции облегчают
        // поиск элемента, если нам известен ключ - уникальный идентификатор объекта.


        //Следует отметить, что в отличие от других интерфейсов, которые представляют коллекции, интерфейс Map НЕ расширяет интерфейс Collection.

        // HashMap имеет переопределенный методж toString(), поэтому HashMap можно выводить в консоль.
        // Результат в таком виде : {1=Germany, 2=Spain, 3=Italy, 4=France, 5=Russia}

        // Доступ к значениям в HashMap осуществляется по ключу(никак не наоборот, т.к. значения могут быть одинаковыми)

/*        interface Map<K, V> {
            V get (K key);
            V put (K key, V value);
            boolean contains (K key);
            V remove (K key);
            Set<K> key Set();
            Collection<V> values();
        }*/

/*      Cреди основных реализаций можно назвать:
        HashMap
        LinkedHashMap
        TreeMap
        Hashtable
        */

/*
        HashMap - хранит значения в произвольном порядке, но позволяет быстро искать элементы карты. Позволяет задавать ключ
            или значение ключевым словом null.
        LinkedHashMap - хранит значения в порядке добавления.
        TreeMap - сама сортирует значения по заданному критерию. TreeMap используется либо с Comparable элементами,
            либо в связке с Comparator. Смотрите статью "Интерфейсы Comparable и Comparator".
        Hashtable - как HashMap, только не позволяет хранить null и синхронизирован с точки зрения многопоточности - это значит,
            что много потоков могут работать безопасно с Hashtable. Но данная реализация старая и медленная, поэтому сейчас
            уже не используется в новых проектах.
 */


// Создание --------------------------------------------------------------------------------------

        // Создание объекта типа Map похоже на создание коллекций - только мы должны задавать два типа - тип ключа и тип значения:
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();

        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(0, "Ноль");
        mapa.put(1, "Один");
        mapa.put(2, "Два");
        mapa.put(3, "Три");
        mapa.put(4, "Четыре");
        mapa.put(5, "Пять");

        HashMap<Integer, String> mapa2 = new HashMap<>();
        mapa2.put(0, "Ноль");
        mapa2.put(1, "Один");
        mapa2.put(2, "Два");
        mapa2.put(3, "Три");
        mapa2.put(4, "Четыре");
        mapa2.put(5, "Пять");

        HashMap<Integer, String> mapa3 = new HashMap<>();
        mapa2.put(0, "Ноль");
        mapa2.put(1, "Один");
        mapa2.put(2, "Два");
        mapa2.put(3, "Три");
        mapa2.put(4, "Четыре");
        mapa2.put(5, "Пять");
        mapa2.put(6, "Шесть");
        mapa2.put(7, "Семь");
        mapa2.put(8, "Восемь");
        mapa2.put(9, "Девять");
        mapa2.put(10, "Десять");
        mapa2.put(11, "Одинадцать");

        HashMap<Integer, String> mapa4 = new HashMap<>();
        mapa2.put(10, "Десять");
        mapa2.put(11, "Одинадцать");
        mapa2.put(12, "Двенадцать");
        mapa2.put(13, "Тринадцать");
        mapa2.put(14, "Четырнадцать");
        mapa2.put(15, "Пятнадцать");
        mapa2.put(16, "Шеснадцать");
        mapa2.put(17, "Семнадцать");
        mapa2.put(18, "Восемнадцать");
        mapa2.put(19, "Девятнадцать");
        mapa2.put(20, "Двадцать");
        mapa2.put(21, "Двадцать один");


//Добавление------------------------------------------------------------------------------------------------------------

        // Добавить элемент в коллекцию
        /*        V put(K k, V v): помещает в коллекцию новый объект с ключом k и значением v. Если в коллекции уже есть объект
                с подобным ключом, то он перезаписывается. После добавления возвращает предыдущее значение для ключа k,
                если он уже был в коллекции. Если же ключа еще не было в коллекции, то возвращается значение null*/
        states.put(5, "Russia");
        System.out.println(states);  //{1=Germany, 2=Spain, 3=Italy, 4=France, 5=Russia}
        states.put(6, "Russia");
        System.out.println(states); //{1=Germany, 2=Spain, 3=Italy, 4=France, 5=Russia, 6=Russia}

/*        V putIfAbsent(K k, V v): помещает в коллекцию новый объект с ключом k и значением v, если в коллекции
        еще нет элемента с подобным ключом.*/
        states.putIfAbsent(3, "Russia");
        System.out.println(states);        //{1=Germany, 2=Spain, 3=Italy, 4=France, 5=Russia, 6=Russia}

// Получение----------------------------------------------------------------------------------------------------

        // Получение значения по его ключу.
        //get(Object key) - ищем значение по его ключу.
        states.get(1);
        System.out.println("значение по его ключу '1' " + states.get(1));
        //возвращает значение объекта, ключ которого равен k.
        // Если такого элемента не окажется, то возвращается значение null

        //V get(Object k): возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение null

        //V getOrDefault(Object k, V defaultValue): возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение defaultVlue


        //спрашиваем, есть ли в карте заданный ключ  containsKey(Object key);
        states.containsKey(1);
        System.out.println("Содержит ли карта ключ '1'? " + states.containsKey(1)); //true
        System.out.println("Содержит ли карта ключ '10'? " + states.containsKey(10)); //false

        //спрашиваем, есть ли в карте заданное значение containsValue(Object value)
        states.containsValue("Russia");
        System.out.println("Содержит ли карта значение 'Russia'?" + states.containsValue("Russia")); //true
        System.out.println("Содержит ли карта значение 'Turkey'?" + states.containsValue("Turkey")); //false

        // возвращает размер карты (количество пар "ключ-значение").  size()
        states.size();
        System.out.println("Размер карты, количество пар ключ-значение в мапе  = " + states.size()); //6

        //boolean isEmpty: возвращает true, если коллекция пуста
        mapa2.isEmpty();
        System.out.println("Размер mapa2 = " + mapa2.size());
        System.out.println("Метод isEmpty() возвращает, если мапа не пустая : " + mapa2.isEmpty()); // false если мапа не пустая
        mapa2.clear();
        System.out.println("Метод isEmpty() возвращает, если мапа пустая : " + mapa2.isEmpty()); // true если мапа пустая

        //Set<Map.Entry<K, V>> entrySet(): возвращает набор элементов коллекции. Все элементы представляют объект Map.Entry

        //Set<K> keySet(): возвращает набор всех ключей отображения

        //Collection<V> values(): возвращает набор всех значений отображения

// Удаление-------------------------------------------------------------------------------------------------------------

        //Удаление по ключу
        states.remove(1);
        System.out.println("После удаления по ключу 1 " + states);
        //Удаление всего содержимого карты, очищает коллекцию
        System.out.println("Размер карты 'mapa' = " + mapa.size());
        mapa.clear();
        System.out.println("Размер карты после 'mapa.clear();' = " + mapa.size());

//Объединение мап ------------------------------------------------------------------------------------------------------

        Map<Integer, String> unionMap = new HashMap<>();
        System.out.println("Новая мапа - " + unionMap);  // Новая мапа - {}

        // void putAll(Map<? extends K, ? extends V> map): добавляет в коллекцию все объекты из отображения map


        unionMap.putAll(mapa4);
        System.out.println("Новая мапа после добавления mapa4 = " + unionMap);


//Сравнение -------------------------------------------------------------------------------------------------------

        states.equals(mapa2);
        System.out.println("Сравнение карт - " + states.equals(mapa2));  //false  возвращает true, если коллекция идентична коллекции, передаваемой через параметр obj
        System.out.println("Сравнение карт - " + mapa.equals(mapa2));  // true  возвращает почему-то true !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


// Методы --------------------------------------------------------------------------------------------------------------

 /*               Среди методов интерфейса Map можно выделить следующие:



        void putAll(Map<? extends K, ? extends V> map): добавляет в коллекцию все объекты из отображения map

        Чтобы положить объект в коллекцию, используется метод put, а чтобы получить по ключу - метод get. Реализация
         интерфейса Map также позволяет получить наборы как ключей, так и значений. А метод entrySet() возвращает
          набор всех элементов в виде объектов Map.Entry<K, V>.

                Обобщенный интерфейс Map.Entry<K, V> представляет объект с ключом типа K и значением типа V
                 и определяет следующие методы:

        boolean equals(Object obj): возвращает true, если объект obj, представляющий интерфейс Map.Entry,
         идентичен текущему

        K getKey(): возвращает ключ объекта отображения

        V getValue(): возвращает значение объекта отображения

        Set<K> keySet(): возвращает набор всех ключей отображения

        V setValue(V v): устанавливает для текущего объекта значение v

        int hashCode(): возвращает хеш-код данного объекта

        При переборе объектов отображения мы будем оперировать этими методами для работы с ключами и значениями объектов.

        Классы отображений. HashMap
        Базовым классом для всех отображений является абстрактный класс AbstractMap, который реализует большую
         часть методов интерфейса Map. Наиболее распространенным классом отображений является HashMap, который
         реализует интерфейс Map и наследуется от класса AbstractMap.

         Чтобы добавить или заменить элемент, используется метод put, либо replace, а чтобы получить его значение по
         ключу - метод get. С помощью других методов интерфейса Map также производятся другие манипуляции над элементами:
         перебор, получение ключей, значений, удаление.*/

        //  Пример использования класса:
/*        public class Program{

            public static void main(String[] args) {

                Map<Integer, String> states = new HashMap<Integer, String>();
                states.put(1, "Germany");
                states.put(2, "Spain");
                states.put(4, "France");
                states.put(3, "Italy");

                // получим объект по ключу 2
                String first = states.get(2);
                System.out.println(first);
                // получим весь набор ключей
                Set<Integer> keys = states.keySet();
                // получить набор всех значений
                Collection<String> values = states.values();
                //заменить элемент
                states.replace(1, "Poland");
                // удаление элемента по ключу 2
                states.remove(2);
                // перебор элементов
                for(Map.Entry<Integer, String> item : states.entrySet()){

                    System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                }

                Map<String, Person> people = new HashMap<String, Person>();
                people.put("1240i54", new Person("Tom"));
                people.put("1564i55", new Person("Bill"));
                people.put("4540i56", new Person("Nick"));

                for(Map.Entry<String, Person> item : people.entrySet()){

                    System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
                }
            }
        }
        class Person{

            private String name;
            public Person(String value){
                name=value;
            }
            String getName(){return name;}
        }*/
    }
}
