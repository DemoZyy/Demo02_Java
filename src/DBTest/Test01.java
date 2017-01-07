package DBTest;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;




public class Test01 {
	/**Jdbc 连接 Oracle 数据库 简单示例
	 *@author zyy
	 *类说明
	 */
	//JDBC数据库连接步骤
	//首先要加载JDBC驱动程序，识别加载的驱动程序，然后进行数据库的操作，并将结果放置到结果集中，对结果集进行遍历，最后要关闭数据库的连接
	//1、使用Class.forName()方法来加载程序中的JDBC驱动程序
	//2、在程序加载完成JDBC驱动之后，DriverManager就会去识别所加载的驱动程序，并调用getConnection（）方法来连接数据库
	//3、使用getConnection（）方法获取Connection对象之后，就可以创建一个Statement对象对数据库进行操作
	//4、返回一个结果集，通过执行Statement对象的executeQuery（）方法来返回Resultset结果集对象，最后对结果集进行遍历
	//5、关闭数据库的连接
	public static void main(String[] args){
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:Oracle:thin:@10.163.91.91:1521:pomsdg2";
		String sql="select * from T_BANCA_PRODUCT_SELL_CTL t where t.product_code='LA032'";
		ResultSet res=null;
		Connection conn=null;
		Statement stmt=null;
		try{
			 //加载Oracle的驱动类 
			Class.forName(driver);
			//连接Oracle数据库
			conn=DriverManager.getConnection(url, "gelc_prod","gelc_prod");
			//要执行SQL语句，必须获得java.sql.Statement实例
			stmt=conn.createStatement();
			res=stmt.executeQuery(sql);
			while(res.next()){
				String bankID=res.getString("BANK_ID");
				String sellChannel=res.getString("SELL_CHANNEL");
				System.out.println(bankID+" "+sellChannel);
			}
            // 关闭记录集 
            if (res != null) { 
                try { 
                	res.close(); 
                } catch (SQLException e) { 
                    e.printStackTrace(); 
                } 
            } 
  
            // 关闭声明 
            if (stmt != null) { 
                try { 
                	stmt.close(); 
                } catch (SQLException e) { 
                    e.printStackTrace(); 
                } 
            } 
  
            // 关闭链接对象 
            if (conn != null) { 
                try { 
                    conn.close(); 
                } catch (SQLException e) { 
                    e.printStackTrace(); 
                } 
            }
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}


}
