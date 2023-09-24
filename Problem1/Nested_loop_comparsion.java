package Problem1;
import java.io.IOException;

public class Nested_loop_comparsion {
	public static void main(String[] args) throws IOException{
		double startTime = System.currentTimeMillis();
		method1();
		double estimated_runningtime = System.currentTimeMillis() - startTime;
		System.out.println(estimated_runningtime);
		double startTime2 = System.currentTimeMillis();
		method2();
		double estimated_runningtime2 = System.currentTimeMillis() - startTime2;
		System.out.println(estimated_runningtime2);
		double startTime3 = System.currentTimeMillis();
		method3();
		double estimated_runningtime3 = System.currentTimeMillis() - startTime3;
		System.out.println(estimated_runningtime3);
		double startTime4 = System.currentTimeMillis();
		method4();
		double estimated_runningtime4 = System.currentTimeMillis() - startTime4;
		System.out.println(estimated_runningtime4);
		double startTime5 = System.currentTimeMillis();
		method5();
		double estimated_runningtime5 = System.currentTimeMillis() - startTime5;
		System.out.println(estimated_runningtime5);
		double startTime6 = System.currentTimeMillis();
		method6();
		double estimated_runningtime6 = System.currentTimeMillis() - startTime6;
		System.out.println(estimated_runningtime6);
	}
		
	public static void method1() {
		double[][][] a = new double [600][600][600];
		for (int i= 0; i<600; i++) {
			for (int j= 0; j<600; j++) {
				for (int k= 0; k<600; k++) {
					a[i][j][k]=a[i][j][k]+3;
				}
			}
		}
	}
	public static void method2() {
		double[][][] a = new double [600][600][600];
		for (int i= 0; i<600; i++) {
			for (int k= 0; k<600; k++) {
				for (int j= 0; j<600; j++) { 
					a[i][j][k]=a[i][j][k]+3;
				}
			}
		}
	}
	public static void method3() {
		double[][][] a = new double [600][600][600];
		for (int j= 0; j<600; j++) {
			for (int i= 0; i<600; i++) {
				for (int k= 0; k<600; k++) {
					a[i][j][k]=a[i][j][k]+3;
				}
			}
		}
	}
	public static void method4() {
		double[][][] a = new double [600][600][600];
		for (int j= 0; j<600; j++) {
			for (int k= 0; k<600; k++) {
				for (int i= 0; i<600; i++) {
					a[i][j][k]=a[i][j][k]+3;
				}
			}
		}
	}
	public static void method5() {
		double[][][] a = new double [600][600][600];
		for (int k= 0; k<600; k++) {
			for (int j= 0; j<600; j++) {
				for (int i= 0; i<600; i++) {
					a[i][j][k]=a[i][j][k]+3;
				}
			}
		}
	}
	public static void method6() {
		double[][][] a = new double [600][600][600];
		for (int k= 0; k<600; k++) {
			for (int i= 0; i<600; i++) {
				for (int j= 0; j<600; j++) {
					a[i][j][k]=a[i][j][k]+3;
				}
			}
		}
	}
	}