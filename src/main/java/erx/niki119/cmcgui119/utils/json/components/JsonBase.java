package erx.niki119.cmcgui119.utils.json.components;

public class JsonBase {
    public String id;
    public JsonBase(String id){
        this.id = id;
    }
    @Override
    public String toString(){
        return id;
    }
}