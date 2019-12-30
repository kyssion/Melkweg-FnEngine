package org.mekweg.handle;

public enum  HandleType {

    SAMPLE_HANDLE("sample handle",1),CONDITION_HANDLE("condition handle",2),
    REORDER_HANDLE("reorder handle",3);

    HandleType(String name,int code){
        this.name = name;
        this.code = code;
    }
    private String name;
    private int code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}