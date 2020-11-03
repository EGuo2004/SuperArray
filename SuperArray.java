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

  public String set(int index, String element) {
    data[index] = element;
    return data[index];
  }

  public void resize() {
    tempArray = new String[size + 10];
    for(int i = 0; i < data.length; i++) {
      tempArray[i] = data[i];
    }
    data = tempArray;
  }
}
