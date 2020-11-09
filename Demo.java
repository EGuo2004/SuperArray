import java.util.Arrays;
public class Demo {
  public static void main(String[]args){

    SuperArray words = new SuperArray();
    System.out.println(words.size());
    System.out.println(words.isEmpty());

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
    System.out.println(words.isEmpty());

    for(int current = 0; current < words.size(); current++){
    System.out.print(words.get(current) + " ");
  }

  System.out.println(words.size());
  words.clear();
  System.out.println(words.size());

  //Breaker Line
  SuperArray Frame = new SuperArray(50);
  Frame.add("Excalibur");
  Frame.add("Loki");
  Frame.add("Ember");
  Frame.add("Ash");
  Frame.add("Trinity");
  Frame.add("Mag");
  Frame.add("Rhino");
  Frame.add("Volt");
  Frame.add("Valkyr");
  Frame.add("Frost");
  Frame.add("Banshee");
  Frame.add("Wisp");
  Frame.add("Saryn");
  System.out.println(Frame.toString());

  //Test for Add + Shift
  Frame.add(10, "Nyx");
  System.out.println(Frame.toString());

  //Test for Remove + Shift
  Frame.remove(12);
  System.out.println(Frame.toString());

  Frame.add("Mag");
  System.out.println(Frame.toString());
  System.out.println(Frame.indexOf("Saryn"));
  System.out.println(Frame.indexOf("Mag"));
  System.out.println(Frame.indexOf("Wisp"));
  Frame.remove(13);
  System.out.println(Arrays.toString(Frame.toArray()));
  System.out.println(Frame.lastIndexOf("Wisp"));
  Frame.add("Excalibur");
  System.out.println(Frame.toString());
  System.out.println(Frame.lastIndexOf("Excalibur"));
  Frame.remove(Frame.lastIndexOf("Excalibur"));

  SuperArray EqualFrame = new SuperArray(20);
  EqualFrame.add("Excalibur");
  EqualFrame.add("Loki");
  EqualFrame.add("Ember");
  EqualFrame.add("Ash");
  EqualFrame.add("Trinity");
  EqualFrame.add("Mag");
  EqualFrame.add("Rhino");
  EqualFrame.add("Volt");
  EqualFrame.add("Valkyr");
  EqualFrame.add("Frost");
  EqualFrame.add("Nyx");
  EqualFrame.add("Banshee");
  EqualFrame.add("Saryn");
  System.out.println(Arrays.toString(EqualFrame.toArray()));
  System.out.println(Frame.equals(EqualFrame));
  System.out.println(Frame.equals(words));

  SuperArray Dupe = new SuperArray();
  Dupe.add("a");
  Dupe.add("a");
  Dupe.add("a");
  Dupe.add("a");
  Dupe.add("a");
  Dupe.add("b");
  Dupe.add("b");
  Dupe.add("b");
  Dupe.add("c");
  System.out.println(Dupe);
  removeDuplicates(Dupe);
  System.out.println(Dupe);

  EqualFrame.add("Nyx");
  EqualFrame.add("Nyx");
  EqualFrame.add("Nyx");
  EqualFrame.add("Nyx");

  SuperArray EF = new SuperArray();
  EF.add("Wisp");
  EF.add("asd");
  EF.add("Nyx");
  EF.add("shvcjxc");
  EF.add("Frost");
  EF.add("sjdvjxcjvbjcvi");
  System.out.println(Dupe);
  System.out.println(findOverlap(EqualFrame, EF));
  }

  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size(); i++) {
      if (i != s.indexOf(s.get(i))) {
        s.remove(i);
        i--;
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray OL = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) {
        OL.add(a.get(i));
      }
    }
    removeDuplicates(OL);
    return OL;
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
