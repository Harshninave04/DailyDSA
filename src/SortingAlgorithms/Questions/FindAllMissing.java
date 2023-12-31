package SortingAlgorithms.Questions;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google

    public class FindAllMissing {
        public List<Integer> findDisappearedNumbers(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    i++;
                }
            }
            // just find missing numbers
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index+1) {
                    ans.add(index + 1);
                }
            }
            return ans;
        }
        public static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

    }





