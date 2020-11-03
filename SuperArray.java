public class SuperArray {
  private String [] data;
  private int size; //The current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }


  public int size() {
      return this.size;
  }

  public boolean add(String element) {
    data[size] = element;
    size ++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }
}
