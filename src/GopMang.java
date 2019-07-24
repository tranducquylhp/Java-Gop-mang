import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        int[] arr2 = new int[7];
        int[] arr3 = new int[arr1.length+arr2.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mang thu nhat");
        for (int i=0; i<arr1.length; i++){
            System.out.print("Nhap phan tu thu "+i+" = ");
            arr1[i] = scanner.nextInt();
            arr3[i] = arr1[i];
        }

        System.out.println("Nhap mang thu hai");
        for (int i=0; i<arr2.length; i++){
            System.out.print("Nhap phan tu thu "+i+" = ");
            arr2[i] = scanner.nextInt();
            arr3[arr1.length+i] = arr2[i];
        }

        System.out.print("Mang thu nhat la: ");
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("Mang thu hai la: ");
        for (int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.print("Mang sau khi gop la: ");
        for (int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
