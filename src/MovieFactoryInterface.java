public interface MovieFactoryInterface {
     HollywoodMovieInterface getHollywoodMovie() throws Exception;
     BollywoodMovieInterface getBollywoodMovie() throws Exception;
}

class ActionMovieFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovieInterface getHollywoodMovie() throws Exception {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() throws Exception {
        return new BollywoodActionMovie();
    }
}

class ComedyMovieFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovieInterface getHollywoodMovie() throws Exception {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() throws Exception {
        return new BollywoodComedyMovie();
    }
}

class DramaMovieFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovieInterface getHollywoodMovie() throws Exception {
        return new HollywoodDramaMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() throws Exception {
        return new BollywoodDramaMovie();
    }
}