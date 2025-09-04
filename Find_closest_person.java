public class Find_closest_person {
    public static int findClosest(int x, int y, int z) {
        int dx = Math.abs(x - z); 
        int dy = Math.abs(y - z); 

        if (dx < dy) {
            return 1; 
        } else if (dy < dx) {
            return 2; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) { 
        System.out.println(findClosest(5, 9, 7)); 
        System.out.println(findClosest(8, 6, 7)); 
        System.out.println(findClosest(3, 10, 7)); 
        System.out.println(findClosest(10, 5, 7)); 
        System.out.println(findClosest(3, 12, 7)); 
    }
}
