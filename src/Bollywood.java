public interface Bollywood {
    void getMovieName();
}

class BollywoodComedyMovie implements Bollywood {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood Comedy Movie");
    }
}

class BollywoodActionMovie implements Bollywood {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood Action Movie");
    }
}

class BollywoodDramaMovie implements Bollywood {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood Drama Movie");
    }
}