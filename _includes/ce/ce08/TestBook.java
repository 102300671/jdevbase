package ce.ce08;

public class TestBook {
    public static void main(String[] args) {
        Book javaBook = new Book();
        Book cBook = new Book(2,"C",20,"Mr.Zhang");
        Book webBook = new Book(3,"web");
        javaBook.setId(1);
        javaBook.setName("Java");
        javaBook.setAuthor("Mr.Wang");
        javaBook.setPrice(30);
        System.out.println(cBook.getName());
        System.out.println(webBook.getId());
        System.out.println(javaBook.display());
        System.out.println(cBook.display());
        System.out.println(webBook.display());
    }

}
class Book {
    //属性
    private int id;  //编号
    private String name; //书名
    private double price; //价格
    private String author; //作者

    //构造方法
    public Book() {}
    public Book(int id, String name, double price, String author) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.author = author;
    }
    public Book(int id, String name) {
      this.id = id;
      this.name = name;
    }
    

    
         //置取方法
    public void setId(int id) {
      this.id = id;
    }
    
    public int getId() {
      return this.id;
    }
    
    public void setName(String name) {
      this.name = name;
    }
    
    public String getName() {
      return this.name;
    }
    
    public void setPrice(double price) {
      this.price = price;
    }
    
    public double getPrice() {
      return this.price;
    }
    
    public void setAuthor(String author) {
      this.author = author;
    }
    
    public String getAuthor() {
      return this.author;
    }
    //display方法
    public String display() {
        return id+"\t"+name+"\t"+price+"\t"+author;
    }
}