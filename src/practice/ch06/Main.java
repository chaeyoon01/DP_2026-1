package practice.ch06;

public class Main {
    public static void main(String args[]){
        MessageBox mbox1=new MessageBox('*');
        mbox1.use("Hello, world.");

        mbox1.createCopy().use("Hello, world.");
        // mbox1.clone() 사용 불가
    }
}
