public class Zahlenfilter{
  public static void filter(int von, int bis){
    for(int i=von; i<bis ; i++){
      System.out.print(i + ": ");
      if(durchFuenfTeilbar(i)){
        System.out.print("ist durch 5 teilbar, ");
      }
      if(summeDurchDreiTeilbar(i,i-1)){
        System.out.print("Summe mit Vorherigen ist durch 3 teilbar, ");

      }
      if(endetAufNeun(i)){
        System.out.print("endet auf 9.");

      }
      System.out.println("");

    }
  }
  public static boolean durchFuenfTeilbar(int zahl){
    if(zahl % 5 == 0){
      return(true);
    }
    return(false);

  }
  public static boolean summeDurchDreiTeilbar(int sum1, int sum2){
    if((sum1 + sum2) % 3 == 0){
      return(true);
    }
    return(false);

  }
  public static boolean endetAufNeun(int zahl){
    if(zahl%10==9){
      return(true);
    }
    return(false);
  }
}



/*public void Zahlenfilter(int i, int j){
  
  System.out.println(i);

  private static boolean durch_5 (i){
    if (i%5==0) System.out.println(i + " ist durch 5 teilbar.");
    return (true);
  }
    
   
  private static boolean endet_auf_9 (i){
    if (i%10==9)  System.out.println(i +" endet auf 9.");
    return (true);
  } 

  private static boolean fibo_durch_3(i, j){
    int k =i+j;
    if (k%3==0)  System.out.println(i+ " + "+j+ " ergibt "+k+", welches durch 3 teilbar ist.");
    return (true);
  }
 }*/