I have used Gradle as a build tool,Java as a Language , Selenium as a Automation Tool and Page Object Model as a Frame Work

Please find the below steps to run the Project using Command Prompt


Open Command Prompt

Change the current directory to C:

NOTE:Donot change the directory or make any folder,as the directory used is specific to the location of the Chromedriver.exe

then follow the below steps:

1.git clone https://github.com/ShrishtiSaxena/Shippable-QA-Screening-Test.git

2.cd Shippable-QA-Screening-Test\Shippable

3.To Check the Succesfull SignIn,run the below command on command prompt

gradle -Dtest.single=SuccessfullSignInPageTest Test

4.To Check the UnSuccesfull SignIn,run the below command on command prompt

gradle -Dtest.single=UnsuccessfullSignInPageTest Test

To Check the Reports

Naviagte to the below Path and see the HTML Reports as 

checkSignInTest.SuccessfullSignInPageTest for Successfull Sign In
and
checkSignInTest.UnsuccessfullSignInPageTest for UnSuccessfull Sign In


Report Path
C:\Shippable-QA-Screening-Test\Shippable\build\reports\tests\test\classes
