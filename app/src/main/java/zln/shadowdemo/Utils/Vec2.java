package zln.shadowdemo.Utils;

/**
 * Created by zln on 04/01/2017.
 */
public class Vec2 {
    public final float x;
    public final float y;

    public Vec2(String[] tokens) {
        this.x = Float.parseFloat(tokens[0]);
        this.y = Float.parseFloat(tokens[1]);
    }

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
