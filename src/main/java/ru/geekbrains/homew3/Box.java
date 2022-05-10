package ru.geekbrains.homew3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T extends Fruit> {
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box(T... obj) {
        list = Arrays.asList(obj);
    }

    public Box() {
        list = new ArrayList<T>();
    }

    void addToBox(T obj) {
        list.add(obj);
    }

    void moveAt(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    void infoBox() {
        if (list.isEmpty()) {
            System.out.println("В коробке ничего нет");
        } else {
            System.out.println("В коробке находятся " + list.size()+" "+ list.get(0).toString());
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;

        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }


}

