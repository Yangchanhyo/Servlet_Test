import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	 
	public class MariadbConnect {
		String driver = "org.mariadb.jdbc.Driver";
		Connection conn;
		public void DBconn() {
		//����̹� :// ip : ��Ʈ��ȣ / �����ͺ��̽� �̸�
		String url = "jdbc:mariadb://chanhyo.synology.me:3307/Op_Chanhyo";
		//������
		String user = "dongha";
		//�н�����
		String password = "!Himehime8207";
		try {
		Class.forName(driver);
		} catch (ClassNotFoundException e) {
		System.out.println("����̹� �ε� ����");
		e.printStackTrace();
		}
		try {
		conn = DriverManager.getConnection(url, user, password);
		if (conn != null) {
		System.out.println("DB���� ����");
		}
		} catch (SQLException e) {
		System.out.println("DB���� ����");
		e.printStackTrace();
		}
		}
		public static void main(String[] args) {
			MariadbConnect dbconn = new MariadbConnect();
		dbconn.DBconn();
		}
}