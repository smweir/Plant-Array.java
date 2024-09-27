//Flower and Plant Classes provided by Professor

The PlantArrayListExample program creates an interactive console application that allows users to add Plant and Flower objects to an ArrayList. It then prints detailed information about each plant, including specific attributes for flowers.

Key Components of the Code
Imports:
The program imports necessary classes from the Java standard library, including Scanner for input and ArrayList for dynamic array management.

printArrayList Method:
This method takes an ArrayList of Plant objects as input and iterates through it.
For each plant, it calls the printInfo method to print basic information.
If a plant is an instance of Flower, it casts the plant to a Flower and prints additional attributes such as whether it's an annual and the color of the flowers.

Main Method:
This is where the program execution starts.
It initializes a Scanner object for user input and an ArrayList to store the plants.
A loop continues to read user input until -1 is entered.
If the user enters "plant," it reads the plant's name and cost, creates a Plant object, and adds it to the garden.
If the user enters "flower," it reads the flower's name, cost, annual status, and color, creates a Flower object, and adds it to the garden.
Finally, it calls printArrayList to display all the plants in the garden.
