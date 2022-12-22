public class arrays {

  public static void main(String[] args) {

    int[] num= new int[5];  //storing 5 elements/values/memory locations
    String[] name = {"one","two","three"};

    for(int i=0; i<num.length;i++) {
      num[i]=i;

      }//for loop to write each number for me
      for(int i=0; i<num.length;i++) {
        System.out.println(num[i]);
  }
  for(int i=0; i<num.length;i++) {
    System.out.println(num[i]+"");
}

    System.out.println(name[1]);



  }}
