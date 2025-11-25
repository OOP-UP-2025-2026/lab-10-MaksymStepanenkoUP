package ua.opnu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            result.add(num * 2);
        }
        return result;
    }

    public List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            result.add(num * num);
        }
        return result;
    }

    public List<String> moreY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add("y" + str + "y");
        }
        return result;
    }

    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num >= 0) {
                result.add(num);
            }
        }
        return result;
    }

    public List<Integer> no9(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 10 != 9) {
                result.add(num);
            }
        }
        return result;
    }

    public List<String> noZ(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (!str.contains("z")) {
                result.add(str);
            }
        }
        return result;
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .collect(Collectors.toList());
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
    }

}
