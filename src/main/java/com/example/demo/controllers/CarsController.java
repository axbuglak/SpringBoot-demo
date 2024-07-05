package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.handlers.car.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/cars")
public class CarsController {

  @Autowired
  @Qualifier("twoPersonCar")
  private Car car;

  @GetMapping("")
  public String getCar() {
    return car.getModel();
  }

}
