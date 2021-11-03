package ZadaniaPo20211003.OOP.Z5;

class Point3D extends Point2D {

    private float z;

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

     Point3D() {

    }

    float[] getXYZ() {
        float[] tablicaWspolrzednych = {getX(), getY(), getZ()};
        return tablicaWspolrzednych;
    }

    void setXYZ(Point2D point2d, float z) {
        this.z = z;
        this.x = point2d.getX();
        this.y = point2d.getY();
    }

    @Override
    public String toString() {
        return "("+ x +
                ", " + y +
                ", " + z +
                ')';
    }

    //---------------------------------
    float getZ() {
        return z;
    }

    void setZ(float z) {
        this.z = z;
    }
}
