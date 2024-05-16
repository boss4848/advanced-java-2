import java.awt.Color;
import java.util.Random;

public class RandomColorStrategy extends ColorStrategy {
    private final Color[] COLORS = {
            Color.BLACK,
            Color.BLUE,
            Color.CYAN,
            Color.DARK_GRAY,
            Color.GRAY,
            Color.LIGHT_GRAY,
            Color.MAGENTA,
            Color.GREEN,
            Color.ORANGE,
            Color.PINK,
            Color.RED,
            Color.YELLOW,
    };

    private Random random;

    public RandomColorStrategy() {
        random = new Random();
        for (int i = 0; i < 4; i++) {
            colors[i] = COLORS[random.nextInt(COLORS.length)];
        }
    }

}
