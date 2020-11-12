public class Test2 {
  public static void main(String[]args){
    try {
      SuperArray bopp = new SuperArray(-10);
    }
    catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
    SuperArray words = new SuperArray(5);
    words.add("Delta");
    words.add("Epsilon");
    words.add("Zeta");
    words.add("Eta");
    words.add("Theta");
    words.add("Iota");
    words.add("Kappa");
    words.add("Lambda");

    try {
      words.get(10);
    }
    catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      words.get(-2);
    }
    catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }



    try {
      words.set(-2, "Hello");
    }
    catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      words.set(10, "Hello");
    }
    catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }


    try {
      words.add(-5, "Hello");
    }
    catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      words.add(9, "Hello");
    }
    catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }

    try {
      words.remove(-1);
    }
    catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      words.remove(30);
    }
    catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }


  }
}
