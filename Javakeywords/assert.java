public class Main {
  public static void main(String[] args) {
    // Enable assertions
    ClassLoader loader = ClassLoader.getSystemClassLoader();
    loader.setDefaultAssertionStatus(true);
    
    // Run the assert example
    AssertExample example = new AssertExample();
    example.run();
  }
}
