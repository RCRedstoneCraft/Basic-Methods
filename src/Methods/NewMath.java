package Methods;

public class NewMath {

    /**
     *
     * @param min minimum (inclusive)
     * @param max maximum (inclusive)
     * @return random number min - max
     */
    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /**
     *
     * @param arr array
     * @return maximum of the array
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     *
     * @param arr array
     * @return minimum of the array
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}