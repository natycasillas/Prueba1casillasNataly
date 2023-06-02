public class Main {
    //literatura

    public static void main(String[] args) {
       // Literatura pelicula1 = new Literatura
        System.out.println("LITERATURA");

        Literatura lit1=new Literatura(200,"la bestia","7ma","primer2","literatura juvenil","jose maria","25 agosto");
        Literatura lit2=new Literatura(2020,"la flor","9na","1.1","literatura estudiantil","Jimenez maria","5 agosto");
        Literatura lit3=new Literatura(2012,"la loma","1ra","5.2","literatura juvenil","Marina","2 enero");
        Literatura lit4=new Literatura(2015,"sagrado","10ma","2.3","literatura romantica","Rosa villa","12 mayo");
        Literatura lit5=new Literatura(2023,"la familia","1ra","2.1","literatura romantica","PABLO vinieza"," 2 abril");
        System.out.println("--libros de literatura-");
        System.out.println("\n> litertatura 1: ");
        lit1.imprimirDatos();
        System.out.println("\n>litertatura 2: ");
        lit2.imprimirDatos();
        System.out.println("\n>litertatura 3: ");
        lit3.imprimirDatos();
        System.out.println("\n>litertatura4: ");
        lit4.imprimirDatos();
        System.out.println("\n>litertatura 5: ");
        lit5.imprimirDatos();
    }


}