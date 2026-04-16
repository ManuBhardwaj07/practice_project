class D {
    public static void main(String[] args) {
        // X1 x;    
        // X1 x = new X1();  // not ok
        
        // X1 x = new X2();

        X1[] y = new X1[4];
    }    
}

interface X1 {

}

class X2 implements X1 {

}