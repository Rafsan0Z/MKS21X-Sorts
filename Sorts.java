import java.util.Random;
public class Sorts {

  public static void selectionSort(int[] ary) {
    int index = ary.length - 1;
    for(int i = 0; i <= index; i++ ) {
      int min = ary[i];
      int place = i;
      for(int j = i + 1; j <= index; j++) {
        if(ary[j] < min) {
          min = ary[j];
          place = j;
        }
      }
      int shift = min;
      ary[place] = ary[i];
      ary[i] = shift;
    }
  }

  public static void bubbleSort(int[] ary) {
    for(int j = 0; j < ary.length; j++) {
    for(int i = 0; i < ary.length - 1; i++) {
      int num1 = ary[i];
      int num2 = ary[i+1];
      if(ary[i] > ary[i+1]) {
        ary[i] = num2;
        ary[i+1] = num1;
      }
    }
  }
}

  public static void insertionSort(int[] ary) {
    for(int i = 0; i < ary.length; i++) {
      int current = ary[i];
      int place = i;
      while(place != 0 && ary[place - 1] > current) {
        ary[place] = ary[place - 1];
        ary[place - 1] = current;
        place--;
      }
    }
  }

  public static String toString(int[] data) {
   int size = data.length;
   String result = "[";
   for(int i = 0; i <size ; i++) {
     if(i==0) {result += data[0];}
     if(i!=0) {result += " " + data[i];}
     if( i != size - 1) {
       result += ",";
     }
   }
   return result + "]";
 }

  public static void main(String[] args) {
    Random randgen = new Random();
    int len = 100000;
    int[] data3 = new int[len];
    for(int i = 0; i < len; i++) {
      data3[i] = 0;
    }
    int[] data = new int[] {15,3,67,13,4,25,12};
    int[] data2 = new int[] {542,45,78,987,15,-3,67,13,4,-827,25,12,45,2,34,12,68,41,5,89,209,9,32,89,90,-982,99,97,95,92,121,120,118,104,109};
  //  insertionSort(data);
    selectionSort(data2);
//    bubbleSort(data3);
//    System.out.println(toString(data));
//    System.out.println(toString(data2));
    boolean result = true;
    for(int i = 0; i < len; i++) {
      if(data3[i] != 0) {
        result = false;
        break;
      }
    }
    System.out.println(toString(data2));
  }

}
