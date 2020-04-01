package Leetcode;

public class DefaultLeetcode {
    protected String description = "No description set";
    protected String name = "No name set";
    protected int ID = -9999;
    protected boolean completed = false;


    public DefaultLeetcode(){

    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return  description;
    }

    public int getID(){
        return ID;
    }

    public boolean getCompleted(){
        return completed;
    }
}
