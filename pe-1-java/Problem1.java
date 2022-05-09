// Problem 1. Multiples of 3 or 5

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            numbers.add(i+1);
        }
        // System.out.println(numbers);

        for (int i = 3; i < numbers.size(); i++){
            if ( (i % 3 == 0) || (i % 5 == 0) ){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

