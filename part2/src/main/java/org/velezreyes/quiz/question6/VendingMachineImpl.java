package org.velezreyes.quiz.question6;

import java.util.jar.Attributes.Name;

public class VendingMachineImpl implements VendingMachine{

  float money = 0f;

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    this.money+=0.25f;  
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    float price = (name.equals("KarenTea")?1f:0.75f);

    if (name.equals("BessieBooze")) {
      throw new UnknownDrinkException();
    }

    if(price>money){
      throw new NotEnoughMoneyException();
    }
    
    Drink drink = new Drink() {
      @Override
      public boolean isFizzy() {
          // TODO Auto-generated method stub
          return (name.contains("Cola"));
      }
      @Override
      public String getName() {
        return name;
      }
    };

    return drink;
  }
}
