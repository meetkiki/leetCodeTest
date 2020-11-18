package com.meetkiki.leetcode;

//给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
//
//
//
// 示例 1:
//
// 输入: nums = [1,1,1,2,2,3], k = 2
//输出: [1,2]
//
//
// 示例 2:
//
// 输入: nums = [1], k = 1
//输出: [1]
//
//
//
// 提示：
//
//
// 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
// 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
// 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。
// 你可以按任意顺序返回答案。
//
// Related Topics 堆 哈希表
// 👍 568 👎 0

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _347 {

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1, 1, 1};
        topKFrequent(nums, 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer> arrayList = Arrays.asList(12, 3, 4, 56, 10);


//        HashMap<Integer, Integer> integerCount = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            integerCount.compute(nums[i], (key, count) -> {
//                if (count == null) {
//                    return 1;
//                }
//                return count + 1;
//            });
//        }

        List<Integer> list = arrayList.stream()
                //.sorted(Comparator.comparing(Integer::intValue))
                .sorted((c1, c2) -> {
                    System.out.println("1c1 :" + c1);
                    System.out.println("1c2 :" + c2);
                    return c2 - c1;
                })
                .map(i -> i + 1)

                .peek(o -> System.out.println("=========" + o))

                //.peek(System.out::println)
                .sorted((c1, c2) -> {
                    System.out.println("2c1 :" + c1);
                    System.out.println("2c2 :" + c2);
                    return c1 - c2;
                })

                .peek(o -> System.out.println("=========" + o))
                //.peek(System.out::println)
                .sorted((c1, c2) -> {
                    System.out.println("3c1 :" + c1);
                    System.out.println("3c2 :" + c2);
                    return c1 - c2;
                })
//                .sorted(Comparator.reverseOrder())
                //.peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(list);

        return null;
    }

}
