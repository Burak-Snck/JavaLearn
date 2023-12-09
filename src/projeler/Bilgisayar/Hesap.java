package projeler.Bilgisayar;

public class Hesap {
    public int getRam(String ram) {
        int fiyatRam=0;
        switch (ram){
            case "4gb":
                fiyatRam+=50;
                break;
            case "8gb":
                fiyatRam+=100;
                break;
            case "16gb":
                fiyatRam+=200;
                break;
            case "32gb":
                fiyatRam+=300;
                break;
        }
        return fiyatRam;
    }

    public int getCPU(String cpu) {
        int fiyatCPU=0;
        switch (cpu){
            case "i3":
                fiyatCPU+=200;
                break;
            case "i5":
                fiyatCPU+=300;
                break;
            case "i7":
                fiyatCPU+=500;
                break;
        }
        return fiyatCPU;
    }

    public int getColor(String color) {
        int fiyatColor=0;
        switch (color){
            case "Red":
                fiyatColor+=400;
                break;
            case "Orange":
                fiyatColor+=300;
                break;
            case "Silver":
                fiyatColor+=200;
                break;
            case "Black":
                fiyatColor+=150;
                break;
        }
        return fiyatColor;
    }

    public int getSize(String boyut) {
        int fiyatSize=0;
        if (boyut.equalsIgnoreCase("Mini")){
            fiyatSize+=100;
        } else if (boyut.equalsIgnoreCase("Middle")) {
            fiyatSize+=200;
        } else if (boyut.equalsIgnoreCase("Max")) {
            fiyatSize+=300;
        }
        return fiyatSize;
    }


}
