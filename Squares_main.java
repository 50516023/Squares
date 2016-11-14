package squares;

public class Squares_main {

	public static void main(String[]args){
		//理論値：傾き0.9965
		//切片：0
	//double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
		double x[]= {0,3,7,9,15,22};
	//double y[] = { 1.0, 1.9, 3.2, 4.3, 4.8, 6.1, 7.2 };
		double y[]= {1,5,6,12,16,20};
	double theta[] = new double[2];
	Squares_lib slib = new Squares_lib(x,y);
	
	for(int i= 0;i<100;i++){
		theta = slib.getDx();
		System.out.println(i+":theta[0] ="+theta[0]);
		System.out.println(i+":theta[1] ="+theta[1]);
		System.out.println(i+":Objective function ="+slib.getRx());
	}

	}

}
