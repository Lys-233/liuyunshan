package computer;

public class Pc {
	private int price;
	String brand;
	Cpu cpu;
	HardDisk HD;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu c) {
		this.cpu =c;
	}
	public HardDisk getHD() {
		return HD;
	}
	public void setHD(HardDisk h) {
		HD = h;
	}
	Pc(){
		
	}
	Pc(int price,String brand){
		this.brand=brand;
		this.price=price;
	}
	public void judge(String brand) {
		if(brand=="intel") {
			System.out.println("符合要求");
		}else {
			System.out.println("不适合");
		}
		
	}
	public void show(){
	System.out.println("cpu的速度是："+cpu.getSpeed());	
	System.out.println("cpu的容量是："+HD.getAmount());	
	}
	public static void main(String[] args) {
		Pc pc=new Pc(4000,"联想");
		pc.judge(pc.brand);
		
	}

}
