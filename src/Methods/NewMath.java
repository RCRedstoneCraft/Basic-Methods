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
}
