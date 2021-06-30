package main.java.com.google.sps.data;

/** Class containing server statistics. */
public final class FavoriteMovies {

  private final String movies;

  public FavoriteMovies(String movies) {
    this.movies = movies;
  }

  public String getMovies() {
      return movies;
  }
}
