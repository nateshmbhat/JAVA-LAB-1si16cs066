import java.util.* ;

class Item{
	boolean valueSet = false ; 
	int item = 0 ; 

	synchronized public void consume(){
		while(!valueSet)
		{
			
					try{
						wait() ; 
					}
					catch(InterruptedException E){
						;
					}

		}
		System.out.println("Consumed : "  + item ) ; 
		valueSet = false ;
		notify();
	}

	synchronized public void produce(int n ){
		while(valueSet){
			try{
				wait() ; 
			}
			catch(InterruptedException E){
				;
			}
		}

		item = n ;
		System.out.println("Produced : "  + item ) ; 
		valueSet = true ;
		notify() ; 
	} 
}

class Producer implements Runnable{
	Item item ; 
	Producer(Item itemobj){
	item = itemobj ;
 }

 public void run(){
 	while(true){
 	item.produce((int)(Math.random()*100)) ; 
 	}
 }

}

class Consumer implements Runnable{
	Item item  ;
	Consumer(Item itemobj){item = itemobj ; }

	public void run(){
		while(true){
		item.consume() ; 
			
		}
	}
}


class Main{
	public static void main(String[] args) {
		Item item = new Item() ;
		Thread consumer = new Thread(new Consumer(item)) ; 
		Thread producer = new Thread(new Producer(item)) ;
		System.out.println("\nStarted producer and consumer threads : ") ; 
		consumer.start() ; 
		producer.start() ; 
	}
}