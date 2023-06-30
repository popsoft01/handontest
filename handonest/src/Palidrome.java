public class Palidrome {

    public static void main(String[] args) {
        int[] nums ={2,5,1,4,6};
        palidrome("bob");
        secondLargestnumber(nums);
    }

    public static boolean palidrome(String word) {
        boolean isPalidrome = false;
        StringBuffer buffer = new StringBuffer(word);
        String reverseWord = String.valueOf(buffer.reverse());
        System.out.println(reverseWord);
        if (word.equals(reverseWord)) {
            isPalidrome = true;
        }
        return isPalidrome;
    }

    public static int secondLargestnumber(int[] nums) {
        int largest = 0;
        int secondLargest = 0;
        for (int i : nums) {
            if (i > largest) {

                secondLargest = largest;
                largest = i;
//                System.out.println(secondLargest);
            } else if (i > secondLargest && i < largest) {
                secondLargest = i;
//                System.out.println(secondLargest);
            }

        }
        System.out.println(secondLargest);

        return secondLargest;
    }
}