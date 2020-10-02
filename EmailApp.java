/*-EMAIL APPLICATION
*
*   Scenario: You are an IT Support Admin Specialist and are charged with the task of creating email
*             accounts for new hires
*   Scope:
*       - Generate an email with the following syntax: firstname.lastname@department.company.com
*       - Determine the department (sales, development, accounting, etc), if none leave blank
*       - Generate a random String for password
*       - Have set methods to change the password, set the mailbox capacity, and define an alternate
*         email address
*       - Have get methods to display the name, email, and mailbox capacity
*/

package emailApp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("FIRST NAME: ");
        String fName = in.nextLine().trim();

        System.out.print("LAST NAME: ");
        String lName = in.nextLine().trim();

        Email em1 = new Email(fName, lName);
        System.out.println(em1.showInfo());
    }
}
