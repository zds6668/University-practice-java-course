
public class test {
    public static void main(String[] args){
        int[] i = {1,8,6,2,5,4,8,3,7};
        Solution solution = new Solution();
        System.out.println(solution.maxArea(i));
    }
}
class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int i = 0, j = len-1;
        int rest = 0;
        while(i<j) {
            if(height[i] > height[j]) {
                rest = Math.max(rest, height[j]*(j-i));
                j--;
            }else{
                rest = Math.max(rest, height[i]*(j-i));
                i++;
            }

        }return rest;
    }
}