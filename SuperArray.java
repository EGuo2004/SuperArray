public class SuperArray {
  private String [] data;
  private int size; //The current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }


  public int size() {
      return size;
  }

  public boolean add(String element) {
    if (size + 1 >= data.length) {
      resize();
    }
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
    String [] tempArray = new String[size + 10];
    for(int i = 0; i < data.length; i++) {
      tempArray[i] = data[i];
    }
    data = tempArray;
  }

  public boolean isEmpty() {
    return size==0;
  }

  public void clear() {
    data = new String[size];
    size = 0;
  }

  public String toString() {
    String CurrentArray = "";
    for(int current = 0; current < size(); current++){
      if (current + 1 < size()) {
        CurrentArray += get(current) + ", ";
      } else {
        CurrentArray += get(current);
      }
    }
    return "{" + CurrentArray +"}";
  }
}
