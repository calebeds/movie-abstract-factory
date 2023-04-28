public class Client {
    public static void main(String[] args) throws Exception {
        MovieFactoryInterface actionFactory = FactoryProducer.getFactory("action");
        MovieFactoryInterface comedyFactory = FactoryProducer.getFactory("comedy");
        MovieFactoryInterface dramaFactory = FactoryProducer.getFactory("drama");

        HollywoodMovieInterface hollywoodActionMovie = actionFactory.getHollywoodMovie();
        hollywoodActionMovie.getMovieName();

        BollywoodMovieInterface bollywoodActionMovie = actionFactory.getBollywoodMovie();
        bollywoodActionMovie.getMovieName();

        HollywoodMovieInterface hollywoodComedyMovie = comedyFactory.getHollywoodMovie();
        hollywoodComedyMovie.getMovieName();

        BollywoodMovieInterface bollywoodComedyMovie = comedyFactory.getBollywoodMovie();
        bollywoodComedyMovie.getMovieName();

        HollywoodMovieInterface hollywoodDramaMovie = dramaFactory.getHollywoodMovie();
        hollywoodDramaMovie.getMovieName();

        BollywoodMovieInterface bollywoodDramaMovie = dramaFactory.getBollywoodMovie();
        bollywoodDramaMovie.getMovieName();
    }
}
