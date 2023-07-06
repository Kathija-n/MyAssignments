package org.student;

import org.college.College;
import org.department.Department;

public class Student extends College

{
		public void studentName(){		
			System.out.println("Kathija Ziya");
	}
		public void studentDept(){		
				System.out.println("B.Tech-I.T");
		}

     public void studentId(){		
					System.out.println("1101132017017");
			}
	
	public static void main(String[] args) {
		
		Student My = new Student();
			My.studentName();
			My.studentDept();
			My.studentId();
			My.collegeName();
			My.collegeCode();
			My.collegeRank();
			My.deptName();
		    
			
		}

	}
