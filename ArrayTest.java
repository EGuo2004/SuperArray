public class ArrayTest {
  public static void main(String[]args){

    SuperArray words = new SuperArray();
    System.out.println(words.size());

    words.add("kani");
    words.add("uni");
    words.add("ebi");

    System.out.println(words.size());
    System.out.println(words.get(0));
    System.out.println(words.get(1));
    System.out.println(words.get(2));

    words.set(0, "Alpha");
    words.set(1, "Beta");
    // System.out.println(words.get(0));
    // System.out.println(words.get(1));
    words.set(2, "Gamma");

    words.add("Delta");
    words.add("Epsilon");
    words.add("Zeta");
    words.add("Eta");
    words.add("Theta");
    words.add("Iota");
    words.add("Kappa");
    words.add("Lambda");

    System.out.println(words.size());
    System.out.println(words.get(10));

    for(int current = 0; current < words.size(); current++){
    System.out.print(words.get(current) + " ");
  }

  }
}




// Test Case 1: Credit to Ivan Wei
// Results : Sucess
// public class ArrayTest {
//     public static void main(String[] args) {
//         SuperArray words = new SuperArray();
//         words.add("kani");
//         words.add("uni");
//         words.add("ebi");
//         for(int i = 0; i < words.size(); i++){
//             System.out.println( words.get(i) );
//         }
//
//         for(int i = 0; i < 10; ++i) {
//             words.add("mhm");
//         }
//
//         for(int i = 0; i < words.size(); ++i) {
//             if(!words.get(i).equals("mhm")) {
//                 System.out.println("Don't say " + words.set(i, "hmh") + "!");
//             }
//             System.out.println( words.get(i) );
//         }
//     }
// }
