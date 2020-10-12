package computer;

public class HardDisk {
	float storage;
	String brand;
	int amount;
	public float getStorage() {
		return storage;
	}
	public void setStorage(float storage) {
		this.storage = storage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
		HardDisk(){
			
		}
		HardDisk(float storage,String brand){
			this.storage=storage;
			this.brand=brand;
		}
		public int getAmount() {
			return amount;
		}

		public void setAmount(int m) {
			this.amount = m;
		}
		
}
