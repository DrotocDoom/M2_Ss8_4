public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);

        Rectangle[] rectangles = {r1, r2, r3};
        for (int i = 0; i < rectangles.length; i++) {
            Rectangle r = rectangles[i];
            System.out.println("Rectangle " + (i + 1)
                    + ": width=" + r.getWidth()
                    + ", height=" + r.getHeight()
                    + ", area=" + r.getArea()
                    + ", perimeter=" + r.getPerimeter());
        }
        double maxArea = rectangles[0].getArea();
        System.out.println();
        for (int i = 1; i < rectangles.length; i++) {
            if (rectangles[i].getArea() > maxArea) {
                maxArea = rectangles[i].getArea();
                System.out.println("Largest area = " + maxArea
                        + " (Rectangle " + (i + 1)
                        + ": width=" + rectangles[i].getWidth()
                        + ", height=" + rectangles[i].getHeight() + ")");
            }
        }
    }
}
