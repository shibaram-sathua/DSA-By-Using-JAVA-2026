package generics;
class FirstBox{
   private Object value;
   public FirstBox(Object value){
       this.value = value;
   }
   public Object getValue(){
       return this.value;
   }

}
public class GenericBox {
    public static void main(String[] args){
        FirstBox f = new FirstBox(6);
        FirstBox f2 = new FirstBox("SHibram sathua");

    }
}
