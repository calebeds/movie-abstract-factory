public interface BollywoodMovieInterface {
    void getMovieName();
}

class BollywoodComedyMovie implements BollywoodMovieInterface {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood Comedy Movie");
    }
}

class BollywoodActionMovie implements BollywoodMovieInterface {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood Action Movie");
    }
}

class BollywoodDramaMovie implements BollywoodMovieInterface {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood Drama Movie");
    }
}