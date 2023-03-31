package de.theoptik.session6;

public class ExampleClass {

    private int id;

    public int getId(){
        return id;
    }


    public void setId(int id){
        if(id < 0){
            // ne mag ich nicht
        }else{
            this.id = id;
        }
    }

}
