package app;

public class Matrix2 {
    public static void main(String[] args) {
        var result = new Matrix2(1,2,3,4).MultiplyBy(new Matrix2 (5,6,7,8));

        System.out.println(result.v1());
        System.out.println(result.v2());
        System.out.println(result.v3());
        System.out.println(result.v4());

    }
    public int[][] values = new int[2][2];

    public int v1() {
        return values[0][0];
    }

    public int v2() {
        return values[0][1];
    }

    public int v3() {
        return values[1][0];
    }

    public int v4() {
        return values[1][1];
    }

    public void v1(int i) {
        values[0][0] = 1;
    }

    public void v2(int i) {
        values[0][1] = i;
    }

    public void v3(int i) {
        values[1][0] = i;
    }

    public void v4(int i) {
        values[1][1] = i;
    }

    public Matrix2(int v1, int v2, int v3, int v4) {
        this.values[0][0] = v1;
        this.values[0][1] = v2;
        this.values[1][0] = v3;
        this.values[1][1] = v4;
    }

    public Matrix2 Add(Matrix2 m) {
        return new Matrix2(v1() + m.v1(), v2() + m.v2(), v3() + m.v3(), v4() + m.v4());
    }

    public static Matrix2 Add(Matrix2 i, Matrix2 k) {
        return i.Add(k);
    }

    public Matrix2 MultiplyBy(int n) {
        return new Matrix2(v1() * n, v2() * n, v3() * n, v4() * n);
    }

    public static Matrix2 MultiplyBy(Matrix2 i, int n) {
        return i.MultiplyBy(n);
    }

    public Matrix2 Substract(Matrix2 i) {
        return this.Add(i.MultiplyBy(-1));
    }

    public static Matrix2 Substract(Matrix2 i, Matrix2 k) {
        return i.Substract(k);
    }

    public Matrix2 MultiplyBy (Matrix2 i) {
        return new Matrix2(
            this.v1() * i.v1() + this.v2() * i.v3(),
            this.v1() * i.v2() + this.v2() * i.v4(),
            this.v3() * i.v1() + this.v4() * i.v3(),
            this.v3() * i.v2() + this.v4() * i.v4()
        );
    }

    public static Matrix2 MultiplyBy(Matrix2 i, Matrix2 k) {
        return i.MultiplyBy(k);
    }

    public int Determinant() {
        return this.v1() * this.v4() - this.v2() * this.v3();
    }
    public static int Determinant (Matrix2 i) {
        return i.Determinant();
    }
}