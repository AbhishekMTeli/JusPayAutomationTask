# Payment Automation Testing Framework

## 📌 Project Overview
This project is a **Selenium-based test automation framework** designed to validate the payment process on an e-commerce platform. It follows the **Page Object Model (POM)** and uses **TestNG** for test execution.

## 📂 Project Structure


src/
│── base/
│   ├── BaseConfiguration.java  # Contains setup and teardown methods
│── pages/
│   ├── HomePage.java           # Page class for homepage actions
│   ├── ProductPage.java        # Page class for product details
│   ├── CheckoutPage.java       # Page class for checkout steps
│── utilities/
│   ├── CommonActions.java      # Utility methods for interaction
│── tests/
│   ├── PaymentAutomation.java  # Test case execution


## 🛠 Setup Instructions
### ✅ Prerequisites
- **Java 8 or later**
- **Maven**
- **TestNG**
- **Selenium WebDriver**
- **Google Chrome & ChromeDriver**

### 🔧 Installation
1. Clone the repository:
   ```bash
   git clone [<repository_url>](https://github.com/AbhishekMTeli/JusPayAutomationTask)
Framework Components
🏗 1️⃣ Base Configuration (BaseConfiguration.java)
Handles browser setup and teardown

Initializes the WebDriver
🛠 2️⃣ Common Utility Class (CommonActions.java)
Provides helper methods for interacting with UI elements:

click(By locator): Clicks on an element
enterText(By locator, String text): Enters text into an input field
pressEnter(): Simulates pressing the Enter key
switchToNewWindow(): Switches focus to a new browser tab

📑 3️⃣ Page Object Model (POM)
Each webpage has a dedicated class:

HomePage.java → Handles product search functionality
ProductPage.java → Manages product selection and adding to cart
CheckoutPage.java → Automates checkout and payment process

🧪 4️⃣ Test Case (PaymentAutomation.java)
Executes the end-to-end payment flow
Uses TestNG for structured test execution

🔄 Test Flow
Search for a product (e.g., JBL speakers) on the homepage.
Select a product from the search results.
Add the product to the cart.
Proceed to checkout.
Enter mobile number and payment details.
⚡ Best Practices
Use explicit waits instead of Thread.sleep()
Store test data in a separate config file
Implement logging for debugging
🚀 Future Enhancements
Add support for Firefox & Edge browsers
Implement data-driven testing using TestNG DataProvider
Integrate Extent Reports for improved test reporting
👨‍💻 Author
Abhishek
