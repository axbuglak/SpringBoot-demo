package com.example.demo.handlers.car;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("onePersonCar")
public class OnePersonCar implements Car {
  public String getModel() {
    return "One person car";
  }
}
