package serializable;

import java.io.Serializable;

public class Vector implements Serializable {

    private static final long serialVersionUID = 374618618736123L;

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public void setZ(final double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "serializable.Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
