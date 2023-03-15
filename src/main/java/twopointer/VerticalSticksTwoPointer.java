package twopointer;

public class VerticalSticksTwoPointer {

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while (start < end) {
            int width = end - start;
            int cHeight = Math.min(height[start], height[end]);
            int currentArea = width * cHeight;
            maxArea = Math.max(maxArea, currentArea);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args){
        int[] intArray = {1, 8, 9, 4, 11, 15, 3, 5};

        System.out.println("Max area is held in: " + maxArea(intArray));
    }
}

