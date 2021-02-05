
package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import app.dao.Produto;
import app.dao.ProdutoDAO;
import db.DBConnection;

public class ProducaoTematica
{

   public static void main(String[] args)
   {
      try
      {
         Connection connection = DBConnection.connectDB();

         ProdutoDAO productDAO = new ProdutoDAO(connection);

         List<Produto> produtos = productDAO.buscarTodosProdutos();

         produtos.stream().forEach( produto -> System.out.println(produto.toString()));

         DBConnection.closeConnection(connection);
      }
      catch (SQLException e)
      {
         e.printStackTrace();
      }

   }

}
