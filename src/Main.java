//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Iphone iphone7 = new Iphone();
    System.out.println(iphone7);

    iphone7.chamar("(11) 4002-8922");
    iphone7.receber();
    iphone7.enviaSMS("(11) 4002-8922");

    iphone7.play();
    iphone7.pause();
    iphone7.rewind();
    iphone7.forward();

    iphone7.conectar();
    iphone7.acessarUrl("www.google.com");
    iphone7.adicionarFavorito();
    iphone7.fazerDownload();
  }
}