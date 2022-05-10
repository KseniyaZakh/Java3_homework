package ru.geekbrains.homew3;

import java.util.Arrays;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        String[] arr = {"123", "two", "one", "three"};
        System.out.println(Arrays.toString(arr));
        changeArr(arr, 3, 0);
        System.out.println(Arrays.toString(arr));

        List<String> arrayList = transformToList(arr);


        System.out.println(arrayList.getClass());


        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxWithApples = new Box();
        Box<Orange> boxWithOranges = new Box();
        Box<Orange> secondBoxWithOranges = new Box();


        boxWithOranges.infoBox();
        secondBoxWithOranges.infoBox();
        boxWithApples.infoBox();

        boxWithOranges.addToBox(new Orange());
        boxWithOranges.addToBox(new Orange());
        boxWithOranges.addToBox(new Orange());
        boxWithApples.addToBox(new Apple());
        boxWithApples.addToBox(new Apple());
        secondBoxWithOranges.addToBox(new Orange());

        boxWithOranges.infoBox();
        secondBoxWithOranges.infoBox();
        boxWithApples.infoBox();

        float orangeBox1Weight = boxWithOranges.getWeight();
        float orangeBox2Weight = secondBoxWithOranges.getWeight();
        float appleBoxWeight = boxWithApples.getWeight();

        System.out.println("Вес первой коробки с апельсинами: " + orangeBox1Weight);
        System.out.println("Вес второй коробки с апельсинами: " + orangeBox2Weight);
        System.out.println("Вес коробки с яблоками: " + appleBoxWeight);

        System.out.println("Сравнить вес boxWithOranges и boxWithApples: " + boxWithOranges.compare(boxWithApples));
        System.out.println("Сравнить вес secondBoxWithOranges и boxWithApples: " + secondBoxWithOranges.compare(boxWithApples));

        secondBoxWithOranges.moveAt(boxWithOranges);

        boxWithOranges.infoBox();
        secondBoxWithOranges.infoBox();
        boxWithApples.infoBox();

    }

    private static <T1> List<T1> transformToList(T1[] array) {
        return Arrays.asList(array);
    }

    private static <T> void changeArr(T[] array, int index1, int index2) {
        T param = array[index1];
        array[index1] = array[index2];
        array[index2] = param;
    }


}
