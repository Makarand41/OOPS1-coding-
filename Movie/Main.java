import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        for (int i = 0; i < 4; i++)
        {
            String movieName = sc.nextLine();
            String producingCompany = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();sc.nextLine();
            movies[i] = new Movie(movieName, producingCompany, genre, budget);

        }
        String searchParameter = sc.nextLine();

        Movie[] result=budgetForGivenMovie(movies,searchParameter);
        for(int i=0;i<result.length;i++)
        {
            if (result[i].getBudget()>80000000)
            {
                System.out.println("High budget");
            } else if (result[i].getBudget()<80000000)
            {
                System.out.println("Low budget");
            }
        }

    }

    public static Movie[] budgetForGivenMovie(Movie[] movies, String genre)
    {
        Movie[] help=new Movie[0];
        for (int i=0;i< movies.length;i++)
        {
            if (movies[i].getGenre().equalsIgnoreCase(genre))
            {
                help=Arrays.copyOf(help,help.length+1);
                help[help.length-1]=movies[i];
            }
        }
        return help;
    }
}

class Movie
{
    private String movieName;
    private String producingCompany;
    private String genre;
    private int budget;


    public Movie(String movieName, String producingCompany, String genre, int budget) {
        this.movieName = movieName;
        this.producingCompany = producingCompany;
        this.genre = genre;
        this.budget = budget;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getProducingCompany() {
        return producingCompany;
    }

    public void setProducingCompany(String producingCompany) {
        this.producingCompany = producingCompany;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}