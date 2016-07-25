package com.generics;

/**
 * Created by mesut on 25.07.2016.
 */
public class GenericMethods {
    public static void main(String[] args) {
        PrintSometing print = new PrintSometing();
        print.printData("hello world!");
        print.printData(50);

        System.out.println(print.something("asdads"));
    }
}

/*
    Burada dikkat edilmesi gereken nokta şudur ki;
    Generik T kullanıldığında bağlı bulunduğu scope a göre method yada class tanımında da tanımlanmalıdır.
    Sınıflar için sadece değişkenler için kullanıldığında!
    Örneğin T parametresi sınıf için kullanılan bir değişkense sınıf tanımına <T> eklenmeli
    aynı şekilde method içinde kullanılacak değişkenler içinde method imzasına <T> eklenmeli.
 */
class PrintSometing {

    public <T> void printData(T data) {
        System.out.println(data.toString());
    }

    public <T> T something(T data) {
        return data;
    }
}
