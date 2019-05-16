import java.util.Timer;
import java.util.TimerTask;

public class Animate {
    public static int x = 0;
    public static boolean go = false;
    public static void animateBackground(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (x >= -260 && !go) {
                    x -= 1;
                    if (x == -260) go = true;
                } else if (x <= 0) {
                    x += 1;
                    if (x == 0) go = false;
                }
                Main.bodies.setBounds(x,-13,1110,525);
            }
        }, 1000, 100);
    }
}
