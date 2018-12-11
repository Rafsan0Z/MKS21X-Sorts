import java.util.Random;
public class Sorts {

  public static void selectionsort(int[] ary) {
    int index = ary.length - 1;
    for(int i = index; i >= 0; i--) {
      int max = 0;
      int place = 0;
      int num = 0;
      for(int j = i; j >= 0; j--) {
        if(max < ary[j]) {
          max = ary[j];
          place = j;
          num = ary[i];
        }
      }
      ary[i] = max;
      ary[place] = num;
    }
  }

  public static void selectionSort(int[] ary) {
    int index = ary.length - 1;
    for(int i = 0; i <= index; i++ ) {
      int min = ary[i];
      int num = 0;
      int place = 0;
      for(int j = i + 1; j <= index; j++) {
        if(ary[j] < min) {
          min = ary[j];
          place = j;
          num = ary[i];
        }
      }
      ary[i] = min;
      ary[place] = num;
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
    int[] data3 = new int[100];
    for(int i = 0; i < 100; i++) {
      data3[i] = randgen.nextInt() % 3;
    }
    int[] data = new int[] {15,3,67,13,4,25,12};
    int[] data2 = new int[] {542,45,78,987,15,-3,67,13,4,-827,25,12,45,2,34,12,68,41,5,89,209,9,32,89,90,-982,99,97,95,92,121,120,118,104,109};
    insertionSort(data);
    bubbleSort(data2);
    bubbleSort(data3);
    System.out.println(toString(data));
    System.out.println(toString(data2));
  //  System.out.println(toString(data3));
  }

}
