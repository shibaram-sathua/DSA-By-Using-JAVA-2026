public class StringBufferClass {
    public static void main(String[] args){
        //String objects are immutable
        StringBuffer sb = new StringBuffer();
        sb.append("Shibram astua");
        //it will change the original object
        System.out.println(sb.toString());
        sb.append(234);
        sb.append(45.34);
        System.out.println(sb.toString());

        StringBuffer strBuffer = new StringBuffer("This is Shibram Sathua");
        System.out.println(strBuffer.toString());


        StringBuffer str = new StringBuffer(34);
        //we can give initial capacity
        sb.append(str);
        sb.length();
        //overally it supports synchronisation
        //like it will have to wait for some time to finish one task
        // then only it will be get fninishes

    }

}
