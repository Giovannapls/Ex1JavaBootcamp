import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    /*Antes de compilar, Chame o metodo do exercicio
     que sera analisado ;) */
  }
  public static void Ex1NumerosPares(){
    Scanner sc1 = new Scanner(System.in);
    int valorLimite = sc1.nextInt();
    for(int i=0; i< valorLimite; i=i+2){
      System.out.println(i);
    }
  }
   public static  void Ex2MultiplosDeM(){
    Scanner sc1 = new Scanner(System.in);
    int valorLimite = sc1.nextInt();
    int multiplo = sc1.nextInt();
    for(int i=0; i< valorLimite; i=i+multiplo){
      System.out.println(i);
    }
  }
    public static void Ex3CheckarNumeroPrimo(){
    Scanner sc1 = new Scanner(System.in);
    int valorCheckado = sc1.nextInt();
    if (valorCheckado <= 1){
    System.out.println("Nao eh primo");
    return;
    }
    for (int i = 2; i < valorCheckado; i++){
      if (valorCheckado % i == 0 && i!= valorCheckado){
        System.out.println("Nao eh primo");
        return;
      }
    }
     System.out.println("eh primo");
  }
  static boolean CheckarPrimo(int valorCheckado)
{
if (valorCheckado <= 1){ 
    return false;
    }
    for (int i = 2; i < valorCheckado; i++){
      if (valorCheckado % i == 0 && i!= valorCheckado){
        return false;
      }
    }
     return true;
}
  public static void Ex4ListarNumerosPrimos(){
    Scanner sc1 = new Scanner(System.in);
    int valorLimite = sc1.nextInt();
    for (int j = 2; j <= valorLimite; j++){
      if(CheckarPrimo(j)){
      System.out.println(j);}
    }
  }
  public static void Ex5PrimeirosN(){

  }

}