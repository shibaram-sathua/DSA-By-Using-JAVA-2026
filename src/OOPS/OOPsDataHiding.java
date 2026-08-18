package OOPS;
class Rectangle{
    private int length;
    private int width;
    //these are property methods
    void setLength(int length){
        if(length < 0){
            length = 0;
        }
        this.length = length;
    }
    void setWidth(int width){
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }
    public int area(){
        return width * length;
    }
}

public class OOPsDataHiding {
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(23);
        int ans = rect.area();
        System.out.println(ans);
    }

}
