
public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carp15 car1;
		car1 = new Carp15();
		
		int number = 1234;
		double gasline = 20.5;
		car1.setNumGas(number, gasline);
	}

}
class Carp15
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",將汽油量設為"+gas);
	}
	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
