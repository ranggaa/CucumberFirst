@Tag
Feature:
As Admin user want to verify customer and supplier modules
@Supplier
Scenario Outline:
As Admin user validate supplier
Given Users launch Browser
When user launch Url
When Wait for username with "xpath" and "//input[@id='username']" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password  with "xpath" and "//input[@id='password']" and "master"
When Click login button with "id" and "btnsubmit"
When Wait for logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]" and "10"
Then Validate Title with "Dashboard « Stock Accounting"
When Wait for supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]" and "10"
When Click Supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When Wait for Add icon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When click Add Icon "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for supplier number with "name" and "x_Supplier_Number" and "10"
When Capture Supplier number  with "name" and "x_Supplier_Number"
When Enter in "<suppliername>" with "name" and "x_Supplier_Name"
When Enter in "<Address>" with "name" and "x_Address"
When Enter in "<City>" with "name" and "x_City"
When Enter in "<Country>" with "name" and "x_Country"
When Enter in "<Contactperson>" with "name" and "x_Contact_Person"
When Enter in "<Phonenumber>" with "name" and "x_Phone_Number"
When Enter in "<Email>" with "name" and "x__Email"
When Enter in "<mobilenumber>" with "name" and "x_Mobile_Number"
When Enter in "<Notes>" with "name" and "x_Notes"
When Click Add button with "id" and "btnAction"
When Wait for Confirm Ok button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When Click Confirm Ok with "xpath" and "//button[normalize-space()='OK!']"
When Wait for Alert Ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
Then Validate Supplier number
When close browser
Examples:
|suppliername|Address|City|Country|Contactperson|Phonenumber|Email|mobilenumber|Notes|
|Akhilesh1|Ameerpet13|Hyderabad1|India|Qedge1|2145698745|Test@gmail.com|5478954789|Iam new Supplier|
|Akhilesh14|Ameerpet15|Hyderabad1|India|Qedge1|2145698745|Test@gmail.com|5478954789|Iam new Supplier|
|Akhilesh16|Ameerpet41|Hyderabad1|India|Qedge1|2145698745|Test@gmail.com|5478954789|Iam new Supplier|
|Akhilesh17|Ameerpet111|Hyderabad1|India|Qedge1|2145698745|Test@gmail.com|5478954789|Iam new Supplier|
|Akhilesh12|Ameerpet100|Hyderabad1|India|Qedge1|2145698745|Test@gmail.com|5478954789|Iam new Supplier|
@Customer
Scenario Outline:
Validate Customer with multiple data
Given Users launch Browser
When user launch Url
When Wait for username with "xpath" and "//input[@id='username']" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password  with "xpath" and "//input[@id='password']" and "master"
When Click login button with "id" and "btnsubmit"
When Wait for logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]" and "10"
Then Validate Title with "Dashboard « Stock Accounting"
When Wait for Customer link with "xpath" and "(//a[starts-with(text(),'Customers')])[2]" and "10"
When Click Customer link with "xpath" and "(//a[starts-with(text(),'Customers')])[2]"
When Wait for Add icon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When click Add Icon "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for Customer number with "name" and "x_Customer_Number" and "10"
When Capture Customer number  with "name" and "x_Customer_Number"
When Enter in "<Customername>" with "name" and "x_Customer_Name"
When Enter in "<Address>" with "name" and "x_Address"
When Enter in "<City>" with "name" and "x_City"
When Enter in "<Country>" with "name" and "x_Country"
When Enter in "<Contactperson>" with "name" and "x_Contact_Person"
When Enter in "<Phonenumber>" with "name" and "x_Phone_Number"
When Enter in "<Email>" with "name" and "x__Email"
When Enter in "<mobilenumber>" with "name" and "x_Mobile_Number"
When Enter in "<Notes>" with "name" and "x_Notes"
When Click Add button with "id" and "btnAction"
When Wait for Confirm Ok button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When Click Confirm Ok with "xpath" and "//button[normalize-space()='OK!']"
When Wait for Alert Ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
Then Validate customer number
When close browser
Examples:
|Customername|Address|City|Country|Contactperson|Phonenumber|Email|mobilenumber|Notes|
|Ramuandranga130|Kukatpalli541|Ameerpet15|India|QedgeTech56|2456987456|ranga@gmail.com|7896541236|iam new Cuatomer1|
|Ramuandranga14|Kukatpalli41|Ameerpet17|India|QedgeTech1|2456987456|ranga@gmail.com|7896541236|iam new Cuatomer1|
|Ramuandranga14|Kukatpalli41|Ameerpet17|india1|QedgeTech45|245698745667|ranga@gmail.com|7896541236|iam new Cuatomer1|





