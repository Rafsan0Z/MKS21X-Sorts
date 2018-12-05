public class Sort {

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

  public stati void selectionSort(int[] ary) {
    
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
    int[] data = new int[] {15,3,67,13,4,25,12};
    int[] data2 = new int[] {15,3,67,13,4,25,12,45,2,34,12,68,49,32,89,90,99,97,95,92,121,120,118,104,109};
    selectionsort(data);
    selectionsort(data2);
    System.out.println(toString(data));
    System.out.println(toString(data2));
  }

}
