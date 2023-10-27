package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConexaoBanco {
    
    public static void main(String[] args) throws SQLException {
        // Configurações de conexão
        String url = "jdbc:mysql://localhost:3306/banco"; // URL do seu banco de dados
        String usuario = "root"; // Seu nome de usuário do MySQL
        String senha = "123456"; // Sua senha do MySQL
        
        Connection conn =null;

        // Tenta estabelecer a conexão
        try {
            conn = DriverManager.getConnection(url, usuario, senha);

            // Se chegou até aqui, a conexão foi bem-sucedida
            System.out.println("Conexão ao MySQL estabelecida com sucesso!");
            System.out.println("Realizando a consulta dos dados");
            String msg="";
            // Aqui você pode executar consultas SQL e outras operações no banco de dados
            String consultaSQL = "SELECT * FROM CLIENTE";
            Statement statement = conn.createStatement();
            ResultSet resultado = statement.executeQuery(consultaSQL);
            while (resultado.next()) {
                msg += "ID: " + resultado.getInt("id") + "\nNome: " + resultado.getString("nome") + "\nIdade: " + resultado.getInt("idade") + "\n";
            }
            JOptionPane.showMessageDialog(null, msg);
            // Exemplo de inserção (INSERT)
            String insercaoSQL = "INSERT INTO cliente (id, nome, idade) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(insercaoSQL);
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, "Carlos");
            preparedStatement.setString(3, "41");
            int linhasAfetadas = preparedStatement.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Inserção realizada com sucesso!");
            } else {
                System.out.println("A inserção falhou.");
            }
            // Não se esqueça de fechar a conexão quando terminar de usá-la
        } catch (SQLException e) {
            // Em caso de erro na conexão
            System.err.println("Erro na conexão com o MySQL: " + e.getMessage());
        } finally {
            conn.close();
        }
        
        /*
        import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaInsercaoMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/seubanco";
        String usuario = "seuusuario";
        String senha = "suasenha";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("Conexão ao MySQL estabelecida com sucesso!");

            // Exemplo de consulta (SELECT)
            String consultaSQL = "SELECT nome, email FROM tabela_exemplo";
            Statement statement = conexao.createStatement();
            ResultSet resultado = statement.executeQuery(consultaSQL);

            while (resultado.next()) {
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");
                System.out.println("Nome: " + nome + ", Email: " + email);
            }

            // Exemplo de inserção (INSERT)
            String insercaoSQL = "INSERT INTO tabela_exemplo (nome, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(insercaoSQL);
            preparedStatement.setString(1, "ExemploNome");
            preparedStatement.setString(2, "exemplo@email.com");
            int linhasAfetadas = preparedStatement.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Inserção realizada com sucesso!");
            } else {
                System.out.println("A inserção falhou.");
            }
        } catch (SQLException e) {
            System.err.println("Erro na conexão com o MySQL: " + e.getMessage());
        }
    }
}*/
    }
}
