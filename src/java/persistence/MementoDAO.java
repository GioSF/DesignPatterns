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
//import model.Memento;
//import model.Veiculo;
//
///**
// *
// * @author gsf
// */
//public class MementoDAO {
//    
//        private static MementoDAO instance = new MementoDAO();
//
//    public static MementoDAO getInstance() {
//        return instance;
//    }
//
//    public void save(Memento memento) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//            st.execute("INSERT INTO Memento(id_Veiculo, estadoVeiculo)"
//                    + "VALUES ('"
//                    + memento.getId_Veiculo()
//                    + "', '"
//                    + memento.getState()
//                    + "')");
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public Memento get(Memento memento) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        Memento mementoResult = new Memento();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM Memento AS m WHERE m.id_Veiculo= \""
//                    + memento.getId_Veiculo()+ "\"");
//            while (rs.next()) {
//                mementoResult.setId_Veiculo(Integer.parseInt(rs.getString("m.id_Veiculo")));
//                mementoResult.setState(rs.getString("m.estadoVeiculo"));
//            }
//
//            return mementoResult;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public List<Memento> getAll() throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//
//        List<Memento> mementosList = new ArrayList<Memento>();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM Memento");
//
//            while (rs.next()) {
//                Memento memento = new Memento();
//                memento.setId_Veiculo(Integer.parseInt((rs.getString("memento.id_Veiculo"))));
//                memento.setState(rs.getString("memento.estadoVeiculo"));
//                mementosList.add(memento);
//            }
//
//            return mementosList;
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
//}
