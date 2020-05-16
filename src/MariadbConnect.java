import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	 
	public class MariadbConnect {
		String driver = "org.mariadb.jdbc.Driver";
		Connection conn;
		public void DBconn() {
		//드라이버 :// ip : 포트번호 / 데이터베이스 이름
		String url = "jdbc:mariadb://chanhyo.synology.me:3307/Op_Chanhyo";
		//계정명
		String user = "dongha";
		//패스워드
		String password = "!Himehime8207";
		try {
		Class.forName(driver);
		} catch (ClassNotFoundException e) {
		System.out.println("드라이버 로드 실패");
		e.printStackTrace();
		}
		try {
		conn = DriverManager.getConnection(url, user, password);
		if (conn != null) {
		System.out.println("DB접속 성공");
		}
		} catch (SQLException e) {
		System.out.println("DB접속 실패");
		e.printStackTrace();
		}
		}
		public static void main(String[] args) {
			MariadbConnect dbconn = new MariadbConnect();
		dbconn.DBconn();
		}
}