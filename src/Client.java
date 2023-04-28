public class Client {
    public static void main(String[] args) throws Exception {
        AbstractFactory hollywoodFactory = FactoryProducer.getFactory("Hollywood");

        Hollywood hollywoodActionMovie = hollywoodFactory.getHollywoodMovie("action");
       hollywoodActionMovie.getMovieName();

        Hollywood hollywoodComedyMovie = hollywoodFactory.getHollywoodMovie("comedy");
        hollywoodComedyMovie.getMovieName();

        Hollywood hollywoodDramaMovie = hollywoodFactory.getHollywoodMovie("drama");
        hollywoodDramaMovie.getMovieName();

        AbstractFactory bollywoodFactory = FactoryProducer.getFactory("bollywood");

        Bollywood bollywoodActionMovie = bollywoodFactory.getBollywoodMovie("action");
        bollywoodActionMovie.getMovieName();

        Bollywood bollywoodComedyMovie = bollywoodFactory.getBollywoodMovie("comedy");
        bollywoodComedyMovie.getMovieName();

        Bollywood bollywoodDramaMovie = bollywoodFactory.getBollywoodMovie("drama");
        bollywoodDramaMovie.getMovieName();

    }
}
