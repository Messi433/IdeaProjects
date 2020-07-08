package com.employee.util;

public class EmpnoUtil {
	public static String createEmpno(String empno) {
		//如果empno的第一位和第二位是0的情况下，则说明编号是各位数
		if(empno.charAt(0)=='0' && empno.charAt(1)=='0') {
			int no = Integer.parseInt(empno.substring(2))+1;
			if(no<10) {
				return "00"+no;
			}else{
				return "0"+no;
			}
			
		}
		//如果只有第一位为0
		else if(empno.charAt(0)=='0') {
			int no = Integer.parseInt(empno.substring(1))+1;
			if(no<100) {
				return "0"+no;
			}else{
				return ""+no;
			}
		}
		//如果第一位不为0
		else {
			int no = Integer.parseInt(empno)+1;
				return ""+no;
			
		}
	}

}
