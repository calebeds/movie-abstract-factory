public abstract class AbstractFactory {
    abstract Hollywood getHollywoodMovie(String hollywoodMovie) throws Exception;
    abstract Bollywood getBollywoodMovie(String bollywoodMovie) throws Exception;
}

class HollywoodFactory extends AbstractFactory {

    @Override
    public Hollywood getHollywoodMovie(String hollywoodMovie) throws Exception {
        if(hollywoodMovie.equalsIgnoreCase("Action")) {
            return new HollywoodActionMovie();
        } else if (hollywoodMovie.equalsIgnoreCase("Comedy")) {
            return new HollywoodComedyMovie();
        } else if (hollywoodMovie.equalsIgnoreCase("Drama")) {
            return new HollywoodDramaMovie();
        }

        throw new Exception(hollywoodMovie + " doesn't exist.");
    }

    @Override
    public Bollywood getBollywoodMovie(String bollywoodMovie) {
        return null;
    }
}

class BollywoodFactory extends AbstractFactory {

    @Override
    public Hollywood getHollywoodMovie(String hollywoodMovie) {
        return null;
    }

    @Override
    public Bollywood getBollywoodMovie(String bollywoodMovie) throws Exception {
        if(bollywoodMovie.equalsIgnoreCase("Action")) {
            return new BollywoodActionMovie();
        } else if (bollywoodMovie.equalsIgnoreCase("Comedy")) {
            return new BollywoodComedyMovie();
        } else if (bollywoodMovie.equalsIgnoreCase("Drama")) {
            return new BollywoodDramaMovie();
        }

        throw new Exception(bollywoodMovie + " doesn't exist.");
    }
}