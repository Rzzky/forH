import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.net.URL;
public class App {
   static String start;         
  public static void main (String [] args)  {
    new App();
  }
   public App() {

    try {
    URL url = new URL ("http://diskominfo.sampangkab.go.id/pilihanku.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    SongLines call = new Line();
    
    Scanner scan = new Scanner (System.in);

    clip.start();
    Clear();
    call.FirstLine();
    Clear();
    call.SecondLine();
    Clear();
    call.ThirdLine();
    Clear();
    call.FourthLine();
    Clear();
    call.FifthLine();
    Clear();
    call.SixthLine();
    Clear();
    call.SeventhLine();
    Clear();
    call.EighthLine();
    Clear();
    System.out.print("Mau di ulang lagi? (Y/N): ");
    start = scan.next();

    if (start.equalsIgnoreCase("y") || start.equalsIgnoreCase("Y")) {
      new App();
    }
    else if (start.equalsIgnoreCase("Y") || start.equalsIgnoreCase("N")) {
      System.out.println("Thank You!!");
    }
    else {
      System.out.println("Invalid Response");
    }
 
      
    }
    catch (Exception e) {

    }
  }

    public static abstract class SongLines {               
      public abstract void FirstLine();
      public abstract void SecondLine();
      public abstract void ThirdLine();
      public abstract void FourthLine();
      public abstract void FifthLine();
      public abstract void SixthLine();
      public abstract void SeventhLine();
      public abstract void EighthLine();
    }
    public static class Line extends SongLines {      

      @Override
      public void FirstLine (){
      try {
      Thread.sleep(850);
      System.out.print("Berjuta");
      System.out.print(" ");
      Thread.sleep(450);
      System.out.print("rasa");
      System.out.print(" ");
      Thread.sleep(450);
      System.out.print("rasa");
      System.out.print(" ");
      Thread.sleep(800);
      System.out.print("yang");
      System.out.print(" ");
      Thread.sleep(450);
      System.out.print("tak");
      System.out.print(" ");
      Thread.sleep(450);
      System.out.print("mampu");
      System.out.print(" ");
      Thread.sleep(550);
      System.out.print("diungkapkan");
      System.out.print(" ");
      Thread.sleep(550);
      System.out.print("kata");
      System.out.print("-");
      Thread.sleep(550);
      System.out.print("kata");
      System.out.print(" ");
      Thread.sleep(3000);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
      @Override 
      public void SecondLine(){
      try {
      Thread.sleep(400);
      System.out.print("Dengan");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("beribu");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("cara");
      System.out.print("-");
      Thread.sleep(400);
      System.out.print("cara");
      System.out.print(" ");
      Thread.sleep(650);
      System.out.print("kau");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("selalu");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("membuat");
      System.out.print("-");
      Thread.sleep(1200);
      System.out.print("ku");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("bahagia!");
      System.out.print(" ");
      Thread.sleep(4000);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override 
      public void ThirdLine(){
      try {
      Thread.sleep(150);
      System.out.print("Kau");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("adalah");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("alasan");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("dan");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("jawaban");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("atas");
      System.out.print(" ");
      Thread.sleep(500);
      System.out.print("semua");
      System.out.print(" ");
      Thread.sleep(500);
      System.out.print("pertanyaan");
      System.out.print(" ");
      Thread.sleep(4000);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
 @Override 
      public void FourthLine(){
      try {
      Thread.sleep(400);
      System.out.print("Yang");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("benar");
      System.out.print("-");
      Thread.sleep(400);
      System.out.print("benar");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("kuinginkan");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("hanyalah");
      System.out.print(" ");
      Thread.sleep(800);
      System.out.print("kau");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("untuk");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("selalu");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("di");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("sini");
      System.out.print(" ");
      Thread.sleep(1300);
      System.out.print("ada");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("untukku!");
      System.out.print(" ");
      Thread.sleep(1500);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override 
      public void FifthLine(){
      try {
      Thread.sleep(400);
      System.out.print("Maukah");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("Haniya!");
      System.out.print(" ");
      Thread.sleep(1000);
      System.out.print("tuk");
      System.out.print(" ");
      Thread.sleep(1000);
      System.out.print("menjadi");
      System.out.print(" ");
      Thread.sleep(800);
      System.out.print("PILIHAN");
      System.out.print("-");
      Thread.sleep(2000);
      System.out.print("KU!?");
      System.out.print(" ");
      Thread.sleep(1200);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

 @Override 
      public void SixthLine(){
      try {
      Thread.sleep(400);
      System.out.print("Menjadi");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("yang");
      System.out.print(" ");
      Thread.sleep(1000);
      System.out.print("terakhir");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("dalam");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("hidupku?");
      System.out.print(" ");
      Thread.sleep(2000);  

      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

   @Override 
      public void SeventhLine(){
      try {
      Thread.sleep(400);
      System.out.print("Maukah");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("Haniya!");
      System.out.print(" ");
      Thread.sleep(1000);
      System.out.print("tuk");
      System.out.print(" ");
      Thread.sleep(1000);
      System.out.print("menjadi");
      System.out.print(" ");
      Thread.sleep(800);
      System.out.print("yang");
      System.out.print(" ");
      Thread.sleep(800);
      System.out.print("pertama?");
      System.out.print(" ");
      Thread.sleep(2000);   

      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  @Override 
      public void EighthLine(){
      try {
      Thread.sleep(400);
      System.out.print("Yang");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("selalu");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("ada");
      System.out.print(" ");
      Thread.sleep(1000);
      System.out.print("di");
      System.out.print(" ");
      Thread.sleep(600);
      System.out.print("saat");
      System.out.print(" ");
      Thread.sleep(800);
      System.out.print("pagi");
      System.out.print("-");
      Thread.sleep(600);
      System.out.print("ku");
      System.out.print(" ");
      Thread.sleep(800);
      System.out.print("membuka");
      System.out.print(" ");
      Thread.sleep(800);
      System.out.print("mata :D");
      System.out.print(" ");
      Thread.sleep(3000);

      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

    public void Clear() {
      try {
        final String os = System.getProperty("os.name");
  
        if (os.contains("Windows")) {
          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
          System.out.print("\033[H\033[2J");
          System.out.flush();
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
  

}
}
