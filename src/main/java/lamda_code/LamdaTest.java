package lamda_code;


import java.util.function.Function;

public class LamdaTest {
    
    
    public static String test(Function<String,String> a) {
    
        System.out.println(a.apply("adad"));
        
        return  a.apply("ans");
        
       
    }
    
    public static void main(String[] args) {
    
    
        System.out.println("start");
    
        System.out.println(test((a->a + " " + "anshul")));
        
        
    }
}
