public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) throws Exception {
        if(choice.equalsIgnoreCase("Hollywood")) {
            return new HollywoodFactory();
        } else if (choice.equalsIgnoreCase("Bollywood")) {
            return new BollywoodFactory();
        }

        throw new Exception(choice + " is not available");
    }
}
