package com.generics;

/**
 * Created by mesut on 25.07.2016.
 */
public class BoundedType {
    public static void main(String[] args) {
        System.out.println(karsilastir(10,35));
        System.out.println(karsilastir("Mehmet", "Ahmet"));
    }

    /*
        Buradaki amaç T tipindekideğişkenlerin compare edilebilmek için Comparable interfacenin extend edilmesi.
        Bounded type demek generic tipteki değişkeni extend yada implements ile sınırlamak.
     */
    public static <T extends Comparable<T>> T karsilastir(T t1, T t2) {
        if (t1.compareTo(t2) < 0) {
            return t1;
        }

        return t2;
    }
}
