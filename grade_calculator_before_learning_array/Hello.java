import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		
		String name, grade, avg_grade, name_1, name_2, name_3, name_4, grade_1, grade_2, 			grade_3, grade_4;

		int mid, fin, attendance, assignment, student, mid_1, mid_2, mid_3, mid_4, fin_1, fin_2, 		fin_3, fin_4,assignment_1, assignment_2, assignment_3, assignment_4, attendance_1, 			attendance_2, attendance_3, attendance_4;

		int  grade_a = 0, grade_b=0, grade_c=0,grade_d=0,grade_f = 0;

		double total, total_1, total_2, total_3, total_4, avg_total;
		
		//���α׷� ���۽� �Է�â
		System.out.println("-----�������� ���α׷� �Դϴ�-----");
		System.out.println("-----������ �л��� ���� �Է��ϼ���.-----");
		System.out.print(">");
		student = new Scanner(System.in).nextInt();
		
		
		switch(student) {
		case 3 :
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			double doubletotal = ((mid*0.3)+(fin*0.3)+(attendance*0.15)+(assignment*0.25))*10;
			int inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total= doubletotal/10;
			
			// �������� �������ϱ�, ������ �ο� ī��Ʈ
			if(total>=90) {
				grade= "A";
				grade_a++;
			} else if (total >= 80) {
				grade = "B";
				grade_b++;
			} else if (total >= 70) {
				grade = "C";
				grade_c++;
			} else if (total >= 60) {
				grade = "D";
				grade_d++;
			} else {
				grade = "F";
				grade_f++;
			} 

			//2��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_1 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_1 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_1 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_1 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_1 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal =((mid_1*0.3)+(fin_1*0.3)+(attendance_1*0.15)+(assignment_1*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_1 = doubletotal/10;
			// �������� �������ϱ�, ������ �ο� ī��Ʈ
			if(total_1>=90) {
				grade_1= "A";
				grade_a++;
			} else if (total_1 >= 80) {
				grade_1 = "B";
				grade_b++;
			} else if (total_1 >= 70) {
				grade_1 = "C";
				grade_c++;
			} else if (total_1 >= 60) {
				grade_1 = "D";
				grade_d++;
			} else {
				grade_1 = "F";
				grade_f++;
			} 

			//3��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_2 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_2 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_2 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_2 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_2 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid_2*0.3)+(fin_2*0.3)+(attendance_2*0.15)+(assignment_2*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_2 = doubletotal/10;
			
			// �������� �������ϱ�, ������ �ο� ī��Ʈ
			if(total_2>=90) {
				grade_2= "A";
				grade_a++;
			} else if (total_2 >= 80) {
				grade_2 = "B";
				grade_b++;
			} else if (total_2 >= 70) {
				grade_2 = "C";
				grade_c++;
			} else if (total_2 >= 60) {
				grade_2 = "D";
				grade_d++;
			} else {
				grade_2 = "F";
				grade_f++;
			} 
			//����������� ��� �������ϱ�
			avg_total = (total+total_1+total_2)/3;
			double avg_total2 = avg_total*10;
			int int_avg_total2 = (int)avg_total2;
			avg_total2 = int_avg_total2;
			avg_total2=avg_total2/10;
			
			int intavg_total = (int)avg_total;
			
			switch(intavg_total/10) {
			 case 9 :
				 avg_grade = "A";
				 break;
			 case 8 :
				 avg_grade = "B";
				 break;
			 case 7 :
				 avg_grade = "c";
				 break;
			 case 6 :
				 avg_grade = "D";
				 break;
			 default :
				 avg_grade = "F";
				 break;
			 }

			//����ǥ ���
			System.out.println("==================================================");
			System.out.println("================������ ����Ǿ����ϴ�.===================");
			System.out.println("==================================================");
			System.out.println("�̸�"+" "+"�߰�"+" "+"�⸻"+" "+"�⼮"+" "+"����"+" "+"����"+" "+"����");
			System.out.println("--------------------------------------------------");
			System.out.println(name+"   "+ mid+"   " + fin+"   " + attendance+"  " + 						   assignment+"  " +total+"  "+grade);
			System.out.println(name_1+"   "+ mid_1+"   " + fin_1+"   " + attendance_1+"  " + 					   assignment_1+"  " +total_1+"  "+grade_1);
			System.out.println(name_2+"   "+ mid_2+"   " + fin_2+"   " + attendance_2+"  " + 					   assignment_2+"  " +total_2+"  "+grade_2);
			System.out.println("==================================================");
			
			//�߰����1
			System.out.println("�����ο�:"+ student);
			System.out.println("��ü�������:"+ avg_total2 );
			System.out.println("��ü�������:"+ avg_grade);
			System.out.println("==================================================");
			
			//�߰����2
			System.out.println("����"+" "+"�ο���");
			System.out.println("----------------------");
			System.out.println("A:"+" "+grade_a);
			System.out.println("B:"+" "+grade_b);
			System.out.println("C:"+" "+grade_c);
			System.out.println("D:"+" "+grade_d);
			System.out.println("F:"+" "+grade_f);
			break;
			
		case 4 :
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name = new Scanner(System.in).nextLine();
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid*0.3)+(fin*0.3)+(attendance*0.15)+(assignment*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total = doubletotal/10;
			
			// �������� �������ϱ�, ������ �ο� ī��Ʈ
			if(total>=90) {
				grade= "A";
				grade_a++;
			} else if (total >= 80) {
				grade = "B";
				grade_b++;
			} else if (total >= 70) {
				grade = "C";
				grade_c++;
			} else if (total >= 60) {
				grade = "D";
				grade_d++;
			} else {
				grade = "F";
				grade_f++;
			} 
			
			//2��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_1 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_1 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_1 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_1 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_1 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid_1*0.3)+(fin_1*0.3)+(attendance_1*0.15)+(assignment_1*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_1 = doubletotal/10;
			
			// �������� �������ϱ�
			if(total_1>=90) {
				grade_1= "A";
				grade_a++;
			} else if (total_1 >= 80) {
				grade_1 = "B";
				grade_b++;
			} else if (total_1 >= 70) {
				grade_1 = "C";
				grade_c++;
			} else if (total_1 >= 60) {
				grade_1 = "D";
				grade_d++;
			} else {
				grade_1 = "F";
				grade_f++;
			}

			//3��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_2 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_2 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_2 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_2 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_2 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid_2*0.3)+(fin_2*0.3)+(attendance_2*0.15)+(assignment_2*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_2 = doubletotal/10;
			
			// �������� �������ϱ�
			if(total_2>=90) {
				grade_2= "A";
				grade_a++;
			} else if (total_2 >= 80) {
				grade_2 = "B";
				grade_b++;
			} else if (total_2 >= 70) {
				grade_2 = "C";
				grade_c++;
			} else if (total_2 >= 60) {
				grade_2 = "D";
				grade_d++;
			} else {
				grade_2 = "F";
				grade_f++;
			}

			//4��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_3 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_3 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_3 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_3 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_3 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid_3*0.3)+(fin_3*0.3)+(attendance_3*0.15)+(assignment_3*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_3 = doubletotal/10;
			
			// �������� �������ϱ�
			if(total_3>=90) {
				grade_3= "A";
				grade_a++;
			} else if (total_3 >= 80) {
				grade_3 = "B";
				grade_b++;
			} else if (total_3 >= 70) {
				grade_3 = "C";
				grade_c++;
			} else if (total_3 >= 60) {
				grade_3 = "D";
				grade_d++;
			} else {
				grade_3 = "F";
				grade_f++;
			}
			//����������� ��� �������ϱ� (�Ҽ��� ù°�ڸ����� ǥ��)
			avg_total = (total+total_1+total_2+total_3)/4;
			avg_total2 = avg_total*10;
			int_avg_total2 = (int)avg_total2;
			avg_total2 = int_avg_total2;
			avg_total2=avg_total2/10;
			
			int intavg_total1 = (int)avg_total;
			
			switch(intavg_total1/10) {
			 case 9 :
				 avg_grade = "A";
				 break;
			 case 8 :
				 avg_grade = "B";
				 break;
			 case 7 :
				 avg_grade = "c";
				 break;
			 case 6 :
				 avg_grade = "D";
				 break;
			 default :
				 avg_grade = "F";
				 break;
			 }
			
			//����ǥ ���
			System.out.println("==================================================");
			System.out.println("================������ ����Ǿ����ϴ�.===================");
			System.out.println("==================================================");
			System.out.println("�̸�"+" "+"�߰�"+" "+"�⸻"+" "+"�⼮"+" "+"����"+" "+"����"+" "+"����");
			System.out.println("--------------------------------------------------");
			System.out.println(name+"   "+ mid+"   " + fin+"   " + attendance+"  " + 						   assignment+"  " +total+"  "+grade);
			System.out.println(name_1+"   "+ mid_1+"   " + fin_1+"   " + attendance_1+"  " + 					   assignment_1+"  " +total_1+"  "+grade_1);
			System.out.println(name_2+"   "+ mid_2+"   " + fin_2+"   " + attendance_2+"  " + 					   assignment_2+"  " +total_2+"  "+grade_2);
			System.out.println(name_3+"   "+ mid_3+"   " + fin_3+"   " + attendance_3+"  " + 					   assignment_3+"  " +total_3+"  "+grade_3);
			System.out.println("==================================================");
			
			//�߰����1
			System.out.println("�����ο�:"+ student);
			System.out.println("��ü�������:"+ avg_total2 );
			System.out.println("��ü�������:"+ avg_grade);
			System.out.println("==================================================");

			//�߰����2
			System.out.println("����"+" "+"�ο���");
			System.out.println("----------------------");
			System.out.println("A:"+" "+grade_a);
			System.out.println("B:"+" "+grade_b);
			System.out.println("C:"+" "+grade_c);
			System.out.println("D:"+" "+grade_d);
			System.out.println("F:"+" "+grade_f);
			break;
			
		case 5 :
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name = new Scanner(System.in).nextLine();
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid*0.3)+(fin*0.3)+(attendance*0.15)+(assignment*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total= doubletotal/10;
			
			// �������� �������ϱ�
			if(total>=90) {
				grade= "A";
				grade_a++;
			} else if (total >= 80) {
				grade = "B";
				grade_b++;
			} else if (total >= 70) {
				grade = "C";
				grade_c++;
			} else if (total >= 60) {
				grade = "D";
				grade_d++;
			} else {
				grade = "F";
				grade_f++;
			} 

			//2��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_1 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_1 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_1 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_1 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_1 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid_1*0.3)+(fin_1*0.3)+(attendance_1*0.15)+(assignment_1*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_1 = doubletotal/10;
			
			// �������� �������ϱ�
			if(total_1>=90) {
				grade_1= "A";
				grade_a++;
			} else if (total_1 >= 80) {
				grade_1 = "B";
				grade_b++;
			} else if (total_1 >= 70) {
				grade_1 = "C";
				grade_c++;
			} else if (total_1 >= 60) {
				grade_1 = "D";
				grade_d++;
			} else {
				grade_1 = "F";
				grade_f++;
			}

			//3��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_2 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_2 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_2 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_2 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_2 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid_2*0.3)+(fin_2*0.3)+(attendance_2*0.15)+(assignment_2*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_2 = doubletotal/10;
			
			
			// �������� �������ϱ�
			if(total_2>=90) {
				grade_2= "A";
				grade_a++;
			} else if (total_2 >= 80) {
				grade_2 = "B";
				grade_b++;
			} else if (total_2 >= 70) {
				grade_2 = "C";
				grade_c++;
			} else if (total_2 >= 60) {
				grade_2 = "D";
				grade_d++;
			} else {
				grade_2 = "F";
				grade_f++;
			}
			
			//4��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_3 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_3 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_3 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_3 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_3 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid_3*0.3)+(fin_3*0.3)+(attendance_3*0.15)+(assignment_3*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_3 = doubletotal/10;
			
			// �������� �������ϱ�
			if(total_3>=90) {
				grade_3= "A";
				grade_a++;
			} else if (total_3 >= 80) {
				grade_3 = "B";
				grade_b++;
			} else if (total_3 >= 70) {
				grade_3 = "C";
				grade_c++;
			} else if (total_3 >= 60) {
				grade_3 = "D";
				grade_d++;
			} else {
				grade_3 = "F";
				grade_f++;
			}

			//5��° ���
			System.out.println("==================================================");
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.print(">");
			name_4 = new Scanner(System.in).nextLine();
			
			System.out.println("�߰���� ������ �Է��ϼ���.");
			System.out.print(">");
			mid_4 = new Scanner(System.in).nextInt();
			
			System.out.println("�⸻��� ������ �Է��ϼ���.");
			System.out.print(">");
			fin_4 = new Scanner(System.in).nextInt();
			
			System.out.println("�⼮ ������ �Է��ϼ���.");
			System.out.print(">");
			attendance_4 = new Scanner(System.in).nextInt();
			
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print(">");
			assignment_4 = new Scanner(System.in).nextInt();
			
			//����(�Ҽ��� ù°�ڸ����� ǥ��)
			doubletotal = ((mid_4*0.3)+(fin_4*0.3)+(attendance_4*0.15)+(assignment_4*0.25))*10;
			inttotal = (int) doubletotal;
			doubletotal = inttotal;
			total_4 = doubletotal/10;
			
			
			// �������� �������ϱ�
			if(total_4>=90) {
				grade_4= "A";
				grade_a++;
			} else if (total_4 >= 80) {
				grade_4 = "B";
				grade_b++;
			} else if (total_4 >= 70) {
				grade_4 = "C";
				grade_c++;
			} else if (total_4 >= 60) {
				grade_4 = "D";
				grade_d++;
			} else {
				grade_4 = "F";
				grade_f++;
			}

			//����������� ��� �������ϱ� (�Ҽ��� ù°�ڸ����� ǥ��)
			avg_total = (total+total_1+total_2+total_3+total_4)/5;
			avg_total2 = avg_total*10;
			int_avg_total2 = (int)avg_total2;
			avg_total2 = int_avg_total2;
			avg_total2=avg_total2/10;
			
			int intavg_total2 = (int)avg_total;
			
			switch(intavg_total2/10) {
			 case 9 :
				 avg_grade = "A";
				 break;
			 case 8 :
				 avg_grade = "B";
				 break;
			 case 7 :
				 avg_grade = "c";
				 break;
			 case 6 :
				 avg_grade = "D";
				 break;
			 default :
				 avg_grade = "F";
				 break;
			 }

			//����ǥ ���
			System.out.println("==================================================");
			System.out.println("================������ ����Ǿ����ϴ�.===================");
			System.out.println("==================================================");
			System.out.println("�̸�"+" "+"�߰�"+" "+"�⸻"+" "+"�⼮"+" "+"����"+" "+"����"+" "+"����");
			System.out.println("--------------------------------------------------");
			System.out.println(name+"   "+ mid+"   " + fin+"   " + attendance+"  " + 						   assignment+"  " +total+"  "+grade);
			System.out.println(name_1+"   "+ mid_1+"   " + fin_1+"   " + attendance_1+"  " + 					   assignment_1+"  " +total_1+"  "+grade_1);
			System.out.println(name_2+"   "+ mid_2+"   " + fin_2+"   " + attendance_2+"  " + 					   assignment_2+"  " +total_2+"  "+grade_2);
			System.out.println(name_3+"   "+ mid_3+"   " + fin_3+"   " + attendance_3+"  " + 					   assignment_3+"  " +total_3+"  "+grade_3);
			System.out.println(name_4+"   "+ mid_4+"   " + fin_4+"   " + attendance_4+"  " + 					   assignment_4+"  " +total_4+"  "+grade_4);
			System.out.println("==================================================");
			
			//�߰����1
			System.out.println("�����ο�:"+ student);
			System.out.println("��ü�������:"+ avg_total2 );
			System.out.println("��ü�������:"+ avg_grade);
			System.out.println("==================================================");

			//�߰����2
			System.out.println("����"+" "+"�ο���");
			System.out.println("----------------------");
			System.out.println(" A:"+" "+grade_a);
			System.out.println(" B:"+" "+grade_b);
			System.out.println(" C:"+" "+grade_c);
			System.out.println(" D:"+" "+grade_d);
			System.out.println(" F:"+" "+grade_f);
			break;
		default :
			System.out.print("�����ο��� �ּ� 3��, �ִ� 5���̾���մϴ�");
		}
			 	
	}
}