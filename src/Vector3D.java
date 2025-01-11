public class Vector3D {
    double x;
    double y;
    double z;

    Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getZ() {
        return z;
    }

    public static void main(String[] args) {
        Vector3D vector = new Vector3D(1, 2, 3);
        System.out.println("X:" + vector.getX());
        System.out.println("Y:" + vector.getY());
        System.out.println("Z:" + vector.getZ());
    }
}