/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/4/2015
 */
public class Ch8 {
    public class point {
        int x;
        int y;

        // returns the distance between this point and (0,0)
        //    ACCESSOR METHOD
        public double distanceFromOrigin() {
            return Math.sqrt(x * x + y * y);
        }

        public void translate(int dx, int dy) {
            x += dx;
            y += dy;
        }
    }

/*    public static void main(String[] args){
        Point p1 = new Point();
        p1.x = 7;
        p1.y = 2;

        p1.translate(11,6);

        System.out.println("Distance from origin = " + p1.distanceFromOrigin());
    }*/
}

