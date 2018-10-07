import java.util.* ;

class Item{
	boolean valueSet = false ; 
	int item = 0 ; 

	public  void consume(){
		while(!valueSet) ;
		System.out.println("Consumed : "  + item ) ; 
		valueSet = false ;
	}

	public  void produce(int n ){
		while(valueSet);
		item = n ;
		System.out.println("Produced : "  + item ) ; 
		valueSet = true ;
	} 
}

class Producer implements Runnable{
 Item item ;
 Producer(Item itemobj){
 	item = itemobj ; 
 }

 public void run(){
 	while(true){
 		System.out.println("\nProducing ....") ; 
 	item.produce((int)Math.random()*100) ; 
 	}
 }

}

class Consumer implements Runnable{
	Item item  ;
	Consumer(Item itemobj){item = itemobj ; }

	public void run(){
		while(true){
			System.out.println("\nConsuming !") ;
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