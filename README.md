# myloginApp

Titles and internal titles:

->src- contains java code

->application.properties - conataining properties required to be set to run the application.

->messaeges.properties - error mesages mentioned while vaidation fails.

->pom.xml - having all dependency 

Introduction - the project's aim is to provide login and registration functionality using spring mvc for web support and it validates
entered fields using validation and cross check data from database using spring security.

-> first user have o register

-> eneter fields would be validated against the validation rule applied, if it fails then error messages has been thrown using
properties file else fields values would be saved in to the database.

-> after saving the data it will auto login on clicking logout it will logout the user.

-> if user already registered then credentials would be asked to be logged in after entering details fiels would be matched from database 
using spring security if its matched the user will be logged in else error mesage will be displayed.

Launch:

to launch this application first database needs to be created uing sql script given ,
change the application.properties file according to your configuration and run it simply.
