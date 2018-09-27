import  java.awt.print.Printable ;

公共 类 动物园 {


	public  Zoo（String  name，String  eat，String  cry）{
		super（）;
		name = name;
	
	}
	
	public  void  print（）{
		系统。出。println（name + “：” + eat + “  ” + cry）;
	}
	public  static  void  main（String [] args）{
		狗的狗=  新的 狗（“狗”，“二狗子”，“三狗”，3）;
		狗。打印（）;
		Cat cat =  new  Cat（“ 猫 ”，“二猫”，“三猫”，5）;
		猫。打印（）;
		鱼鱼=  新 鱼（“大鱼”，“中鱼”，“LHS”，2）;
		鱼。打印（）;
	    Rabiit rabiit =  new  Rabiit（“ 444 ”，“333”，“22”，1）;
		rabiit 。打印（）;
	}

}
