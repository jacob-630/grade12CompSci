package java;

public class day01{
    public static void main(String[] args) {
        float a = 87f;
        float b = 12f;
        float c = 123f;
        a = (int)a;
        b = (int)b;
        c = (int)c;

        float add = Math.round((a + b)*10)/10;
        float sub = Math.round((a - b)*10)/10;
        float mult = Math.round((a * b)*10)/10;
        double divi = a / b;
        double pyt = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println("The sum of these numbers is " + add);
        System.out.println("The difference of these numbers is " + sub);
        System.out.println("The product of these numbers is " + mult);
        System.out.println("The quotient of these numbers is " + divi);
        System.out.println("Using a and b in the pythagorean equation results in " + pyt);


    }
    
};