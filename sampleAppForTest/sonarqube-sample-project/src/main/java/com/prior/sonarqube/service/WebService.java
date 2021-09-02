package com.prior.sonarqube.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WebService {

  public Map<String,Object> service1(){
    Map<String,Object> result = new HashMap<>();
    result.put("1",1);
    return result;
  }

  public String service2(String p1){
    p1+=1;
    return p1;
  }
}
