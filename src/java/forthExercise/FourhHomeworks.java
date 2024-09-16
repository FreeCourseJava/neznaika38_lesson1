package forthExercise;

import java.util.Arrays;
import java.util.Random;

public class FourhHomeworks {

    public static int[] firstExercise(){
        final Random random = new Random();
        int[] significantYearsTatarstan = new int[20];
        int firstMentionYear = 1222;
        int currentYear = 2022;

        for (int i = 0; i < significantYearsTatarstan.length; i++) {
            significantYearsTatarstan[i] = firstMentionYear + random.nextInt(currentYear - firstMentionYear + 1);
        }

        System.out.println(Arrays.toString(significantYearsTatarstan));

        significantYearsTatarstan = cocktailShakerSort(significantYearsTatarstan);

        return significantYearsTatarstan;
    }
    public static int[] cocktailShakerSort(int[] arrayToSort) {
        if (arrayToSort.length == 0 || arrayToSort.length == 1){
            return arrayToSort;
        }
        for (int i = 0; i < arrayToSort.length - i; i++) {
            int indexOfMin = i;
            int currentMin = arrayToSort[indexOfMin];
            int indexOfMax = arrayToSort.length - i - 1;
            int currentMax = arrayToSort[indexOfMax];

            for (int j = i; j < arrayToSort.length - i; j++) {

                if (arrayToSort[j] <= currentMin) {
                    currentMin = arrayToSort[j];
                    indexOfMin = j;
                }
                if (arrayToSort[j] >= currentMax) {
                    currentMax = arrayToSort[j];
                    indexOfMax = j;
                }
            }
            int tmpChangeValueMin = arrayToSort[indexOfMin];
            arrayToSort[indexOfMin] = arrayToSort[i];
            arrayToSort[i] = tmpChangeValueMin;

            if (indexOfMax == i) {
                indexOfMax = indexOfMin;
            }

            int tmpChangeValueMax = arrayToSort[indexOfMax];
            arrayToSort[indexOfMax] = arrayToSort[arrayToSort.length - i - 1];
            arrayToSort[arrayToSort.length - i - 1] = tmpChangeValueMax;
        }

        return arrayToSort;
    }

    public static boolean secondExercise(){
       int desiredValue = 1256;
//     int [] arrayOfData = {1256};
//     int [] arrayOfData = {1256, 1272};
//     int [] arrayOfData = {1256, 1272, 1327};
//     int [] arrayOfData = {1256, 1272, 1327, 1384};
     int [] arrayOfData = {1256, 1272, 1327, 1384, 1391, 1464, 1502, 1546, 1595, 1617, 1656, 1668, 1749, 1761, 1787, 1806, 1819, 1931, 1941, 2011};
       return binarySearchWithRecursion(arrayOfData, desiredValue);
    }
    public static boolean binarySearchWithRecursion(int[] arrayOfData, int desiredValue) {

        if (arrayOfData.length == 0) {
            return false;
        }

        if (arrayOfData.length == 1 && arrayOfData[0] == desiredValue) {
            return true;
        }

        int left = 0;
        int right = arrayOfData.length - 1;

        if (left >= right){
            return false;
        }

        int midIndex = left + (right - left) / 2;

            if (arrayOfData[midIndex] < desiredValue){
                left = midIndex + 1;
                return binarySearchWithRecursion(Arrays.copyOfRange(arrayOfData, left, right +1), desiredValue);
                }
            else if (arrayOfData[midIndex] > desiredValue) {
                right = midIndex;
                return binarySearchWithRecursion(Arrays.copyOfRange(arrayOfData, left, right), desiredValue);
                }
            else{
                return true;
            }
    }
    
    public static void main(String[] args) {
        int[] significantYearsTatarstan = firstExercise();
        System.out.println(Arrays.toString(significantYearsTatarstan));
        System.out.println(secondExercise());
    }
}

