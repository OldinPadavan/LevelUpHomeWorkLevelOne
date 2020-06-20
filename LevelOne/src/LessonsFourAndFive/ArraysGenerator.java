package LessonsFourAndFive;

import java.util.Arrays;

public class ArraysGenerator {



    private int [] newArray;

    public  int [] getNewArray() {
        return this.newArray;
    }


    public ArraysGenerator(int size) {

        newArray = new int[size];

    }


    public static void main(String[] args) {

        ArraysGenerator arraysGenerator = new ArraysGenerator(25);
        addValues(arraysGenerator.getNewArray());


        System.out.println(Arrays.toString(arraysGenerator.getNewArray()));

        System.out.println(ArrayUtil.max(arraysGenerator.getNewArray()));
        System.out.println(ArrayUtil.min(arraysGenerator.getNewArray()));


    }

    public static void addValues(int [] array) {

        for(int i = 0; i < array.length; i++) {
            array [i] = (int) (Math.random() * 100) + 1;

        }
    }
}
