package com.dnpass.training.java.day6.exception;

public class CustomException extends Exception1{
      private String name;
      public CustomException(int a,String n)
      {
    	  super(a);
    	  this.name = n;
      }
      public void setname(String n)
      {
    	  this.name=n;
      }
      public String getname()
      {
    	  return name;
      }
      void display() throws Exception
      {
    	  System.out.println(getname());
    	  super.entry();
      }

}
