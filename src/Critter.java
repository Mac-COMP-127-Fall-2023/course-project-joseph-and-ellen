

import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Point;

/**
 * The base class for all critters.
 * Actual critters must implement buildGraphics and call addLeg and addEye.
 *
 * @author Paul Cantrell
 */
@SuppressWarnings("WeakerAccess")
public abstract class Critter {
    private final GraphicsGroup graphics;
    // private double speed;
    // private List<Eye> eyes;
    // private List<Leg> legs;
    private Point goal;
    private double daysAlive;

    // Some critters are drawn so that the upper left corner x, y, of its shape
    // might be negative. If so, these should be changed in the subclass to show that.
    // See BoxBot and RoundBug for examples.
    protected double xOffset = 0.0;
    protected double yOffset = 0.0;

    public Critter() {
        // eyes = new ArrayList<>();
        // legs = new ArrayList<>();
        graphics = new GraphicsGroup(0, 0);
        buildGraphics();
        daysAlive += 1;
    }

    /**
     * @return the underlying graphics component.
     */
    public GraphicsGroup getGraphics() {
        return graphics;
    }

    /**
     * @return the amount to offset the initial location of the graphic
     * in the x direction when using setLocation.
     */
    public double getxOffset() {
        return xOffset;
    }

    /**
     * @return the amount to offset the initial location of the graphic
     * in the y direction when using setLocation.
     */
    public double getyOffset() {
        return yOffset;
    }

    /**
     * Concrete classes must override this and use it to draw the shape.
     */
    protected abstract void buildGraphics();

    protected abstract void stage2();

    protected abstract void stage3();

    protected abstract void remove();

    public double getSize() {
        return Math.hypot(getGraphics().getWidth(), getGraphics().getHeight());
    }

    // public double getSpeed() {
    //     return speed;
    // }

    // public void setSpeed(double speed) {
    //     this.speed = speed;
    // }

    public Point getGoal() {
        return goal;
    }

    public void setGoal(Point goal) {
        this.goal = goal;
    }

    public double daysAlive() {
        return daysAlive;
    }

    public double addOneDay() {
        return daysAlive = daysAlive + 1;
    }
}
