public class Iphone implements navegadorWeb, PlayerMusica, Telefone{
  private double memoria = 6000;
  private double armazenamento = 1200000;
  private int numeroSerie = 0101010123;
  @Override
  public void play() {
    System.out.println("Tocando Música");
  }

  @Override
  public void pause() {
    System.out.println("Pausando a Música");
  }

  @Override
  public void rewind() {
    System.out.println("Voltando a  Música");
  }

  @Override
  public void forward() {
    System.out.println("avançando Música");
  }

  @Override
  public void chamar(String numero) {
    System.out.printf("\n Chamando para o numero: %s \n", numero);
  }

  @Override
  public void receber() {
    System.out.println("Recebendo ligação");
  }

  @Override
  public void enviaSMS(String numero) {
    System.out.printf("\n Enviando sms para o numero: %s \n", numero);
  }

  @Override
  public void conectar() {
    System.out.println("Conectando na internet");
  }

  @Override
  public void acessarUrl(String url) {
    System.out.printf("\n acessando o site: %s \n", url);
  }

  @Override
  public void fazerDownload() {
    System.out.println("Fazendo Download do arquivo");
  }

  @Override
  public void adicionarFavorito() {
    System.out.println("Adicionando pagina aos favoritos");
  }

  @Override
  public String toString() {
    return "Iphone{" +
            "memoria=" + memoria + " mb" +
            ", armazenamento=" + armazenamento + " mb" +
            ", numeroSerie=" + numeroSerie +
            '}';
  }
}
