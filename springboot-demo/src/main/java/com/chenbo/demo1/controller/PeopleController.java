package com.chenbo.demo1.controller;

import com.chenbo.demo1.entity.People;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PeopleController
 * @Description TODO
 * @Author chenbo
 * @Date 2022-11-11 14:43
 **/
@RestController
public class PeopleController {
  @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
  public People index() {
    System.out.println(">>>>>>>>>>i am json>>>>>>>>>>>>>>>>");
    System.out.println(">>>>>>>>>>i am do gett>>>>>>>>>>>>>>>>");
    People people = new People("xiaoming", "18", "beijing");
    return people;
  }

  @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
  public People XML(){
    System.out.println(">>>>>>>>>>i am xml>>>>>>>>>>>>>>>>");
    People people = new People("xiaoming", "18", "beijing");
    return people;
  }

}
