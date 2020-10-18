# 计G201 刘芸杉 2020322058
## Java第一次项目
## 实验目的
1. 会使用set、get方法
2. 认识有参与无参构造方法
3. 掌握四个权限修饰符的用法
##  实验过程
- 创建Pc、Cpu、HardDisk、Test类，其中Test是主类
- Pc类中设置price，brand，cpu，HD四个属性；设置set，get方法赋值与取值；定义judge方法与show方法；定义Pc的无参，有参构造方法；创建主方法，实例化Pc对象来调用judge方法
- Cpu类中设置price，tempereture，speed三个属性；设置set，get方法；定义无参，有参构造方法
- HardDisk类中设置storage，brand，amount三个属性，设置set，get方法；定义无参，有参构造方法
- Test主类中创建并实例化Pc,HardDisk,Cpu对象;调用set方法给属性赋值；Pc调用show方法来输出CPU的速度与硬盘的容量
##  核心方法
1. Pc类中的judge方法
```
public void judge(String brand) {
		if(brand=="intel") {
			System.out.println("符合要求");
		}else {
			System.out.println("不适合");
		}
		
	}
```
2. Pc类中的show方法
```
public void show(){
	System.out.println("cpu的速度是："+cpu.getSpeed());	
	System.out.println("cpu的容量是："+HD.getAmount());	
	}
```
3. 无参与有参构造方法
```
Cpu(){
		
	}
 Cpu(int price,float tempereture){
		this.price=price;
		this.tempereture=tempereture;
	}
```
##  实验结果
1. 在Test主类中输出cpu的速度与硬盘的容量
2. 在Pc类中输出关于pc的price属性的判断结果
![](http://m.qpic.cn/psc?/V54U1qac1nH2Bq3wTQ3r00vbPG3I5Nww/ruAMsa53pVQWN7FLK88i5sALy5jL.n2mbEqNSFFpqYdUVBXbXGmiKCDmouN7LER19WU3L*x.SMU44.AGJSry0wPsDtRa6do9eD*Od2RHvu8!/mnull&bo=3wKkAN8CpAADCSw!&rf=photolist&t=5)
![](http://m.qpic.cn/psc?/V54U1qac1nH2Bq3wTQ3r00vbPG3I5Nww/ruAMsa53pVQWN7FLK88i5o2YjWV5RViRxq0.0r52cW9R.frcBuN*H7a2.nzf1xSha652AZhTOLVMZMA3*.WdRK6ZgLH7cAfaQk*5DJoFxME!/mnull&bo=wgFfAQAAAAADB78!&rf=photolist&t=5)
##  实验感想
通过此次实验明白了在某个类中定义的对象如何被其他类调用并掌握构造方法的使用。
