import  java.awt.print.Printable ;
public class Father{
//父类有一个打孩子方法
public void hitChild(){
System.out.println("爸爸打儿子天经地义");
}
}












public class Test{
public static void main(String args[]){
Father father;
father = new Son1();
father.hitChild();
father = new Son2();
father.hitChild();
father = new Son3();
father.hitChild();
}
}
