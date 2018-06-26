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
//import model.Pedido;
//
///**
// *
// * @author gsf
// */
//public class PedidoDAO {
//
//    private static PedidoDAO instance = new PedidoDAO();
//
//    public static PedidoDAO getInstance() {
//        return instance;
//    }
//
//    private PedidoDAO() {
//    }
//
//    public void savePedido(int id_Pedido, int id_Cliente, String state, ) throws SQLException, ClassNotFoundException {
//        System.out.println("persistence.LocacaoDAO.save()" + id_Cliente + " " + id_Veiculo + " " + id_Funcionario);
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//            st.execute("INSERT INTO Locacao (id_Cliente, id_Veiculo, id_Funcionario, locacao)"
//                    + "VALUES ("
//                    + id_Cliente
//                    + ","
//                    + id_Veiculo
//                    + ","
//                    + id_Funcionario
//                    + ","
//                    + 1
//                    + ");");
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    public void saveDevolver(int id_Locacao) throws SQLException, ClassNotFoundException {
//        System.out.println("persistence.LocacaoDAO.saveLocacao()" + id_Locacao);
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//            st.execute("UPDATE Locacao set locacao=0 where id_Locacao="
//                    + id_Locacao
//                    + ";");
//            System.out.println("persistence.LocacaoDAO.saveDevolver()" + st.toString());
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
////    public void delete(Veiculo veiculo) throws SQLException, ClassNotFoundException {
////        Connection conn = null;
////        Statement st = null;
////        try {
////            conn = DatabaseLocator.getInstance().getConnection();
////            st = conn.createStatement();
////            st.execute("DELETE FROM Veiculo WHERE id_Veiculo = \"" + veiculo.getId_Veiculo()+ "\"");
////        } catch (SQLException e) {
////            throw e;
////        } finally {
////            closeResourcer(conn, st);
////        }
////    }
//
//    public Locacao get(Veiculo veiculo) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        Locacao locacaoResult = new Locacao();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM VeiculoCliente AS f WHERE id_Veiculo= \""
//                    + veiculo.getId_Veiculo()+ "\"");
//            while (rs.next()) {
//                locacaoResult.setId_Veiculo(Integer.parseInt(rs.getString("f.id_Veiculo")));
//                locacaoResult.setId_Cliente(Integer.parseInt(rs.getString("f.id_Cliente")));
////                veiculo.setEstado(rs.getString("f.estado"));
//                veiculo.setMemento(rs.getString("f.memento"));
//            }
//
//            return locacaoResult;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//    //CONCLUÍDO
//    //Motivo dos dois pŕoximos métodos:
//    //Ao alugar um veículo eu preciso saber seu state a partir do id_Veiculo. 
//    //Com o método getStateVeiculoComVeiculo eu consulto a disponibilidade e, havendo esta, a locação é concluída.
//    //Ao devolver um veículo, eu preciso alterar seu state a partir de do id_Locacao.
//    //Com o método getStateVeiculoComLocacao obtém-se qual o veículo desta locacao, seu state
//    //e, assim, atualzar o state do veículo e o boolean locacao de Locacao.
//    
//        public boolean getStateVeiculoComVeiculo(String id_Veiculo) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        boolean stateLocacao = false;
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//                ResultSet rs = st.executeQuery("SELECT * FROM Locacao where "
//                        + "id_Veiculo=" + id_Veiculo + " order by id_Locacao DESC limit 1");
//            while (rs.next()) {
//                stateLocacao = (rs.getBoolean("locacao"));
//            }
//            
//            System.out.println("persistence.LocacaoDAO.getStateVeiculoComVeiculo()" + stateLocacao);
//            
//            return stateLocacao;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//
//        public Veiculo getStateVeiculoComLocacao(String id_Locacao) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        boolean stateLocacao = false;
//        Veiculo veiculo = new Veiculo();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("select * from Locacao "
//                    + "join Veiculo where(Locacao.id_Veiculo=Veiculo.id_Veiculo) "
//                    + "and id_Locacao=\"" + id_Locacao + "\" order by Locacao.id_Veiculo DESC limit 1");
//            while (rs.next()) {
//                stateLocacao = (rs.getBoolean("locacao"));
//                veiculo.setState(rs.getString("estado"));
//                veiculo.setId_Veiculo(Integer.parseInt(rs.getString("id_Veiculo")));
//                veiculo.setNomeVeiculo(rs.getString("nomeVeiculo"));
//                veiculo.setTipoVeiculo(rs.getString("tipoVeiculo"));
//            }
//
//            return veiculo;
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            closeResourcer(conn, st);
//        }
//    }
//    
//    public List<Locacao> getAll() throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//
//        List<Locacao> locacoesList = new ArrayList<Locacao>();
//
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//
//            ResultSet rs = st.executeQuery("SELECT * FROM Locacao");
//
//            while (rs.next()) {
//                Locacao locacao = new Locacao();
//                locacao.setId_Locacao(Integer.parseInt(rs.getString("id_Locacao")));
//                locacao.setId_Cliente(Integer.parseInt((rs.getString("id_Cliente"))));
//                locacao.setId_Funcionario(Integer.parseInt(rs.getString("id_Cliente")));
//                locacao.setId_Veiculo(Integer.parseInt((rs.getString("id_Veiculo"))));
//                locacao.setLocacao(rs.getBoolean("locacao"));
//                locacoesList.add(locacao);
//            }
//
//            return locacoesList;
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