package MIIT.com.cal;

public class Calculator{
	public static float add(float a,float b) {
    	return a+b;
    }

    public static float sub(float a,float b) {
    	return a-b;
    }
    public static float mul(float a,float b) {
    	return a*b;
    }
    public static float div(float a,float b) {
    	if (b==0) {
    		System.out.println("You Enter Zero ");
    		return 0;
    	}
    	return a/b;
    }
	
}