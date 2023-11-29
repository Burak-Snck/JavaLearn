package j20_StaticKeyword.Task;

public class task01Rectangle {

  double width;
  double height;


    public task01Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double alanHesapla() {
        return(width*height);
    }

    public double cevreHesapla() {
        return (width * height) * 2;

    }
}
