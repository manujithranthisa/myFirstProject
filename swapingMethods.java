class Example{
	public static void main(String []args){
		
		swap1();
		swap2();
	    swap3();
	  }
	  
		
	public static void swap1(){
	
	System.out.println("First method");
	
	int a = 20;
	int b = 30;
	
	System.out.println("a :"+a+"b :"+b);
	
	int tmp = a;
	a=b;
	b=tmp;
	System.out.println("a :"+a+"b :"+b);
	
	} 
public static void swap2(){
	
	System.out.println("Second method");
	
	int a = 20;
	int b = 30;
	
	System.out.println("a :"+a+"b :"+b);
	a += b; //a=a+b 
	b = a -b;
	a-=b; //a=a-b
	
	System.out.println("a :"+a+"b :"+b);
	
} 
public static void swap3(){
	
	System.out.println("Third method");
	
	int a = 20;
	int b = 30;
	
	System.out.println("a :"+a+"b :"+b);
	
	
	a^=b;
	b^=a;
	a^=b;
	
	
	System.out.println("a :"+a+"b :"+b);
	
} 

}
