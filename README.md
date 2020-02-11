# myloginApp

Titles and internal titles:

->src- contains java code

->application.properties - conatains properties required to be set to run the application.

->messaeges.properties - error mesages for failed vaidation.

->pom.xml - having all dependency 

Introduction - the project's aim is to provide login and registration functionality using spring mvc for web support and validates
entered fields using spring validation and cross check data from database using spring security.

-> first user have o register

-> enetered fields would be validated against the validation rule written, if it fails then error messages has been thrown using
properties file else fields values would be saved in to the database.

-> after saving the data it will auto login, on clicking logout it will logout the user.

-> if user has already registered then credentials would be asked to be logged in, after entering, details would be matched from database 
using if its matched the user will be logged in else error mesage will be displayed.

Launch:

to launch this application first database needs to be created uing sql script given ,
change the application.properties file according to your configuration and run it.
now hit n the browser localhost:{port number metioned in properties file}/login.
