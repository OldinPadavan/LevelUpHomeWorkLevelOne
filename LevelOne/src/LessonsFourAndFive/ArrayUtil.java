package LessonsFourAndFive;

public class ArrayUtil {


    public static int min(int [] array) {

        int [] sortingArray = array;

        for(int leftSide = 0; leftSide < sortingArray.length; leftSide++) {

            int currentValue = sortingArray [leftSide];

            int i = leftSide - 1;
            for(; i >= 0; i--) {

                if(currentValue < sortingArray [i]) {
                    sortingArray [i + 1] = sortingArray [i];
                } else {
                    break;
                }
            }

            sortingArray [ i + 1] = currentValue;

        }

        return sortingArray [0];

    }

    public static int max(int [] array) {

        int [] sortingArray = array;

        for(int leftSide = 0; leftSide < sortingArray.length; leftSide++) {

            int currentValue = sortingArray [leftSide];

            int i = leftSide - 1;
            for(; i >= 0; i--) {

                if(currentValue < sortingArray [i]) {
                    sortingArray [i + 1] = sortingArray [i];
                } else {
                    break;
                }
            }

            sortingArray [ i + 1] = currentValue;

        }



        return sortingArray [sortingArray.length -1];

    }


}
