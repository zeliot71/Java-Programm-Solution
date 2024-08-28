class Anonymous {
    public void Play(){
        System.out.println("Person class");
    }
}

public class Test {
    public static void main(String[] args) {
        Anonymous obj = new Anonymous(){
          public void Play(){
              System.out.println("Anonymous class!");
          }
        };

        obj.Play();
    }
}
