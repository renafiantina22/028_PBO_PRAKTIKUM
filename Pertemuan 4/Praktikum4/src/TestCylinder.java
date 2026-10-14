public class TestCylinder { 
    public static void main(String[] args) { //  static adalah modifier yang digunakan untuk mendeklarasikan metode main() sebagai metode statis. Metode statis dapat dipanggil tanpa membuat objek dari kelas tersebut. Dalam hal ini, metode main() adalah titik masuk program dan akan dipanggil oleh JVM saat program dijalankan.
        Cylinder c3 = new Cylinder(2.0, 10.0); 
 
        printCylinder("c3", c3); 
    } 
 
    private static void printCylinder(String name, Cylinder c) { 
        System.out.println(name);
        System.out.println(c);
        System.out.println("radius      = " + c.getRadius()); 
        System.out.println("height      = " + c.getHeight()); 
        System.out.println("base area   = " + c.getArea()); 
        System.out.println("volume      = " + c.getVolume()); 
        System.out.println("aksesRadius = " + c.cobaAksesRadius());

        System.out.println(); 
    } 
} 