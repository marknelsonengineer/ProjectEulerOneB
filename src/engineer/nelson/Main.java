package engineer.nelson;

public class Main {

  public static void main(String[] args) {

    int iRuningEuler = 0;

    for( int i = 3 ; i < 1000 ; i++ ) {
      if( i%3 == 0 || i%5 == 0 ) {
        System.out.println( i );
        iRuningEuler += i;
      }
    }

    System.out.println( iRuningEuler );

  }
}
