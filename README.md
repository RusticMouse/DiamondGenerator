# DiamondGenerator

This Java program generates diamond patterns that you can print and enjoy. You can create diamond shapes with customizable properties.

## Features

- Create diamond shapes with a specified number of the size of the diamond shape.
- Customize the decoration of the diamond shape with your choice of characters.

## Usage

You can use the `DiamondGenerator` class to create diamond shapes:

### Creating a Diamond Shape

To create a diamond shape with a specified size of the diamond shape using the default decoration (asterisks `*`), you can use the `createDiamond` method:

```java
String diamond = DiamondGenerator.createDiamond(size, symbol);
```

## Printing the Diamond
You can then print the generated diamond shape using System.out.println() or save it to a file.

## Example

Here's a simple example of how to use the DiamondGenerator class to create a Diamond shape:
```java
public class Main {
    public static void main(String[] args) {
    String diamond = DiamondGenerator.createDiamond(5,"*");
    System.out.println(diamond);
    }
}
```
This will generate and print a diamond shape with a size of 5 using asterisks as decoration.

# BUT WHY???
IDK dude, just wanted to show that i'm better than c4vxl
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```
---
## Developer
This Project was developed by [rusticmouse]
