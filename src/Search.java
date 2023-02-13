import java.util.ArrayList;

public class Search {
    public static int linearSearchFirst(int[] numList, int target) {
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchLast(int[] numList, int target) {
        for (int i = numList.length - 1; i >= 0; i--) {
            if (numList[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchFound(int[] numList, int target) {
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchCount(int[] numList, int target) {
        int count = 0;
        for (int i = numList.length - 1; i >= 0; i--) {
            if (numList[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int linearSearchFirst(ArrayList<Integer> numList, int target) {
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchLast(ArrayList<Integer> numList, int target) {
        for (int i = numList.size() - 1; i >= 0; i--) {
            if (numList.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchFound(ArrayList<Integer> numList, int target) {
        return numList.contains(target);
    }

    public static int linearSearchCount(ArrayList<Integer> numList, int target) {
        int count = 0;
        for (int i = numList.size() - 1; i >= 0; i--) {
            if (numList.get(i) == target) {
                count++;
            }
        }
        return count;
    }
}