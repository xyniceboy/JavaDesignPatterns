import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
		//���ܿͻ��˵�����
		SaveToDB std = new SaveToDB();
		std.shuru();
		if(std.validate()) {
			std.getConnection();
			std.save();
		}
	}
}
