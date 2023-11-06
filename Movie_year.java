import java.util.*;
class Movie {
    private int year;
    private int cost;
    public Movie(int year,int cost) {
        this.year=year;
        this.cost=cost;
    }
    public int getYear() {
        return year;
    }
    public double getCost() {
        return cost;
    }
    @Override
    public String toString() {
        return "Movie [year=" + year + ", cost=" + cost + "]";
    }
}
public class Movie_year {
    public static void main(String[] args) {
        List<Movie> m=new ArrayList<>();
        Movie m1=new Movie(2020,120);
          Movie m2=new Movie(2019,100);
            Movie m3=new Movie(2021,150);
            m.add(m1);
            m.add(m2);
            m.add(m3);
        Collections.sort(m,Comparator.comparingDouble(Movie::getCost));
        for (Movie s:m) {
            System.out.println(s);
        }
    }
}

