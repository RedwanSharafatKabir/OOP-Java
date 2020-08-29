public abstract class Shape {
    protected String id;
    protected String type;

    void getType(){};
    String getID(){
        return id;
    };

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        return Object;
    }

}