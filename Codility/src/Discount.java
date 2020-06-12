class Discount
{
	
	public static double getRegularDiscount(double markedprice){
		double  dis,amount,s;
        
		//markedprice=1000;
	 if(markedprice > 5000 && markedprice <= 10000){
		 dis=10;
	 }else if(markedprice > 10000){
		 dis=20;
	 }else{
		 dis=0;
	 }
	       // dis=25;  // 25 mean 25%			
		
		System.out.println("markedprice= "+markedprice);
	 
		System.out.println("discount rate="+dis);
	         
	        s=100-dis;
	 
		amount= (s*markedprice)/100;
	 
		System.out.println("amount after discount="+amount);
		return amount;
	}
	
	public static double getPremiumDiscount(double markedprice){
		double  dis,amount/*,markedprice*/,s;
        
		//markedprice=1000;
		if(markedprice > 4000 && markedprice <= 8000){
			 dis=15;
		 }else if(markedprice > 8000 && markedprice <= 12000){
			 dis=20;
		 }else if(markedprice > 12000){
			 dis=30;
		 }else{
			 dis=10;
		 }
	        //dis=25;  // 25 mean 25%			
		
		System.out.println("markedprice= "+markedprice);
	 
		System.out.println("discount rate="+dis);
	         
	        s=100-dis;
	 
		amount= (s*markedprice)/100;
	 
		System.out.println("amount after discount="+amount);
		return amount;
	}

	public static void main(String args[])
	{
		getRegularDiscount(5000);
		getRegularDiscount(10000);
		getRegularDiscount(15000);
		
		getPremiumDiscount(4000);
		getPremiumDiscount(8000);
		getPremiumDiscount(12000);
		getPremiumDiscount(20000);
 
	}
}