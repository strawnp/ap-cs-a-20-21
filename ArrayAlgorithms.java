import java.util.ArrayList;

public class ArrayAlgorithms {

    /**
     *
     * INSTRUCTIONS
     * You are creating algorithms that are important to understand
     * in the context of arrays. To begin, you will be generating
     * randomized lists, one as an array and one as an ArrayList.
     * From there, you will be developing a series of methods that
     * you will call for each of the data structures you have
     * created. In total you will be writing 6 methods since there
     * are 3 calculations and 2 data structures to perform them on.
     *
    **/
    public static void main(String[] args) {
        // create array of 50 randomized integers between 1 and 1000
        int[] nums = new int[50];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 1000 + 1);
        }

        // create ArrayList of 50 randomized integers between 1 and 1000
        ArrayList<Integer> moreNums = new ArrayList<>();
        // while (moreNums.size() < 50)
        for (int i = 0; i < 50; i++) {
            int number = (int) (Math.random() * 1000 + 1);
            moreNums.add(number);
        }

        // find and print the mean value of each list
        System.out.println(findMeanArray(nums));
        System.out.println(findMeanArrayList(moreNums));

        // find and print the median value of each list
        System.out.println(findMedianArray(nums));
        System.out.println(findMedianArrayList(moreNums));

        // find and print the minimum and maximum values of each list
        System.out.println(findMinArray(nums));
        System.out.println(findMaxArray(nums));
        System.out.println(findMinArrayList(moreNums));
        System.out.println(findMaxArrayList(moreNums));
    }

    public static double findMeanArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static double findMeanArrayList(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.size();
    }

    public static double findMedianArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (arr.length % 2 == 0) {
            return (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        } else {
            return (double) arr[arr.length / 2];
        }
    }

    public static double findMedianArrayList(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        if (arr.size() % 2 == 0) {
            return (double) (arr.get(arr.size() / 2) + arr.get(arr.size() / 2 - 1)) / 2;
        } else {
            return (double) arr.get(arr.size() / 2);
        }
    }

    public static double findMinArray(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) { min = num; }
        }
        return min;
    }

    public static double findMaxArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) { max = num; }
        }
        return max;
    }

    public static double findMinArrayList(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int num : arr) {
            if (num < min) { min = num; }
        }
        return min;
    }

    public static double findMaxArrayList(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int num : arr) {
            if (num > max) { max = num; }
        }
        return max;
    }
}
