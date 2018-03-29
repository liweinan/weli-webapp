package io.weli.multipart;

public class JsonItem {
    protected String name;

    protected int id;

    public JsonItem(String bill) {
        this.name = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
