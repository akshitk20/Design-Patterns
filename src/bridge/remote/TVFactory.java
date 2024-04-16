package bridge.remote;

public class TVFactory {

    public TV getTV(String type) throws Exception {
        if (type.equals("LG")) {
            return new LG();
        } else if (type.equals("Sony")) {
            return new LG();
        } else {
            throw new Exception("Invalid TV type");
        }
    }
}
