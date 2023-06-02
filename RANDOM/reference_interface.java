package extra;
interface x{
	void y();
	int xl=43;
	
}
class c implements x{
	static int s=1;
	@Override
	public void y() {
		System.out.println("i m y  "+s);
		s++;
	}
}
public class reference_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
x d[]=new c[3];
for(int i=0;i<3;i++) {
	d[i]=new c();
	d[i].y();
}
	}

}
