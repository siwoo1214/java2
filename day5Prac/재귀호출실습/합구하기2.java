package day5Prac.재귀호출실습;

public class 합구하기2 {
	public static void main(String[] args) {
		int result = getTotal(5);
		System.out.println(result);
	}
	
	static int getTotal(int n) {
		if(n==1) {
			return 1;
		} else {
			return n+getTotal(n-1);
		}
	}
	
	//getTotal(5)  =>  5+getTotal(4)  => 5+4+getTotal(3)   .....  => 5+4+3+2+1
	
	//  getTotal(5)   =>            5    =>  return   5+ getTotal(4) ;	
	    //  4    =>  return   4+ getTotal(3) ;
	    //  3    =>  return   3+ getTotal(2) ;
	    //  2    =>  return   2+ getTotal(1);	
	   //   1     => return 1;
	
	
	
	//  getTotal(5)   =>            5    =>  return   5+ 10 ;	
	    //  4    =>  return   4+ 6 ;
	    //  3    =>  return   3+ 3 ;
	    //  2    =>  return   2+1; 
	
	   //   1     => return 1;
	
	
	
	
	//     5+4까지합
	//     4+3까지합
	//     3+2까지합
	//     2+1까지합
	//     1 =>1
}
