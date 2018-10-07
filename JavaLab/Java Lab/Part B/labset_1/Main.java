import java.util.* ; 

class Main{
	public static void main(String[] args) {
		
		MultiThread t1 = new MultiThread("one" ,8) ; 
		MultiThread t2 = new MultiThread("two" , Thread.MAX_PRIORITY) ; 
		MultiThread t3 = new MultiThread("three" , Thread.MIN_PRIORITY+1) ; 
		MultiThread t4 = new MultiThread("four" , Thread.MIN_PRIORITY+5) ; 
		MultiThread t5 = new MultiThread("five" , Thread.MIN_PRIORITY+6) ;
		 

		util.print("\nStarting thread 1 ") ; t1.start() ;  
		util.print("\nStarting thread 2 ") ; t2.start() ;  
		util.print("\nStarting thread 3 ") ; t3.start() ;  
		util.print("\nStarting thread 4 ") ; t4.start() ;  
		util.print("\nStarting thread 5 ") ; t5.start() ;

		Thread threads[] = new Thread[]{t1 , t2 , t3 , t4 , t5} ;
		for(Thread t : threads){
			sleep(200) ; 
			util.print("thread " + t+  " priority : " + t.getPriority()) ; 
		}

		for(Thread t : threads){
			sleep(200) ; 
			util.print("thread " + t+  " " + t.isAlive()) ; 
		}

		for(Thread t : threads){
			try{
				t.join() ;
			}
			catch(InterruptedException E){
				util.print(E) ;
			} 
		}

		util.print("\nLong lasting thread is : " + t1.last) ; 
	}

	public static void  sleep(int a){
		try{
			Thread.sleep(a) ; 
		}
		catch(InterruptedException E){
			util.print(E) ; 
		}
	}

}


class MultiThread extends Thread{

	int priority  ; String name  ;
	public int pri  ;  
	static String last ; 
	
	public String toString(){
		return name + " : " + priority ; 
	}

	MultiThread(String name , int p ){
		this.name = name ; 
		this.priority = this.pri = p ;
		this.setPriority(p);
	}

	public void run(){
		System.out.println("isAlive : " + this.isAlive()) ; 

		if(priority==9 || priority==10){
			util.print("\nThread "+name + " with priority : "+priority+ " is going to sleep")  ; 
			try{
				this.sleep(2000) ;
			}
			catch(InterruptedException E){
				util.print(E) ; 
			}
		}
		util.print("Thread " + name + " ending ... ") ; 
		last =name ;
	}
}



class util{
	static void print(Object s){System.out.println(s) ; }
}