import java.util.Scanner;


public class SaveToDB {
	private String username;
	private String upassword;
	
	
	//��ÿͻ�������
	public void shuru() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���");
		username = scanner.nextLine();
		System.out.println("����������");
		upassword = scanner.nextLine();
	}
	
	//��������У��
	public boolean validate() {
		if(username == null || "".equals(username.trim())) {
			System.out.println("�û�������Ϊ��");
			return false;
		}
		if(upassword == null || "".equals(upassword.trim())) {
			System.out.println("���벻��Ϊ��");
			return false;
		}
		return true;
	}
	
	//�������ݿ�
	public void getConnection() {
		System.out.println("������ݿ�����");
	}
	
	//�������ݲ���
	public void save() {
		System.out.println("��" + username + "���浽�����ݿ�");
		System.out.println("��" + upassword + "���浽�����ݿ�");
	}
}
