package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DAO {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url= "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "vini-java";
	private String password = "Vini5@J@v@";
	
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			System.out.println("Erro ao se conectar com o banco de dados: "+ e);
		}
		return con;
	}
	
	public void testConnection() {
		
		try {
			Connection con = this.conectar();
			System.out.println("Sucesso ao se conectar com o banco de dados: "+con);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Erro: "+ e);
		}
	}
	
	public void createContact(JavaBeans contato) {
		try {
			//conectando com o banco de dados
			Connection con = conectar();
			
			//criando a query
			String sql = "INSERT INTO contatos (nome,fone,email) VALUES(?,?,?)";
			
			//preparando a query
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, contato.getName());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			
			//executando a query
			pst.executeUpdate();
			
			//fechando a conexão com o banco
			con.close();	
			
		}catch(Exception e) {
			System.out.println("Erro ao se conectar com o banco de dados: "+e);
		}
	}

}
