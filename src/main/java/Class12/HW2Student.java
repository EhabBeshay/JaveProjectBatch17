package Class12;

public class HW2Student {
    /*
    Create  class Student that will have a method getGrade.
     Your method should accept the score of a student and
     return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */
  char getGrade (int grade){

      if (grade > 90 && grade <=100) {
          return 'A';
      } else if (grade > 80 && grade <=90) {
          return 'B';

      } else if (grade > 70 && grade <=80) {
          return 'C';

      } else if (grade <= 70 && grade >50) {
          return 'D';

      } else if (grade>=0 && grade <= 50 ) {
          return 'F';

      }

      return 0;
  }
}
