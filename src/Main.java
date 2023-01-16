class Maximum {

    int a,b,c;
    Maximum(int a, int b , int c){
        this.a =a ;
        this.b = b;
        this.c = c;
        System.out.println("The numbers are : " + a + " " + b + " " +c);

        if((this.a > this.b) && (this.a > this.c))
        {
            System.out.println(a + " is the greatest");
        }
        else if( this.b > this.c)
        {
            System.out.println(b + " is the greatest");
        }
        else
        {
            System.out.println(c + " is the greatest");
        }

    }

}
public class Main {
    public static void main(String[] args) {
        Maximum m1 = new Maximum(10,52,99);


    }
}