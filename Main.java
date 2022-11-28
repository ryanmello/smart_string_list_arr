class Main {
  public static void main(String[] args) {
    SmartStringList arr = new SmartStringList(6);
    arr.add("hello");
    arr.add("hola");
    arr.add("hi");
    arr.add("wassup");
    arr.add("yes");
    arr.add("no");
    
    arr.display();
    System.out.println(arr.get(0)); // print hello
    System.out.println(arr.indexOf("hello")); // print hello
    arr.sort();
    arr.display();
    System.out.println(arr.indexOf("yes"));
    arr.display();
  }
}