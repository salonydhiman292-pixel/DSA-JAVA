// - Approach: Using Previous Row
// - Time Complexity: O(n^2)
// - Space Complexity: O(n^2)
package array2;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = 5;

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    l.add(1);
                else 
                    l.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }


                ans.add(l);
            }
            for (int i = 0; i < ans.size(); i++) {
                System.out.println(ans.get(i));

        }

    }
}


