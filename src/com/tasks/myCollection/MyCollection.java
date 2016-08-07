package com.tasks.myCollection;

import java.util.Arrays;

public class MyCollection {
    private static int[] intArray;

    MyCollection (int length) {

    }

    // добавление элемента в начало массива --------------------------------------------------------------
    public void addFirst(int num) {
        incrElem(num);
        intArray = Arrays.copyOf(intArray, intArray.length + 1);
        System.arraycopy(intArray, 0, intArray, 1, intArray.length - 1);
        intArray[0] = num;
    }

    // добавление элемента в конец массива ----------------------------------------------------------------
    public void addLast(int num) {
        incrElem(num);
        intArray = Arrays.copyOf(intArray, intArray.length + 1);
        intArray[intArray.length] = num;
    }

    // добавление элемента в середину массива --------------------------------------------------------------
    public void addToPosition(int num, int position) {
        if (position >= 0 && position <= intArray.length) {
            incrElem(num);
            intArray = Arrays.copyOf(intArray, intArray.length + 1);
            System.arraycopy(intArray, position, intArray, position+1, intArray.length - 1);
            intArray[position] = num;
        } else {
            throw new ArrayIndexOutOfBoundsException("Заданная позиция выходит за пределы массива");
        }
    }

    // удаление элемента из начала массива --------------------------------------------------------------
    public void removeFirst() {
        decrElem(intArray[0]);
        int[] tmpArray = new int[intArray.length-1];
        System.arraycopy(intArray, 1, tmpArray, 0, intArray.length - 2);
        intArray = tmpArray;
    }

    // удаление элемента из конца массива --------------------------------------------------------------
    public void removeLast() {
        decrElem(intArray[intArray.length - 1]);
        intArray = Arrays.copyOf(intArray, intArray.length - 1);
    }

    // удаление элемента из середины массива --------------------------------------------------------------
    public void removeFromThePosition(int position) {
        if (position == 0) {
            removeFirst();
            return;
        }
        else if (position == intArray.length - 1) {
            removeLast();
            return;
        }
        else if (position > 0 && position <intArray.length - 2) {
            decrElem(intArray[position]);
            int[] tmpArray = new int[intArray.length-1];
            System.arraycopy(intArray, 0, tmpArray, 0, position - 1);
            System.arraycopy(intArray, position + 1, tmpArray, position +1, ((intArray.length-1) - position));
            intArray = tmpArray;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Заданная позиция выходит за пределы массива");
        }
    }

    private void incrElem(int num) {
        for (int i=0; i<intArray.length; i++) {
            intArray[i] += num;
        }
    }

    private void decrElem(int num) {
        for (int i=0; i<intArray.length; i++) {
            intArray[i] -= num;
        }
    }
}
