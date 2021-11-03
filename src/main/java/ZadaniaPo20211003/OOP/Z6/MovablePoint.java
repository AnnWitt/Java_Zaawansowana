package ZadaniaPo20211003.OOP.Z6;

public class MovablePoint implements Movable {

    private int x, y, xSpeed, ySpeed;
    private Point2D wspolrzednePunktu;

    public MovablePoint(Point2D wspolrzednePunktu) {
        this.wspolrzednePunktu = wspolrzednePunktu;
        this.x = (int) wspolrzednePunktu.x;
        this.y = (int) wspolrzednePunktu.y;

    }

    @Override
    public void moveUp() {
        setY(getY() + getySpeed());
        System.out.println(this);
    }

    @Override
    public void moveDown() {
        setY(getY() - getySpeed());
        System.out.println(this);
    }

    @Override
    public void moveLeft() {
        setX(getX() - getxSpeed());
        System.out.println(this);
    }

    @Override
    public void moveRight() {
        setX(getX() + getxSpeed());
        System.out.println(this);
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Wspolrzedne punktu po przesunięciu (" + getX() + ",  " + getY() + ")";

    }

    private int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    private int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }
}
