package ru.geekbrains.homew3;

import java.util.Arrays;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        String[] arr = {"123", "two", "one", "three"};
        System.out.println(Arrays.toString(arr));
        changeArr(arr, 3, 0);
        System.out.println(Arrays.toString(arr));

        List<String> arrayList=transformToList(arr);


        System.out.println(arrayList.getClass());

    }

    private static <T1> List<T1> transformToList(T1 [] array) {
        return Arrays.asList(array);
    }

    private static <T> void changeArr(T[] array, int index1, int index2) {
        T param =array[index1];
        array[index1]=array[index2];
        array[index2] = param;
    }

    }
