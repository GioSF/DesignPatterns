/*ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cozinha;
import persistence.CozinhaDAO;

/**
 *
 * @author gsf
 */
public class adicionarCozinhaAction implements Action {

    public adicionarCozinhaAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {

        String nomeCozinha = request.getParameter("nomeCozinha");
        Cozinha cozinha = new Cozinha("nomeCozinha");
        System.out.println("action.adicionarCozinhaAction.execute()");

        if (nomeCozinha.equals("")) {
            response.sendRedirect("return.jsp");
            System.out.println("IF action.adicionarCozinhaAction.execute()");
        } else {
            try {
            System.out.println("ELSE TRY action.adicionarCozinhaAction.execute()");
                CozinhaDAO.getInstance().save(cozinha);
                response.sendRedirect("return.jsp?type=suce&response=Gravado com sucesso!");
            } catch (ClassNotFoundException ex) {
                response.sendRedirect("return.jsp?type=erro&response=" + ex);
            } catch (SQLException ex) {
                response.sendRedirect("return.jsp?type=erro&response=" + ex);
            }
        }

    }

}
