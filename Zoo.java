import  java.awt.print.Printable ;
public class Zoo{

public void hitChild(){
System.out.println("动物园里有什么");
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
