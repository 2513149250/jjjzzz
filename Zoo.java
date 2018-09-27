import  java.awt.print.Printable ;
public class Zoo{

public void hitChild(){
System.out.println("动物园里有什么");
}
}












public class Test{
public static void main(String args[]){
 Zoo Zoo;
Zoo = new Son1();
Zoo.hitChild();
Zoo = new Son2();
Zoo.hitChild();
Zoo = new Son3();
Zoo.hitChild();
}
}
