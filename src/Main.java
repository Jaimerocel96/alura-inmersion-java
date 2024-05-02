import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola mundo");
        System.out.println("Película Matrix");

        int releaseDate = 1999;
        double rating = 4.5;
        boolean basicIncluded = true;
        String moovieName = "Matrix";
        String synopsis = """
               Bloque de texto sinopsis Matrix
               """;

        System.out.println("Película" + moovieName);
        System.out.println("Estreno: " + releaseDate);
        System.out.println("Puntuación: " + rating);
        System.out.println("Incluído en el plan \"Basic\": " + basicIncluded);
        System.out.println("Sinopsis: " + synopsis);

        double averageRating = (4.5 + 3 + 4.8) / 3;

        System.out.println("Puntuación media: " + averageRating);

        double averageUserRating = 0;

        if(releaseDate >= 2023){
            System.out.println("Popular moovie at the moment");
        }else{
            System.out.println("Retro moovie worth watching");
        }

        for (int i = 0; i < 3; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingresa la nota para la película");
            double ratingMatrix = input.nextDouble();
            averageUserRating += ratingMatrix;
        }
        averageUserRating = averageUserRating / 3;
        System.out.println("La media calculada por el usuario es: " + averageUserRating);

    }
}