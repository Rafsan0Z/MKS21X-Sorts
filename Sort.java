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

  public static void main(String[] args) {
    int[] data = new int[] {15,3,67,13};
    System.out.println(data);
  }

}
