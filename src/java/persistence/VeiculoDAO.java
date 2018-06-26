///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package persistence;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import model.Cliente;
//import model.Veiculo;
//
///**
// *
// * @author gsf
// */
//public class VeiculoDAO {
//
//    private static VeiculoDAO instance = new VeiculoDAO();
//
//    public static VeiculoDAO getInstance() {
//        return instance;
//    }
//
//    private VeiculoDAO() {
//    }
//
//    public void save(Veiculo veiculo, String estado) throws SQLException, ClassNotFoundException {
//        System.out.println("persistence.VeiculoDAO.save()");
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//            st.execute("INSERT INTO Veiculo(nomeVeiculo, id_Veiculo, tipoVeiculo, estadoVeiculo)"
//                    + "VALUES ('"
//                    + veiculo.getNomeVeiculo()
//                    + "', '"
//                    + veiculo.getId_Veiculo()
//                    + "', '"
//                    + veiculo.getTipoVeiculo()
//                    + "', '"
//                    + veiculo.getState()
//                    + "')");
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public void delete(Veiculo veiculo) throws SQLException, ClassNotFoundException {
//        System.out.println("persistence.VeiculoDAO.delete()");
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//            st.execute("DELETE FROM Veiculo WHERE id_Veiculo = " + veiculo.getId_Veiculo());
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public Veiculo getState(Veiculo veiculo) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        Veiculo veiculoResult = new Veiculo();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM Veiculo WHERE id_Veiculo = \""
//                    + veiculo.getId_Veiculo() + "\"");
//            while (rs.next()) {
//                veiculoResult.setState(rs.getString("estadoVeiculo"));
//            }
//
//            return veiculoResult;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public Veiculo get(Veiculo veiculo) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        Veiculo veiculoResult = new Veiculo();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM Veiculo AS f WHERE f.nomeVeiculo= \""
//                    + veiculo.getNomeVeiculo() + "\"");
//            while (rs.next()) {
//                veiculoResult.setId_Veiculo(Integer.parseInt(rs.getString("f.id_Veiculo")));
//                veiculoResult.setNomeVeiculo(rs.getString("f.nomeVeiculo"));
//                veiculoResult.setTipoVeiculo(rs.getString("f.tipoVeiculo"));
//                veiculoResult.setState(rs.getString("f.estadoVeiculo"));
//            }
//
//            return veiculoResult;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public List<Veiculo> getAll() throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//
//        List<Veiculo> veiculosList = new ArrayList<Veiculo>();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM Veiculo");
//
//            while (rs.next()) {
//                Veiculo veiculo = new Veiculo();
//                veiculo.setId_Veiculo(Integer.parseInt((rs.getString("veiculo.id_Veiculo"))));
//                veiculo.setNomeVeiculo(rs.getString("veiculo.nomeVeiculo"));
//                veiculo.setTipoVeiculo(rs.getString("veiculo.tipoVeiculo"));
//                veiculo.setState(rs.getString("veiculo.estadoVeiculo"));
//                veiculosList.add(veiculo);
//            }
//
//            return veiculosList;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public void editar(Veiculo veiculo) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            st.execute(
//                    "UPDATE Veiculo AS f"
//                    + " SET nomeVeiculo = '"
//                    + veiculo.getNomeVeiculo()
//                    + "' WHERE f.id_Veiculo = '"
//                    + veiculo.getId_Veiculo() + "'"
//            );
//
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public void state(Veiculo veiculo) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            st.execute(
//                    "UPDATE Veiculo AS f"
//                    + " SET estadoVeiculo = '"
//                    + veiculo.getVeiculoEstadoFromString()
//                    + "' WHERE f.id_Veiculo = '"
//                    + veiculo.getId_Veiculo() + "'"
//            );
//
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public void updateEstado(Veiculo veiculo) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        System.out.println("persistence.VeiculoDAO.updateEstado()" + veiculo.getState() + " " + veiculo.getId_Veiculo());
//
////        System.out.println("persistence.VeiculoDAO.updateEstado()");
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
////        System.out.println("persistence.VeiculoDAO.updateEstado() TRY " + veiculo.getVeiculoEstado().getEstado());
//            System.out.println("persistence.VeiculoDAO.updateEstado() TRY");
//            st.execute(
//                    "UPDATE Veiculo "
//                    + " SET estadoVeiculo = '"
//                    + veiculo.getState()
//                    + "' WHERE id_Veiculo = '"
//                    + veiculo.getId_Veiculo() + "'"
//            );
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public void closeResourcer(Connection conn, Statement st) {
//        try {
//            if (st != null) {
//                st.close();
//            }
//            if (conn != null) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//        }
//    }
//
//    public void updateMemento(Veiculo veiculo) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            st.execute(
//                    "UPDATE Funcionario AS f"
//                    + " SET memento = '"
//                    + veiculo.getMemento()
//                    + "'"
//                    + " WHERE f.id = '"
//                    + veiculo.getId_Veiculo() + "'"
//            );
//
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//}
