# Selenium-POM-Java
Selenium page object framework with java &amp; Maven &amp; TestNG 

## Steps to Setup

**1. Clone the application**

```bash

git clone 

```

**2. Import project in any Editor(Eclispe/Intellij)**


###Project Structure 

####Packge Details 

##### actionHelper : In this package common web functions is present

```bash
WebActionHelperMethods : All the common web functions is present in this class like click(),Scroll(),Enter() etc.
```
##### driverManager : In this package We are handling drivers initialization on the basis of browser 

```bash
DriverManagerType : We have create an enum for Driver types and its definations
```
```bash
Webdrivers : In this class we are creating driver object on the Basis of DriverType  like DriverManagerType.CHROME,DriverManagerType.firefoxdriver
```
##### listners : in this package we are using TestNg ITestlistner for creating report on the basis of Test result
```bash
TestListner :In this class we have implement ITestlistner provided 
```

