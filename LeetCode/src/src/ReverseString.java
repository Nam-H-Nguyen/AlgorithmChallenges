/**
 * File ReverseString.java
 * @author Nam Hoang Nguyen
 * @version 03/31/2019
 *
 * Reverse an array of char and modifying the array in place.
 */

class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;

        while (j >= s.length/2) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
