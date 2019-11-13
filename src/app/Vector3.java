package app;

public class Vector3 {
    public int x;
    public int y;
    public int z;

    public Vector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3 MultiplyBy(int n) {
        return new Vector3(this.x * n, this.y * n, this.z * n);
    }

    public static Vector3 MultiplyBy(Vector3 v, int n) {
        return v.MultiplyBy(n);
    }

    public Vector3 Add(Vector3 v) {
        return new Vector3(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public static Vector3 Add(Vector3 i, Vector3 k) {
        return i.Add(k);
    }

    public Vector3 Substract(Vector3 v) {
        return this.Add(v.MultiplyBy(-1));
    }

    public static Vector3 Substract(Vector3 i, Vector3 k) {
        return i.Substract(k);
    }

    public int MultiplyScalar(Vector3 v) {
        return this.x * v.x + this.y * v.y;
    }

    public static int MultiplyScalar(Vector3 i, Vector3 k) {
        return i.MultiplyScalar(k);
    }

    public Vector3 MultiplyVector(Vector3 v) {
        return new Vector3(
            (this.y * v.z - v.y * this.z),
            (this.x * v.z - v.x * this.z),
            (this.x * v.y - v.x * this.y)
        );
    }

    public static Vector3 MultiplyVector3(Vector3 i, Vector3 k) {
        return i.MultiplyVector(k);
    }
}