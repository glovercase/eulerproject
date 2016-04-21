import java.math.BigInteger;
import java.util.TreeSet;


public class eulerp1 {

	
	public static void p1(){
		//Find the sum of all the multiples of 3 or 5 below 1000
		int MrsChicken = 0;
		for(int twat = 0; twat < 1000; twat++){
			if(twat % 3 == 0 || twat % 5 == 0){
				MrsChicken += twat;
			}
		}
		System.out.println(MrsChicken);
	}
	
	public static void p2(){
		int x = 1;
		int y = 2; 
		int sum = 0;
		while(x < 4000001){
			System.out.println(x +" "+ y +" ");
			if(x % 2 == 0){
				sum += x;
			}
			if(y % 2 == 0){
				sum += y;
			}
			int z = x + y;
			x = z;
			y += z; 
		}
		System.out.println(sum);
	}
	
	public static void p3(){
		//What is the largest prime factor of the number 600851475143 ?
		double a = 600851475143.0;
        double b = 2.0;
      //  double c = 0.0;
        while(a>1){
           if(b>(a/2)) break;
           if(a % b == 0){
        	   a = a/b;
              // c=a;
               b=2;
           }else{
               b++;
           }
         }
         System.out.println((int)a);
	}
	
	public static void p4(){
		int p = 0;
		int answer = 0;
		for(int i = 100; i<999; i++){
			for(int j = 100; j<999; j++){
				int k = i * j;
				p = check(k);
				if(answer < p){
					answer = p;
				}
			}
			
		}
		System.out.println("Found the palindrom" + answer);
	}
	
	
	private static int check(int k) {
		// TODO Auto-generated method stub
		
		String f = Integer.toString(k);
		String r = new StringBuffer(f).reverse().toString();
		if(f.equals(r)){
			
			
			return k;
			
		}
		return 0;
	}
	
	public static void p5a(){
		int number =1;
		boolean smallest = false;
		for(int i = 20; i < 999999999; i+=20){
			if(smallest){
				System.out.println(number);
				break;
			}
			for(int j =1; j < 20; j++){
				if(i%j == 0){
					number = i;
					smallest = true;
				}else{
					smallest = false;
					break; 
				}
			}
			
			
		}
	}
	
	

	
	public static void p6(){
		//Find the difference between the sum of the squares of the first one hundred natural number and the square of the sum
		long sumOfSquares = 0;
		long squareOfSum = 0;
		long sumOfNum = 0;
		for(int i =1; i < 101; i++){
			sumOfSquares += (i*i);
			sumOfNum += i;
		}
		squareOfSum = sumOfNum * sumOfNum;
		System.out.println(sumOfSquares +" and "+ squareOfSum + ". The difference is "+ (squareOfSum-sumOfSquares));
	}
	
	public static void p7(){
		//by listing the first six prime numbers: 2, 3, 5, 7, 11, 13, we can see that the 6th prime is 13.
		//What is the 10001st prime number?
		TreeSet<Double> primeSet = new TreeSet<Double>();
		//primeSet.add((double) 1);
		primeSet.add((double) 2);
		int n = 10001;
		for(double p = 3; p < Double.MAX_VALUE; p+=2){
			if(p < 9){
				primeSet.add((double) p);
			}else{
			//int s =  (int)Math.sqrt(p);
			Boolean prime = true;
			//TreeSet<Double> subPrimeSet = (TreeSet<Double>) primeSet.headSet((double)s);
			//System.out.println(s);
			for(Double f : primeSet){
				
				//System.out.println("This is  number "+p);
				//System.out.println("This is  prime is "+f);
				if(p%f == 0){
					System.out.println("This is  not prime"+p);
					prime = false;
					break;
				}		
			}
			if(prime){
				primeSet.add((double) p);
			}
			//System.out.println(primeSet.size());
			if(primeSet.size() == n){
				for(Double j :primeSet){
					System.out.println(j);
				}
				System.out.println("The nth prime number is "+ p);
				break;
			}
			}
		}
	}
	
	
	public static void p8(){
		String bignumber = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		String productsize = "";
		char nextChar;
		char zero = '0';
		BigInteger totalproduct = new BigInteger("1");
		BigInteger currentproduct = new BigInteger("1");
		for(int i =0; i < bignumber.length(); i++){
			
			char current = bignumber.charAt(i);
			
			productsize += current;
			
			//if(bignumber.charAt(i+1) == 0) return;
			//if(current == zero){
			//	nextChar = bignumber.charAt(i+1);
			//	productsize.equals(nextChar);
			//}
			//
			if(productsize.length() == 13){
				
				for(int j = 0; j < productsize.length(); j++){
					char product = productsize.charAt(j);
					
					BigInteger number = new BigInteger(Character.toString(product));
					
					currentproduct.multiply(number);
				}
				
				
				
				productsize = productsize.substring(1, productsize.length());
			}
			if(currentproduct.compareTo(totalproduct) > 0){
				totalproduct = currentproduct;
			}
			//System.out.println(currentproduct);
			currentproduct.equals("1");
		}
		System.out.println(totalproduct);
	}

	public static void main(String[] args){
		
			p5a();
	}
}
