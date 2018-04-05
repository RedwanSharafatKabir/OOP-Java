package ALL_Exception_Handling;
public class DataFetcher {
    public String fetchDataFormUrl(String url)throws Exception {
        if(url == null){
            throw new Exception("Url not found.");
        }
        String data = null;
        return data;
    }
}
class Checkedexception extends Exception {
    public Checkedexception(String message){
        super(message);
    }
}
