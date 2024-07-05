package com.example.demo.handlers.car;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("twoPersonCar")
public class TwoPersonCar implements Car {
  @Override
  public String getModel() {
    return "Two person car";
  }
}
