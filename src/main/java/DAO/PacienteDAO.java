/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/*import com.mycompany.mavenproject1.Controle.Conexao;
import com.mycompany.mavenproject1.Modelo.Paciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
/*public class PacienteDAO {
    
    public void CadastraUsuario(Paciente paciente){
        
        String sql = "INSET INTO paciente ("
                + "Nome,"
                + "Cpf,"
                + "Idade,"
                + "Email,"
                + "Telefone,"
                + "Cidade,"
                + "Obs,"
                + "Alergia,"
                + "Diabetes,"
                + "PreçcaoAlta,"
                + "PrecaoBaixa) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps = null;
        
        try{
             ps = Conexao.getConnection().prepareStatement(sql);
             ps.setString(1, paciente.getNome());
             ps.setString(2, paciente.getCPF());
             ps.setInt(3, paciente.getIdade());
             ps.setString(4, paciente.getEmails());
             ps.setString(5, paciente.getTele());
             ps.setString(6, paciente.getCidade());
             ps.setString(7, paciente.getObs());
             ps.setString(8, paciente.getAlerg());
             ps.setString(9, paciente.getDiabe());
             ps.setString(10, paciente.getPrecaoAlti());
             ps.setString(11, paciente.getPrecaoBaixa());
             
             System.out.println("Paciente ------------> " + paciente.toString());
           
             ps.execute();
             ps.close();
             
        }catch(SQLException e){
            System.out.println("Não foi possível cadastrar usuário: "+ e);
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("Não foi possível cadastrar usuário: "+ e);
        }
        
    }
}
*/