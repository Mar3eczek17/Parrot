// Task: A parrot has lived less than 100 years (input data) and can only answer 
// "yes" and "no" to questions. Develop a program that determines how many questions 
// to ask the parrot to find out its age?

public class Rekurencja {
    
 	public int parrot(int max_age, int x) {
        x = x+1;
 		if(max_age>1) {
 			return parrot(max_age/2,x);
 		} else {
 			return x;
 		}
 	}

    public static void main(String[] args) {
        Parrot p = new Parrot();
        int parrot;
        
        parrot = p.parrot(100,0);
        
        System.out.println("Rekurencja: "+parrot);
    }
}
