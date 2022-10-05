package examAverage;
import java.util.Scanner;

public class AverageStructure {
   public static void main(String[] args) {
      // 우리반 국어,영어,수학 성적의 평균 구하기
      //Exam exam = new Exam();
      
      //Exam[] exams = new Exam[3];
      //int cnt = 0;
      
      ExamList list = new ExamList();
      list.cnt = 0;
      list.exams =  new Exam[3];
      
      int menu;
      boolean keepLoop = true;
      
      while(keepLoop) {
         menu = 메인메뉴();
         switch(menu) {
            case 1 : // menu==1
               성적입력(list);
               break;               
            case 2 : // menu==2
               성적출력(list);
               break;
            case 3 : // menu==3
               System.out.println("ByeBye~");
               keepLoop = false;
               break;
            default : // menu가 1,2,3이 아닐경우
               System.out.println("range 1~3");
         }
      }      
   }
   
   static int 메인메뉴() {
      Scanner sc = new Scanner(System.in);
      
      System.out.printf("┌─────────── 0.main menu ───────────┐\n");
      System.out.printf("│   1.input    2.print    3.exit    │\n");
      System.out.printf("└───────────────────────────────────┘");   
      ;
      return sc.nextInt();
   }

   
   
   static void 성적출력(ExamList list) {
      System.out.println("┌───────────────────────────────────┐");
      System.out.println("│           2.print score           │");
      System.out.println("└───────────────────────────────────┘");
      
      int size = list.cnt;
      Exam [] ex = list.exams;
      
      for(int i=0; i<size;i++) {
         
         int kor = ex[i].kor;
         int eng = ex[i].eng;
         int math = ex[i].math;
         
         int total = kor + eng + math;
         float avg = total / 3f;
         
         System.out.printf("kor: %d \t", kor);
         System.out.printf("eng: %d \t", eng);
         System.out.printf("math: %d \t", math);
         
         System.out.println();
         System.out.printf("total: %3d \n", total);
         System.out.printf("average: %6.2f \n", avg);
         System.out.println("────────────────────────────────────");
         System.out.println("────────────────────────────────────");
         
      }
   }
   
   
   static void 성적입력(ExamList list) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("┌───────────────────────────────────┐");
      System.out.println("│           1.input score           │");
      System.out.println("└───────────────────────────────────┘");
      
      int kor, eng, math;
      
         
         do {
            System.out.printf("input kor score!!");
            kor = sc.nextInt();
            
            if(kor<0 || kor>100){
               System.out.println("range is 0~100");
            }            
         }while(kor<0 || kor>100);
         
         do {
            System.out.printf("input eng score!!");
            eng = sc.nextInt();
            
            if(eng<0 || eng>100){
               System.out.println("range is 0~100");
            }            
         }while(eng<0 || eng>100);
         
         do {
            System.out.printf("input math score!!");
            math = sc.nextInt();
            
            if(math<0 || math>100){
               System.out.println("range is 0~100");
            }            
         }while(math<0 || math>100);
         
         Exam exam = new Exam(); 
         
         exam.kor = kor;
         exam.eng = eng;
         exam.math = math;
         
         
         list.exams[list.cnt] = exam;
         list.cnt++;
         
      System.out.println("────────────────────────────────────");
      System.out.println("────────────────────────────────────");
   }
}
