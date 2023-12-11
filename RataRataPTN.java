public class RataRataPTN {
    public static void main(String[] args){
        int nilaiTono = 80;

        if(nilaiTono > 81){
            System.out.println("PT A akan menerima Tono.");
        }
        else if(nilaiTono >= 71 && nilaiTono <= 80){
            System.out.println("PT B akan menerima Tono.");
        }
        else if(nilaiTono >= 61 && nilaiTono <= 70){
            System.out.println("PT C akan menerima Tono.");
        }
        else{
            System.out.println("PT D akan menerima Tono.");
        }
    }
}