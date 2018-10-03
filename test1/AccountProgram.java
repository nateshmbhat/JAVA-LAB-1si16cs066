import java.util.* ; 


class Account{
	String name , address , type , acc_number ; double initAmount , balance ; 

	Account(String name , String num , double amt){
		this.name = name ; acc_number = num ; initAmount=balance = amt ; 
	}


	Account(String name , String num ,String addr , String type ,  double bal){
		this.name = name ; acc_number = num ; balance = bal ; 
		address= addr ; this.type = type ; 
	}

	public void deposit(double amt){ balance+=amt ; } 
	public void withdraw(double amt){ 
		if(amt>balance) { System.out.println("\nNot enough balance ! " ) ; return ; }
		balance-=amt ; } 
	public double getBalance(){return balance ; } 

}

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in) ;
		Account obj = new Account("Natesh" , "abc12" , 100) ; 
		Account obj1 = new Account("Natesh" , "aab" , "Tumkur" , "FD" , 1000) ; 

		obj.deposit(200) ; obj.withdraw(100) ; 
		System.out.println("\nBalance of account abc12 = " + obj.getBalance()) ; 
		System.out.println("\nBalance of account aab = " + obj1.getBalance()) ;
		

		String number  ; double bal ;
		System.out.println("\nEnter Holder name , Account number and balance : ") ; 
		String name = scan.next() ; number = scan.next() ; bal = scan.nextDouble() ; 
		Account obj2 = new Account(name , number , bal) ; 
		int ch ; 
		double amt ; 
		while(true){
			System.out.print("1.Deposit  2.Withdraw  3.View balance : ") ; ch = scan.nextInt() ; 
			switch(ch){
				case 1:
					System.out.println("Enter amount : " ) ; amt = scan.nextDouble() ; 
					obj2.deposit(amt) ; break ;
				case 2:
					System.out.println("Enter amount : " ) ; amt = scan.nextDouble() ; 
					obj2.withdraw(amt) ; break ;
				case 3:
					System.out.println("\nBalance = " + obj2.getBalance()) ;break ; 
				case 4:
					return ; 
			}
		}

	}
}
