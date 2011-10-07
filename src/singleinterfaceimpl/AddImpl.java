package singleinterfaceimpl;


public class AddImpl implements Add{

    public int add(int a, int b){

       return a+b;
    }

    public void display(){

        System.out.println("hello");
    }
}
