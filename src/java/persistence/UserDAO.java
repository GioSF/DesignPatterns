//package persistence;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import model.User;
//
///**
// *
// * @author Leoginski
// */
//public class UserDAO {
//
//    private static UserDAO instance = new UserDAO();
//
//    public static UserDAO getInstance() {
//        return instance;
//    }
//
//    private UserDAO() {
//    }
//
//    public void save(User user, String estado) throws SQLException, ClassNotFoundException {
//        System.out.println("persistence.UserDAO.save()");
//
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//            st.execute("INSERT INTO user(userName, password)"
//                    + "VALUES ('"
//                    + user.getUserName()
//                    + "', '"
//                    + user.getPassword()
//                    + "')");
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public void delete(User user) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//            st.execute("DELETE FROM user WHERE userName = \"" + user.getUserName() + "\"");
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public User get(User user) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        User userResult = new User();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM user AS f WHERE f.userName = \""
//                    + user.getUserName() + "\"");
//            while (rs.next()) {
//                userResult.setUserName(rs.getString("f.userName"));
//                userResult.setPassword(rs.getString("f.password"));
////                funcionario.setState(rs.getString("f.estado"));
////                funcionario.memento = rs.getString("f.memento");
//            }
//
//            return userResult;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public List<User> getAll() throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//
//        List<User> usersList = new ArrayList<User>();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM user AS f");
//
//            while (rs.next()) {
//                User user = new User();
//                user.setUserName(rs.getString("f.userName"));
//                user.setPassword(rs.getString("f.password"));
//                usersList.add(user);
//            }
//
//            return usersList;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
////
////    public void editar(Funcionario Funcionario) throws SQLException, ClassNotFoundException {
////        Connection conn = null;
////        Statement st = null;
////
////        try {
////            conn = DatabaseLocator.getInstance().getConnection();
////            st = conn.createStatement();
////
////            st.execute(
////                    "UPDATE Funcionario AS f"
////                    + " SET nome = '"
////                    + Funcionario.getNome()
////                    + "', nascimento = '"
////                    + Funcionario.getNascimento()
////                    + "', email = '"
////                    + Funcionario.getEmail()
////                    + "', tipo_logradouro = '"
////                    + Funcionario.getTipoLogradouro()
////                    + "', logradouro = '"
////                    + Funcionario.getLogradouro()
////                    + "', numero = '"
////                    + Funcionario.getNumero()
////                    + "', cep = '"
////                    + Funcionario.getCEP()
////                    + "', bairro = '"
////                    + Funcionario.getBairro()
////                    + "', cidade = '"
////                    + Funcionario.getCidade()
////                    + "', uf = '"
////                    + Funcionario.getUF()
////                    + "'"
////                    + " WHERE f.id = '"
////                    + Funcionario.getId() + "'"
////            );
////
////        } catch (SQLException e) {
////            throw e;
////        } finally {
////            closeResourcer(conn, st);
////        }
////    }
////
////    public void updateEstado(Funcionario funcionario) throws SQLException, ClassNotFoundException {
////        Connection conn = null;
////        Statement st = null;
////
////        try {
////            conn = DatabaseLocator.getInstance().getConnection();
////            st = conn.createStatement();
////
////            st.execute(
////                    "UPDATE Funcionario AS f"
////                    + " SET estado = '"
////                    + funcionario.getEstado().getEstado()
////                    + "', memento = '"
////                    + funcionario.getMemento()
////                    + "' WHERE f.id = '"
////                    + funcionario.getId() + "'"
////            );
////        } catch (SQLException e) {
////            throw e;
////        } finally {
////            closeResourcer(conn, st);
////        }
////    }
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
//}
