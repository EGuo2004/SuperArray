public class SuperArray {
  private String [] data;
  private int size; //The current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity >= 0) {
      data = new String[initialCapacity];
      size = 0;
    }
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
    String returnString = data[index];
    data[index] = element;
    return returnString;
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
    return "[" + CurrentArray +"]";
  }

  public void add(int index, String element) {
    for(int i = size - 1; i >= index; i-- ) {
      data[i + 1] = data[i];
    }
    data[index] = element;
    size ++;
  }

  public String remove(int index) {
    String returnValue = data[index];
    for (int i = index; i < size() - 1; i++ ) {
      data[i] = data[i + 1];
    }
    data[size() - 1] = null;
    size--;
    return returnValue;
  }

  public int indexOf (String s) {
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String [] rArray = new String[size];
    for (int i = 0; i < size; i++) {
      rArray[i] = data[i];
    }
    return rArray;
  }

  public boolean contains(String s) {
    boolean contained = false;
    for(int i = 0; i < size; i++) {
      if ((data[i].equals(s)) && (data[i] != null)) {
        contained = true;
      }
    }
    return contained;
  }

  public int lastIndexOf(String value){
    int x = -1;
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(value)) {
        x = i;
      }
    }
    return x;
  }
}
