public class ShortestPath {
    public static float shrtpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            }
            // South
            else if (dir == 'S') {
                y--;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
            // West
            else {
                x--;
            }
            /*
             while(x != 0 || y != 0) {
                if(x < 0) {
                    System.out.print("W ->");
                    x++;
                } else if(x > 0) {
                    System.out.print("E ->");                         code for printing the path like      NWESS
                    x--;
                }
                if(y < 0) {
                    System.out.print("S ->");
                    y++;
                } else if(y > 0) {
                    System.out.print("N ->");
                    y--;
                }
            }
            */
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "NSWE";
        System.out.println("The shortest path to the destination is : " + shrtpath(path));
    }
}
