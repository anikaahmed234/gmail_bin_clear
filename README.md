# Gmail Automated Message Deletion Script
This script is a Java/Selenium automated test that deletes messages from a Gmail account using the Chrome browser.

# Prerequisites
To run this script, you will need:

Java Development Kit (JDK) installed on your machine
Chrome browser installed on your machine
ChromeDriver executable for your version of Chrome installed on your machine
Selenium Java client library added to your project dependencies
Configuration
Before running the script, you will need to update the config.properties file with your Gmail account credentials and the number of messages you want to delete.

# Usage
To run the script, navigate to the project directory in your terminal and run the following command:

shell
Copy code
$ mvn test
The script will launch the Chrome browser and automatically log in to your Gmail account. It will then delete the specified number of messages from your inbox.

# Troubleshooting
If you encounter any issues while running the script, try the following:

Make sure you have updated the config.properties file with the correct Gmail account credentials and message count.
Check that you have installed the Chrome browser and ChromeDriver executable for your version of Chrome.
Verify that you have added the Selenium Java client library to your project dependencies.
If you still encounter issues, check the Selenium logs for error messages and try to resolve any issues indicated in the logs.
Contributing
Contributions to this project are welcome! If you find a bug or have an idea for a new feature, please open an issue or submit a pull request.
