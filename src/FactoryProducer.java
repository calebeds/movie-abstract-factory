public class FactoryProducer {
    public static MovieFactoryInterface getFactory(String choice) throws Exception {
        if(choice.equalsIgnoreCase("Action")) {
            return new ActionMovieFactory();
        } else if (choice.equalsIgnoreCase("Comedy")) {
            return new ComedyMovieFactory();
        } else if (choice.equalsIgnoreCase("Drama")) {
            return new DramaMovieFactory();
        }

        throw new Exception(choice + " is not available");
    }
}
