package Generic;

public class Data<T> {


    //T means anything, type of Data can be anything String, Integer etc
    private T data;

    public Data(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    @Override
    public String toString(){
        return "data is: " + data;
    }


}
