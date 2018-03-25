/**
 * Created by Mirza Radoncic on 3/22/2018.
 */

public class Animate implements Runnable{
	BlockBreakerPanel bp;
	
	Animate(BlockBreakerPanel b){
		bp = b;
	}
	public void run(){
		while(true){
			bp.update();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
