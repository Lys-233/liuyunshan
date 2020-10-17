package computer;

public class Cpu {
	private int price;
	private float tempereture;
	int speed;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getTempereture() {
		return tempereture;
	}
	public void setTempereture(float tempereture) {
		this.tempereture = tempereture;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int m) {
		this.speed = m;
	}
	Cpu(){
		
	}
	Cpu(int price,float tempereture){
		this.price=price;
		this.tempereture=tempereture;
	}
	
	

}
