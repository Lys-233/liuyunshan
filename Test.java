package computer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cpu cpu=new Cpu();
		cpu.setSpeed(2200);
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		Pc pc=new Pc();
		pc.setCpu(cpu);
		pc.setHD(disk);
		pc.show();
	}

}
