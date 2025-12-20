package chapter1_oop_overview.chapter1_ex3;

public class PointsManagement {
    static void main() {
        Points point1 = new Points();
        Points point2 = new Points();

        point1.importPoints();
        point2.importPoints();

        double distanceTo = point1.distanceTo(point2);

        System.out.println("Distance to: " + distanceTo);
    }

}
