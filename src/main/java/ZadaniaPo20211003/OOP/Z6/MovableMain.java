package ZadaniaPo20211003.OOP.Z6;

public class MovableMain {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(2, 6);
        MovablePoint movablePoint = new MovablePoint(point2D);
        System.out.println("Wspolrzedne wyjsciowe punktu: " + point2D);
        movablePoint.setxSpeed(3);
        movablePoint.setySpeed(10);
        movablePoint.moveUp();
        movablePoint.moveUp();
        movablePoint.moveLeft();
        movablePoint.moveLeft();
        movablePoint.moveRight();
        movablePoint.moveDown();


        //Do dorobienia Circle
        //Movable movableCircle = new MovablePoint(20, 30, 4, 4);

    }

}
