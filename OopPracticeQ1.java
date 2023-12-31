import java.util.Scanner;

public class OopPracticeQ1 {
    public static void main(String[] args) {
        complex obj = new complex();
        obj.setval();
        complex obj1 = new complex();
        obj1.setval();
        System.out.print("The addition of the complex numbers : " );
        obj.add(obj1).display();
        System.out.print("The Subtraction of the complex number is : ");
        obj.sub(obj1).display();
        System.out.print("The product of the complex numbers is : ");
        obj.product(obj1).display();
    }
}
class complex {
    private int real = 0, imaginary = 0;
    void setval(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real part of the complex number. : ");
        this.real = sc.nextInt();
        System.out.println("Enter Imaginary part of the complex number : ");
        this.imaginary = sc.nextInt();
    }
    complex add(complex obj){
        complex obj2 = new complex();
        obj2.real = this.real + obj.real;
        obj2.imaginary = this.imaginary + obj.imaginary;
        return obj2;
    }
    complex sub(complex obj){
        complex obj2 = new complex();
        obj2.real = this.real - obj.real;
        obj2.imaginary = this.imaginary - obj.imaginary;
        return obj2;
    }
    complex product(complex obj){
        complex obj2 = new complex();
        obj2.real = this.real * obj.real;
        obj2.imaginary = this.imaginary * obj.imaginary;
        return obj2;
    }
    void display(){
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}