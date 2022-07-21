package com.example.AC1demo;

import org.springframework.stereotype.Component;

@Component
public class WidgetA {
	

   private WidgetB b;
   
   //Tight Coupling
   public WidgetA(){
    	this.b = new WidgetB();
    	b.doSomething();
   }

    // dependency injection   
    public WidgetA(WidgetB b){
    	this.b = b;
    	b.doSomething();
  }

	public String doSomething() {
		return("CALLED doSomething() in WidgetA");
	}

}