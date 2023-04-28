public interface Hollywood  {
    void getMovieName();
}



class HollywoodComedyMovie implements Hollywood {

    @Override
    public void getMovieName() {
        System.out.println("Hollywood Comedy Movie");
    }
}

class HollywoodActionMovie implements Hollywood {

    @Override
    public void getMovieName() {
        System.out.println("Hollywood Action Movie");
    }
}

class HollywoodDramaMovie implements Hollywood {

    @Override
    public void getMovieName() {
        System.out.println("Hollywood Drama Movie");
    }
}

