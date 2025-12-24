package com.arrays.basic.find;

import java.util.ArrayList;
import java.util.List;

public class Sum3Solution {

    public static void main(String[] args) {
        
        Sum3Solution s3 = new Sum3Solution();
        List<List<Integer>> out1 = s3.combinationSum3(3, 7);
        List<List<Integer>> out2 = s3.combinationSum3(3, 9);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int target,
                           List<Integer> current, List<List<Integer>> result) {

        // If combination has k numbers and sum is achieved
        if (current.size() == k && target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Pruning: if size exceeds or target goes negative
        if (current.size() > k || target < 0) return;

        for (int i = start; i <= 9; i++) {
            current.add(i);
            backtrack(i + 1, k, target - i, current, result);
            current.remove(current.size() - 1);
        }
    }
}