# Hydration Calculator

An application built with Java Swing that helps bakers calculate flour, water, hydration level, or sourdough starter amounts for both normal yeast bread and sourdough bread.

The calculator guides users through a series of windows to choose what type of bread they are making and which element they want to calculate. It then performs suitable calculations and provides the result.


## Features & Usage

✔️ Choose Bread Type (First window):
Normal yeast bread or Sourdough bread

![](https://github.com/ngocmai-do/Bread-Hydration-Calculator/blob/master/documentation/main-window.png?raw=true)


✔️ Choose Calculate Option (Second window):
Depending on the bread type, users can calculate:

Flour amount

Water amount

Hydration level

Starter amount (sourdough only)

“Go Back” navigation between windows

![](https://github.com/ngocmai-do/Bread-Hydration-Calculator/blob/master/documentation/option-menu1.png?raw=true)


✔️ Input of Data & Return of Result (Third window):

Dropdown for measurement unit (grams or deciliters)

Enter the required numeric values

Error handling for invalid numeric input

Click Calculate to display the result

“Go Back” navigation between windows (go back to the first window)

![](https://github.com/ngocmai-do/Bread-Hydration-Calculator/blob/master/documentation/hydration-calculation-flour.png?raw=true)



## Project Structure
The project has 3 classes: Main.java, HydrationCalculator.java, CalculatingMath.java

1/ Main.java creates an instance of the first application window

2/ HydrationCalculator.java is the main GUI that controls the application windows

3/ CalculatingMath.java contains all the mathematical hydration functions for both bread types


## Future Improvements
Option for input of protein level of the flour

