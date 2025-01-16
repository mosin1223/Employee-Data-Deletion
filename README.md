Employee Data Deletion
This is a simple Java program to delete employee data from a MySQL database using JDBC.

Features
Connects to a MySQL database using JDBC.
Deletes a specific row from the employees table based on the Emp_id.
Displays a success or failure message based on the operation.
Technologies Used
Java
JDBC (Java Database Connectivity)
MySQL
Prerequisites
MySQL Database with a table named employees in the students database containing the following columns:

Emp_id (int): Employee ID
Emp_name (varchar): Employee name
Emp_salary (double): Employee salary.
JDBC Driver (com.mysql.cj.jdbc.Driver) installed.

Database connection details:

Host: localhost
Port: 3306
Database: students
Username: root
Password: root177.
How to Run
Clone this repository:

bash
Copy code
git clone https://github.com/<your-username>/Employee-Data-Deletion.git
Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

Update database connection details in the DataDeletion.java file, if necessary.

Compile and run the program:

bash
Copy code
javac DataDeletion.java
java DataDeletion
Example Output
If the deletion is successful:

text
Copy code
1 row deleted successfully
If no matching row is found:

text
Copy code
Not deleted
Contributing
Contributions are welcome! If you find any issues or have suggestions, feel free to open an issue or submit a pull request.

