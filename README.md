# Fiix's API Exercise
Welcome to Fiix's API Exercise.

This will teach you how to use Fiix's API.

## Setting up:

Download and install the [latest JDK from Adopt Open JDK](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspo)

Download and install [STS 4](https://download.springsource.com/release/STS4/4.2.0.RELEASE/dist/e4.11/spring-tool-suite-4-4.2.0.RELEASE-e4.11.0-macosx.cocoa.x86_64.dmg)

Download this as a zip and expand to `~/Documents/learning`

You should have `~/Documents/learning/api-exercise`

Open STS, the default workspace is fine

In the **File** menu, go to **Import...**

Under the Maven folder, choose **Existing Maven Projects**

Select the `~/Documents/learning/api-exercise` folder

Click OK

This should import the project.

In the package explorer, you should see the `api-exercise` folder.

Right click on it and select **Run As** > **Spring Boot App**

You should see in your **Console** pane the phrase `I am learning Fiix's API!`

## Project Layout

This application has a standard Maven layout.  Source code is kept under `src/main/java`, 
configuration is kept under `src/main/resources` and tests are under `src/test/java`  As 
you will not be writing tests, you will be focusing mainly 
on files under `src/main/java`.  Under `src/main/java` you'll find a file called `user-site-group-mappings.csv`. 
 This is a sample of a csv that you will import and use to modify data over the API.

Under the root of the project is a file called `pom.xml`  This is the build and dependency 
management file.  It is often called "the pom".  Remember where this is, you will need it later.

`ApiExerciseApplication.java` is your main class.  This is the entry point to the application.

## Tips

`Command + Shift + r` pulls up the "Open Resource" window that allows you to start typing 
a file name and open any file.

You can add `System.out.println(...)` and print whatever you need to the console.  
This is useful to help you understand what's happening.

Learn eclipse debugging [here](https://www.eclipse.org/community/eclipse_newsletter/2017/june/article1.php).

 