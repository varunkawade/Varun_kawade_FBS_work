
class Test {

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			
			int c=a/b;
			System.out.println("Result:"+c);
			
		}//try ends here
       catch(NumberFormatException nfe)
		{
    	   System.out.println("please provide only numbers as inputs");
    	   
		}
		 catch(ArrayIndexOutOfBoundsException aioo)
		{
    	   System.out.println("please provide minium two arguements ");
    	   
		}
		 catch(ArithmeticException ae)
		{
    	   System.out.println("please don't give second arguement  as 0");
    	   
		}
		catch(Exception e) {
			System.out.println("oops something went wrong");
		}
	}// main ends here 

}
