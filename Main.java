import java.util.Scanner;

/**
 *
 * @author
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in); // create a scanner for user input
    int maxStudents = 5; // hold up to five answers
    String[] correctAnswers = new String[maxStudents]; // create a sting fir the correctAnswers
    String[] studentAnswers = new String[maxStudents];// create a steing for stundents answer // we use a sting beacsue
                                                      // it a group of charters

    System.out.println("please enter the correct answers"); // orints the message
    int i; // delcare varb
    for (i = 0; i < correctAnswers.length; i++) // get user answer and sttore them in a array
    {
      correctAnswers[i] = input.nextLine(); // stores the ANswerss
    }
    int k;
    System.out.println("please enter the students answers"); // ask for student answer
    for (k = 0; k < studentAnswers.length; k++) // creats a array and stoes the students answers
    {
      studentAnswers[k] = input.nextLine(); // store the stuents answer
    }
    int numOfCorrect = 0; // start count from 1

    int j; // delacre varbile
    for (j = 0; j < 5; j++) // coutns the corret answers
    {
      if (correctAnswers[j].equals(studentAnswers[j])) // comepring answers
      {
        numOfCorrect++; // add to coreet answer
      }
    }
    System.out.println("The student got " + numOfCorrect + " answers correct"); // prits out
  }

}
