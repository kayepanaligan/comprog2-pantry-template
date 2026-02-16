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

# 🛒 Assignment: The Smart Pantry Manager

**Course:** CS 612 - Computer Programming 2  
**Topic:** Arrays, Methods, and Conditional Logic (`if-else`)

---

## 🎯 Project Overview
In this assignment, you will complete a Java program that manages a food pantry's inventory. You are provided with two arrays: one for **item names** and one for their **current quantities**. Your job is to implement the logic for restocking items and checking their supply status.

---

## 💻 Technical Tasks
Open the file `src/PantryManager.java` and complete the following methods:

### 1. `restockItem(int index, int amount)`
Implement the logic to add stock to an item.
* **Rule:** The maximum capacity for any single item is **20**.
* **Logic:** * If `current quantity + amount` is **greater than 20**, do not change the array and return `false`.
    * Otherwise, update the array at the given `index` and return `true`.

### 2. `checkStatus(int index)`
Implement the logic to return a status string based on the current quantity at `index`.
* **Logic:**
    * Return `"Critical"` if the quantity is exactly **0**.
    * Return `"Low"` if the quantity is between **1 and 3** (inclusive).
    * Return `"OK"` if the quantity is **4 or more**.
* **Note:** The strings are **case-sensitive**!

---

## 🛠️ Project Structure
Your repository contains the following folders:
* `src/`: Contains `PantryManager.java` (the file you edit) and `PantryTest.java` (the test file).
* `lib/`: Contains the necessary JUnit libraries for the autograder. **Do not delete or move these files.**

---

## 🚀 How to Submit
This assignment uses **GitHub Classroom Autograding**. To submit:

1.  **Code:** Complete the logic in `PantryManager.java`.
2.  **Commit & Push:** Save your changes and push them to your GitHub repository.
    ```bash
    git add .
    git commit -m "Completed pantry logic"
    git push origin main
    ```
3.  **Check Grade:**
    * Go to your repository on GitHub.com.
    * Click the **Actions** tab.
    * Look for the latest workflow run. A **Green Checkmark (✅)** means you passed! A **Red X (❌)** means you need to fix your logic.
    * You can also see your score in the **Points** section of the feedback pull request.

---

## ⚠️ Important Reminders
* **Do not modify `PantryTest.java`.** This file is protected; changing it will flag your submission.
* **No package declarations.** Ensure your Java files **do not** have `package src;` at the top, or the autograder will fail to compile.
* **Unlimited Attempts:** You can push fixes as many times as you need before the deadline.

---

## 💡 Pro-Tip for Students
If you are failing a test, click on the **"Autograding"** run inside the **Actions** tab. It will show you exactly which test failed (e.g., *"Expected 'Critical' but was 'Low'"*). Use this feedback to debug your code!
