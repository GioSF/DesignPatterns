/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cozinha;

/**
 *
 * @author gsf
 */
public class CozinhaDAO {

    private static CozinhaDAO instance = new CozinhaDAO();

    public static CozinhaDAO getInstance() {
        return instance;
    }

    private CozinhaDAO() {
    }

    public void save(Cozinha cozinha, String estado) throws SQLException, ClassNotFoundException {
        System.out.println("persistence.CozinhaDAO.save()");
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("INSERT INTO Cozinha(id_Cozinha, nomeCozinha)"
                    + "VALUES ('"
                    + cozinha.getId_Cozinha()
                    + "', '"
                    + cozinha.getNomeCozinha()
                    + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void delete(Cozinha cozinha) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("DELETE FROM Cozinha WHERE id_Cozinha = \"" + cozinha.getId_Cozinha()+ "\"");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public Cozinha get(Cozinha cozinha) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Cozinha cozinhaResult = new Cozinha();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Cozinha AS c WHERE c.nomeCozinha = \""
                    + cozinha.getNomeCozinha()+ "\"");
            while (rs.next()) {
                cozinhaResult.setId_Cozinha(Integer.parseInt(rs.getString("c.id_Cozinha")));
                cozinhaResult.setNomeCozinha(rs.getString("c.nomeCozinha"));
//                funcionario.setState(rs.getString("f.estado"));
//                funcionario.memento = rs.getString("f.memento");
            }

            return cozinhaResult;
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public List<Cozinha> getAll() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;

        List<Cozinha> cozinhasList = new ArrayList<Cozinha>();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Cozinha AS c");

            while (rs.next()) {
                Cozinha cozinha = new Cozinha();
                cozinha.setNomeCozinha(rs.getString("c.nomeCozinha"));
                cozinha.setId_Cozinha(Integer.parseInt((rs.getString("c.id_Cozinha"))));
                cozinhasList.add(cozinha);
            }

            return cozinhasList;
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void editar(Cozinha cozinha) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            st.execute(
                    "UPDATE Cozinha AS c"
                    + " SET nomeCozinha ='"
                    + cozinha.getNomeCozinha()
                    + "' WHERE c.id_Cozinha = '"
                    + cozinha.getId_Cozinha()+ "'"
            );

        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }
//
//    public void updateEstado(Funcionario funcionario) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            st.execute(
//                    "UPDATE Funcionario AS f"
//                    + " SET estado = '"
//                    + funcionario.getEstado().getEstado()
//                    + "', memento = '"
//                    + funcionario.getMemento()
//                    + "' WHERE f.id = '"
//                    + funcionario.getId() + "'"
//            );
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }

    public void closeResourcer(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
        }
    }
}
