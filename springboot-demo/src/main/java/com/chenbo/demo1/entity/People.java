package com.chenbo.demo1.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName People
 * @Description TODO
 * @Author chenbo
 * @Date 2022-11-11 14:41
 **/
@XmlRootElement
public class People {

  String userName;
  String userAge;
  String userAddress;
//  String text;

  public People() {
  }

  public People(String userName, String userAge, String userAddress) {
    this.userName = userName;
    this.userAge = userAge;
    this.userAddress = userAddress;
//    this.text = text;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserAge() {
    return userAge;
  }

  public void setUserAge(String userAge) {
    this.userAge = userAge;
  }

  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

}
