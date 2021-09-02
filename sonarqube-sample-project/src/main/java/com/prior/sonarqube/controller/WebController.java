package com.prior.sonarqube.controller;

import com.prior.sonarqube.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WebController {

  @Autowired
  private WebService webService;

  @GetMapping("/test1")
  public String test1(@RequestParam("p1")String p1){
    return "1";
  }

  @GetMapping("/test2")
  public Integer test2(@RequestParam("p2")String p2){
    return 2;
  }

  @GetMapping("/test3")
  public Map<String,Object> test3(){
    return webService.service1();
  }
}
