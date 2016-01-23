import java.util.LinkedList;

public class demos {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>(){{
            add(3);
            add(23);
        }};
        System.out.println(list.get(1));

        int[] numbers = {2,4,5,6};

        for (int number : numbers) {
            System.out.print(" "+ number);
        }

        doSomothing(numbers);

        for (int number : numbers) {
            System.out.print(" "+ number);
        }

    }
    private static void doSomothing(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
