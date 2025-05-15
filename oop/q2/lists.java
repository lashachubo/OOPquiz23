package oop.q2;

import java.util.*;

/**
 * The {@code QuizProcessor} class demonstrates how to generate a new list (list3)
 * from two existing lists (list1, list2) using a simple mathematical transformation.
 *
 * <p>Logic:</p>
 * <ul>
 *   <li>{@code list1} contains integers</li>
 *   <li>{@code list2} contains strings</li>
 *   <li>{@code list3} is computed such that each element at index {@code i} is:
 *       {@code list2.get(list1[i] * 2 - 1)}</li>
 * </ul>
 *
 * <p>This mapping is valid only when the resulting index stays within the bounds of {@code list2}.
 * For safety, out-of-bound indexes are handled by inserting "INVALID" into {@code list3}.</p>
 *
 */

public class lists {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(9, 5, 4, 5, 5, 7, 7, 9, 3, 4, 7, 2, 5);
        List<String> list2 = List.of(
                "fDDS", "iauY", "nNESZ", "Im2U", "hgq", "5WvS", "XjpL8",
                "uV6cs", "Xlrd", "LNR", "UzR", "jRtZ", "mlLe", "pX9",
                "aob", "27x3", "YgQe", "bdPR1"
        );

        List<String> list3 = new ArrayList<>();

        for (int value : list1) {
            int index = value * 2 - 1;
            if (index >= 0 && index < list2.size()) {
                list3.add(list2.get(index));
            } else {
                list3.add("INVALID");
            }
        }

        System.out.println("list3 = " + list3);
    }
}
