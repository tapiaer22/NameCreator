# NameCreator
Create completely random names based on human linguistic patterns. Suitable for name generation on projects, finding unique names, or just entertainment

> **NOTE:** Due to the randomness process in name generation, there is a small chance that some generated names may contain inappropriate words. This is highly unlikely, but please be aware if you're using this in contexts that require strict word filters.

## Try the Code

To generate names of specified lengths, try here:

<a href="https://tapiaer22.github.io/NameCreator/" target="_blank">Interactive Code for NameCreator</a>

## Features
- Generate random names with no parameters (Default length = 5).
- Customize name length based on user input.
- Names follow natural linguistic patterns to sound more human-like.

## Usage

After installation, you can generate random names:

### Example 1: Generate a random name of default length
```java
NameCreator nameCreator = new NameCreator();
String randomName = nameCreator.randomName();
System.out.println(randomName);  // Output: Random generated name of 5 letters
```

### Example 2: Generate a random name of specified length
```java
NameCreator nameCreator = new NameCreator();
String randomName = nameCreator.randomName(9);
System.out.println(randomName); //Output: Random generated name of 9 letters
```

### Example 3: Generate a List of 3 random names of length 5
```java
NameCreator nameCreator = new NameCreator();
List<String> randomNames = nameCreator.randomNameList(3,5);
System.out.println(randomNames); //Output: List of 3 names of 5 letters each
```



