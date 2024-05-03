import models.Pelicula;
import models.Serie;

import java.util.Scanner;

public class Principal {
    public void initMenu(){
        int option = 0;
        Scanner input = new Scanner(System.in);

        while(option != 9){
            String menu = """
                    Bienvenid@ a Screenmatch
                    1) Registrar nueva película
                    2) Registrar nueva serie
                    
                    9) Salir
                    """;

            System.out.println(menu);
            option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1:
                    System.out.println("Introduzca el nombre de la película");
                    String m_name = input.nextLine();
                    System.out.println("Introduzca el año de estreno de la película");
                    int m_releaseDate = input.nextInt();
                    input.nextLine();
                    System.out.println("Introduzca la duración de la película (minutos)");
                    int m_duration = input.nextInt();
                    input.nextLine();
                    Pelicula userMoovie = new Pelicula();
                    userMoovie.setName(m_name);
                    userMoovie.setReleaseDate(m_releaseDate);
                    userMoovie.setDuration(m_duration);
                    userMoovie.showInfo();
                    break;
                case 2:
                    System.out.println("Introduzca el nombre de la serie");
                    String s_name = input.nextLine();
                    System.out.println("Introduzca el año de estreno de la serie");
                    int s_releaseDate = input.nextInt();
                    input.nextLine();
                    System.out.println("Introduzca las temporadas de la serie");
                    int s_seasons = input.nextInt();
                    input.nextLine();
                    System.out.println("Introduzca los capítulos por temporada");
                    int s_chapterPerSeason = input.nextInt();
                    input.nextLine();
                    System.out.println("Introduzca la duración de los capítulos");
                    int s_chapterDuration = input.nextInt();
                    input.nextLine();
                    Serie userSerie = new Serie();
                    userSerie.setName(s_name);
                    userSerie.setReleaseDate(s_releaseDate);
                    userSerie.setSeasons(s_seasons);
                    userSerie.setChapterPerSeason(s_chapterPerSeason);
                    userSerie.setChapterDuration(s_chapterDuration);
                    userSerie.showInfo();
                    break;
                case 9:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Opción no disponible");
            }


        }

    }
}
