class Solution {
    public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {//current Roman numeral is smaller than the next one.
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}


// class Solution {
//     public int romanToInt(String s) {
//         int total = 0;
//         int prev = 0;

//         for (int i = s.length() - 1; i >= 0; i--) {
//             int curr = value(s.charAt(i));

//             if (curr < prev) {
//                 total -= curr;   // subtract if smaller than next (right-side) value
//             } else {
//                 total += curr;   // otherwise add
//             }

//             prev = curr;
//         }

//         return total;
//     }

//     private int value(char c) {
//         switch (c) {
//             case 'I': return 1;
//             case 'V': return 5;
//             case 'X': return 10;
//             case 'L': return 50;
//             case 'C': return 100;
//             case 'D': return 500;
//             case 'M': return 1000;
//         }
//         return 0; // should never reach here for valid input
//     }
// }