package com.employee.util;

public class EmpnoUtil {
	public static String createEmpno(String empno) {
		//���empno�ĵ�һλ�͵ڶ�λ��0������£���˵������Ǹ�λ��
		if(empno.charAt(0)=='0' && empno.charAt(1)=='0') {
			int no = Integer.parseInt(empno.substring(2))+1;
			if(no<10) {
				return "00"+no;
			}else{
				return "0"+no;
			}
			
		}
		//���ֻ�е�һλΪ0
		else if(empno.charAt(0)=='0') {
			int no = Integer.parseInt(empno.substring(1))+1;
			if(no<100) {
				return "0"+no;
			}else{
				return ""+no;
			}
		}
		//�����һλ��Ϊ0
		else {
			int no = Integer.parseInt(empno)+1;
				return ""+no;
			
		}
	}

}
