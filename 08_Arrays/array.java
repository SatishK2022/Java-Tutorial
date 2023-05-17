public class array {
    public static void main(String[] args) {
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int []marks;
        // marks = new int[5];

        // Initialisation
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 80;

        // 3. Declaration, memory allocation and initialization together
        int []marks = {45, 56, 34, 98, 89};

        System.out.println(marks[3]);
    }
}
