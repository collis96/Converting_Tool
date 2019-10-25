# Unit Conversion Tool (Mobile, Android)

This is an android project for converting units.

Many thanks to @MathewHG for bringing the idea to life by helping elicit requirements, test features and for creating the mock adobe design!

Play Store Link: https://play.google.com/store/apps/details?id=com.arcticumi.Conversion_Toolkit&hl=en_GB

#### Requirements

##### Expressed User requirements:

 - As many areas of conversion availible
 - Live currency conversion
 - Easy to navigate interface
 - Clean design
  
##### System requirements: 

 - An XML parsing class that will retrieve the relavent information for a specificed currency. Such information will include; conversion number, country code from and country code to.
 - A class to handle multithreading when recieving xml data from the internet. This class will implement the AsyncTask Android class.
 - A class to contain all conversions between 2 units, these are to be stored locally so will not need internet access.
 - A class to handle any number post-formatting before outputting to the user.
 - Adopt the navigation drawer layout for easy navigation of the app.

#### Design @MathewHG

<img src="https://i.imgur.com/f4vTKfK.png">

