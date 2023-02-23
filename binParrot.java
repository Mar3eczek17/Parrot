// Task: A parrot has lived less than 100 years (input data) and can only answer 
// "yes" and "no" to questions. Develop a program that determines how many questions 
// to ask the parrot to find out its age?

public class Parrot {
    
 	public int binParrot(int max_age) {
 	    String max = String.format("%s", Integer.toBinaryString(max_age));

        return max.length();
 	}

    public static void main(String[] args) {
        Parrot p = new Parrot();
        
        int binParrot = p.binParrot(100);
        
        System.out.println("Rekurencją: " + binParrot);
    }
}
