public class Area {
    static double triangle(int height,int base){
        double area =.5 * base * height;
        // System.out.println(area);
        return area;
    }
    static int square(int height){
        int area = height * height;
        return area;
    }
    static int rectangle(int length,int bredth){
        int area = length * bredth;
        return area;
    }
    static float circle(float redius){
        float area = 3.142f * redius*redius;
        return area;
    }
    public static void main(String[] args) {
        int height = 10,base=20,redius=30,bredth=20,length=40;
        System.out.println(triangle(height, base));
        System.out.println(square(height));
        System.out.println(rectangle(length, bredth));
        System.out.println(circle(redius));
    }
}
