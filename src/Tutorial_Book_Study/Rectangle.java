public class Rectangle implements Shape{

    protected String id;
    protected String type;

    @Override
    void getType(){};
    String getID(){
        return id;
    };

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone(){
        return Object;
    }

}