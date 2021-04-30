# Overview
This project tests a checkout process at a web-shop, see the details below. It uses only one scenario.

# Technical requirement
## untested requirements
1. maven 3.5.x
2. java 8 or higher
3. any operating system where you can perform maven commands.

## tested requirements
This requirements below are these one at which this project has been developed.
### Software
1. java 11
2. maven 3.6.3
3.1. IntelliJ IDE for executing the test inside a development environment or
3.2 Terminal where you can execute maven commands. 
   
### More
1. Linux Mint 20 operating system. 
2. Internet connection operational. 

# Business requirements 
1. Go to https://www.saucedemo.com/
2. Login as valid user
3. In the listing page select Sorting as "Price (low to high)"
4. Add the cheapest product to cart by clicking on the add to cart button
5. Navigate to the cart
6. Proceed through the whole checkout

## Remarks to the requirements
There are some flaws visible at this procedure. At a high level it describes a checkout process in a web-shop. What is missing here is that we would need to know much more about different scenarios already tested. So it is not that clear, if we need to assert every step. In my opinion this should not happen as I assume that this has happened in very short scenarios before. That's one of the reason why I did not use that many assertions. Apart from that there are some more questions unanswered. For example the check on success for navigating to the cart page could be done in 2 different ways. Call the url is one option or click the cart symbol another one. Both versions have advantages and disadvantages. It was my intention to simulate  a real customer so no customer would enter an url to navigate to the cart. The logout procedure is not a requirement here. 


# More technical info
* Mainclass : net.serenitybdd.cucumber.cli.Main
* Original code pulled from demo project and adapted accordingly.
* screenshot is activated so this consumes more space on your harddisk. Should not be an issue in general.

# Limitation
* during the login process, no button is selected and pushed. The enter key is used instead.
* The step library could be organized better.
* Security is out of scope
* 2 more scenarios are added but disabled as it was not required.
* gender is out of scope
* no extra logout step implemented
* No failure case included
* the pom file from maven is not that maintained yet. It should be updated.
* firefox browser called. No other browser tested. This could be improved. In real live it is not enough to test only once browser.  The most important part is to test the render engine.
* Scenarios for expensive and cheapest could be used in one file. Shared annotation could be used. (this is intentionally not done now)
* Test-data inside the scenarios and the scenario itself is not separated in a clean way. This might be an option dependent on the situation. The criteria whether this has to be done are company and domain related.
* executing mvn at the command-line will result in an ERROR Warning message which has currently not a negative impact. It is highly recommended investigating in detail in order to solve the root cause. First investigations lead to the JAVA Version. One option to check if the assumption is true is to use the toolchain plugin and enforce Java 8 

# Additional remark
* when ever possible focus on unittests as these tests are your insurance to keep a constant velocity at your feature rate.
* UI tests are important, readable UI tests are more important.

# execution
## Option 1
```
mvn verify
```


# Git
* ``` https://github.com/ebelsbergerp/ui-test-demo ```
