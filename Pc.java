package computer;

public class Pc {
	int price;
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
			System.out.println("����Ҫ��");
		}else {
			System.out.println("���ʺ�");
		}
		
	}
	public void show(){
	System.out.println("cpu���ٶ��ǣ�"+cpu.getSpeed());	
	System.out.println("cpu�������ǣ�"+HD.getAmount());	
	}
	public static void main(String[] args) {
		Pc pc=new Pc(4000,"����");
		pc.judge(pc.brand);
		
	}

}
