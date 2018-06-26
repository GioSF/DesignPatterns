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
import model.Comida;

/**
 *
 * @author gsf
 */
public class ComidaDAO {

    private static ComidaDAO instance = new ComidaDAO();

    public static ComidaDAO getInstance() {
        return instance;
    }

    private ComidaDAO() {
    }

    public void save(Comida comida) throws SQLException, ClassNotFoundException {
        System.out.println("persistence.ComidaDAO.save()");
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("INSERT INTO Comida(id_Comida, nomeComida, valorComida)"
                    + "VALUES ('"
                    + comida.getId_Comida()
                    + "', '"
                    + comida.getNomeComida()
                    + "', '"
                    + comida.getValorComida()
                    + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void delete(Comida comida) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("DELETE FROM Comida WHERE id_Comida = \"" + comida.getId_Comida()+ "\"");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public Comida get(Comida comida) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Comida comidaResult = new Comida();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Comida AS c WHERE c.nomeComida = \""
                    + comida.getNomeComida()+ "\"");
            while (rs.next()) {
                comidaResult.setId_Comida(Integer.parseInt(rs.getString("c.id_Comida")));
                comidaResult.setNomeComida(rs.getString("c.nomeComida"));
                comidaResult.setValorComida(Float.parseFloat(rs.getString("c.valorComida")));
//                funcionario.setState(rs.getString("f.estado"));
//                funcionario.memento = rs.getString("f.memento");
            }

            return comidaResult;
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public List<Comida> getAll() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;

        List<Comida> comidasList = new ArrayList<Comida>();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Comida AS c");

            while (rs.next()) {
                Comida comida = new Comida();
                comida.setId_Comida(Integer.parseInt(rs.getString("c.id_Comida")));
                comida.setNomeComida(rs.getString("c.nomeComida"));
                comida.setValorComida(Float.parseFloat(rs.getString("c.valorComida")));
                comidasList.add(comida);
            }

            return comidasList;
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResourcer(conn, st);
        }
    }

    public void editar(Comida comida) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            st.execute(
                    "UPDATE Comida AS c"
                    + " SET nomeComida = '"
                    + comida.getNomeComida()
                    + "' WHERE c.id_Comida = '"
                    + comida.getId_Comida()+ "'"
                    + "' WHERE c.valorcomida = '"
                    + comida.getValorComida()+ "'"
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
