package �ڵ���Ŭ������ӿ���;

/*
 * �¿���(PassenserCar)Ŭ���� => �ڽ�(����) Ŭ���� ���� 
 */
public class PassenserCar extends Car{ //�ڽ�Ŭ���� �̸� extends �θ�Ŭ�����̸� 

	//[�߿�] ������ ������ �Ѱ��� ��� =>�޼ҵ� �������̵�
	/*
	 * �޼ҵ� �������̵��̶�? =>"���"������ ��� �θ� Ŭ������ �޼ҵ��̸��� 
	 *                   �ڽ� Ŭ������ �޼ҵ� �̸��� ������ 
	 */
	public void speedUp(int velocity) {
		speed = speed  + velocity;
		//�ӵ��� ������ �д�. 
		if(speed >100) { //��ӵ��� ��μ��̶� ��������
			speed = 100;
		}
		
	}
	public static void main(String[] args) {
		
	    PassenserCar myCar = new PassenserCar();
	    myCar.speedUp(130);
	    System.out.println("PassenserCar speed is "+ myCar.speed);
	    //PassenserCar speed is 100 ��µ�
	}

}
