package com.generics;

/**
 * Created by mesut on 25.07.2016.
 */
public class GenericTypes {
    public static void main(String[] args) {
        /*Store store = new Store();
        //store.setItem("Deneme");
        store.setItem(15);*/

        /*
            Bu yapı yukarıdaki yapıya göre daha az maliyetlidir.
            Böylelikle casting için zaman harcanmaz ve program daha hızlı çalışır.
            Ayrı bu yöntemle type casting safety özelliği ile runtime errorarın önüne geçilmiş olur.
         */
        Store<String> store = new Store<String>();
        store.setItem("deneme");
        System.out.println(store);
    }
}

/*
    GenericTypes sınıfında görüldüğü gibi Object türünde type casting yapmak çok maliyetli
    bir iş olduğu için bu yöntem sağlıklı değildir. Bunun yerine generics kullanmak daha avantajlıdır.
 */
/*
class Store {
    private Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
*/

/*
 * item değişkeninin tipi T olduğu için sınıf tanımında Store classına <T> ekliyoruz.
 * Bu şu demektir; Bu sınıfta generic bir tip kullanılmıştır ve sınıf declerasyonunda <T> kullanılmalıdır.
 */
class Store<T> {
    private T item; //Burada tipi sonradan değişe bileceğini söylüyoruz

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}