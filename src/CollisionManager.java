public class CollisionManager {
    public static boolean isColliding(Bubble b1, Bubble b2) {
        int dx = b1.x - b2.x;
        int dy = b1.y - b2.y;
        int distance = (int) Math.sqrt(dx*dx + dy*dy);
        return distance < b1.radius * 2;
    }
}
