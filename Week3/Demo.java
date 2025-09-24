package Week3;

public class Demo {
    public static void main(String[] args) {
        Instructor JavaInst = new Instructor("Cameron", "Boyer", "G102");
        System.out.println(JavaInst);

        TextBook javaBook = new TextBook("intro to Java", "Dietel", "Pearson");
        System.out.println(javaBook);

        Course AdvanceJava = new Course("Advanced Programming Using Java", JavaInst, javaBook);
        System.out.println(AdvanceJava);
        
    }
    
}
