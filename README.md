# comprog2-pantry-template
Students must create a program that tracks food items. They will implement a method to add items and a method to check if an item needs restocking based on a threshold.

# Assignment: The Smart Pantry
Welcome to your first ComProg 2 assignment!

### Task:
You need to complete the methods in `PantryManager.java`:
1. **restockItem(int index, int amount)**:
   - Check if adding `amount` exceeds the capacity (20).
   - If okay, update the array and return `true`.
   - If not, return `false`.
2. **checkStatus(int index)**:
   - Use `if-else` to return "Critical" (0), "Low" (1-3), or "OK" (4+).

### How to Submit:
Simply `git commit` and `git push` your changes. The autograder will run automatically!
